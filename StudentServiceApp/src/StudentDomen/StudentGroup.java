package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Comparable<StudentGroup>, Iterable<Student> {

    private String name;
    private List<Student> students;

    public StudentGroup(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(students.size(), o.students.size());
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }

    public String getName() {
        return name;
    }

}

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        StudentStream stream = new StudentStream(1);

        StudentGroup group1 = new StudentGroup("Group 1");
        group1.addStudent(new Student("Student 1"));
        group1.addStudent(new Student("Student 2"));

        StudentGroup group2 = new StudentGroup("Group 2");
        group2.addStudent(new Student("Student 3"));
        group2.addStudent(new Student("Student 4"));
        group2.addStudent(new Student("Student 5"));

        stream.addGroup(group1);
        stream.addGroup(group2);

        Collections.sort(stream);

        for (StudentGroup group : stream) {
            System.out.println("Group: " + group.getName() + " (" + group.students.size() + " students)");
            for (Student student : group) {
                System.out.println(" - " + student.getName());
            }
        }
    }

}