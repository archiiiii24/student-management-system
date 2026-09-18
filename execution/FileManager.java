package execution;

import java.io.FileWriter;

import java.io.IOException;

public class FileManager {

    public void saveStudent(Student student) {

        try {
            FileWriter writer = new FileWriter("data/students.txt", true);

            writer.write(student.getStudentId() + ", " +

                         student.getName() + ", " +

                         student.getEmail() + ", " +

                         student.getPhone() + "\n");

            writer.close();

        } 
        catch (IOException e)
         {
            System.out.println("Error");
        }
    }

    public void saveCourse(Course course) {

        try {
            FileWriter writer = new FileWriter("data/courses.txt", true);

            writer.write(course.getCourseId() + ", " +

                         course.getCourseName() + ", " +

                         course.getCredits() + "\n");

            writer.close();

        } 
        catch (IOException e)
         {
            System.out.println("Error for course.");
        }
    }
    public void saveEnrollment(Enrollment enrollment) {

    try {
        FileWriter writer = new FileWriter("data/enrollment.txt", true);

        writer.write(enrollment.getStudentName() + ", "
                + enrollment.getCourseName() + ", "
                + enrollment.getCredits() +","
                + enrollment.getCredits()+ "\n");

        writer.close();

    } catch (IOException e) {
        System.out.println("Error while saving enrollment.");
    }
}

public void saveGrade(Grade grade) {

        try {
            FileWriter writer = new FileWriter("data/grades.txt", true);

            writer.write(grade.getGradeId() + ","+
                grade.getCourseName() + ", "
                    + grade.getCredits() + ", "
                    + grade.getGradePoint() + "\n");

            writer.close();

        } catch (IOException e) {
            System.out.println("Error while saving grade.");
        }

    }

}
