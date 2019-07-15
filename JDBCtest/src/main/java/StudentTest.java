import Bean.Student;
import Controller.StudentService;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("jdbc学生", 18, "女", 3);
        StudentService sc = new StudentService();
//        sc.insertStudent(student);
        sc.showStudent("jdbc学生");
        sc.deleteStudent("jdbc学生");
    }
}
