package StudentDomen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Класс StudentGroup содержит список студентов (Student)
class StudentGroup {
    private String name;
    private List<Student> students;

    public StudentGroup(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }
}
