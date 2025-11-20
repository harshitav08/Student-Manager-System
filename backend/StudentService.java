import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, String roll, String course) {
        students.add(new Student(name, roll, course));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student searchByRoll(String roll) {
        for (Student s : students) {
            if (s.roll.equals(roll)) return s;
        }
        return null;
    }

    public boolean deleteByRoll(String roll) {
        return students.removeIf(s -> s.roll.equals(roll));
    }
}

class Student {
    String name;
    String roll;
    String course;

    Student(String name, String roll, String course) {
        this.name = name;
        this.roll = roll;
        this.course = course;
    }
}
