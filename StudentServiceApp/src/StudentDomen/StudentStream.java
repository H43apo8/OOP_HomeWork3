package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//класс StudentStream содержит список учебных групп (StudentGroup). 
//Класс StudentStream имплементирует интерфейс Iterable, что позволяет использовать его в цикле for-each.
public class StudentStream implements Iterable<StudentGroup> {
    private int streamNumber;
    private List<StudentGroup> groups;

    public StudentStream(int streamNumber) {
        this.streamNumber = streamNumber;
        this.groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        this.groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
//В методе main создается экземпляр класса StudentStream и добавляются две учебные группы. 
//Затем происходит вывод списка студентов каждой группы на консоль.
    public static void main(String[] args) {
        StudentStream stream = new StudentStream(1);

        StudentGroup group1 = new StudentGroup("Group 1");
        group1.addStudent(new Student("Сергей", "Иванов"));
        group1.addStudent(new Student("Андрей", "Сидоров"));

        StudentGroup group2 = new StudentGroup("Group 2");
        group2.addStudent(new Student("Игорь", "Иванов"));
        group2.addStudent(new Student("Иван", "Петров"));

        stream.addGroup(group1);
        stream.addGroup(group2);

        for (StudentGroup group : stream) {
            System.out.println(group.getName() + ":");
            for (Student student : group.getStudents()) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
            System.out.println();
        }
    }
}