package execution;
import java.util.ArrayList;




public class StudentManager {
    private ArrayList <Student> students = new ArrayList<>();



public void addStudent(Student student) {

students.add(student);

}



public void displayStudents() {

for (Student student : students) {

student.displayStudent();

System.out.println("-------------------------------");

}

}
public Student findStudent(int studentId) {

    for (Student student : students) {

        if (student.getStudentId() == studentId) {
            return student;
        }
    }

    return null;
}


}

