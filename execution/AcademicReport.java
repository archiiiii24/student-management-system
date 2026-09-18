package execution;
import java.util.ArrayList;
public class AcademicReport {
    private Student student;
    private ArrayList<Grade> grades;
    public AcademicReport(Student student, ArrayList<Grade> grades){
        this.student = student;
        this.grades = grades;
    }
    public double calculateGPA(){
       double  totalPoints = 0;
        int  totalCredits = 0;
        for (Grade grade : grades) {
            totalPoints += grade.calculateWeightedPoints();
            totalCredits += grade.getCredits();
        }
        if (totalCredits == 0) {
            return 0;
        }
        return totalPoints / totalCredits;
    }
    public void displayReport(){
        System.out.println();
        System.out.println("-----------ACADEMIC REPORT---------");
        System.out.println("student ID :" + student.getStudentId() );
        System.out.println("Name :" + student.getName());
        for (Grade grade : grades){
        System.out.println();
        System.out.println("Course :" + grade.getCourseName());
        System.out.println("Grade Point: " + grade.getGradePoint()  );
        System.out.println("Credits : " + grade.getCredits() );
        }
        System.out.println("----------------------------");
    System.out.println("final GPA :" + calculateGPA());
    System.out.println("------------------------------");
    }
    }

