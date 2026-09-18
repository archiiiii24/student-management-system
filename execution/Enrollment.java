package execution;
public class Enrollment {
    private int enrollmentId;
    private Student student;
    private Course course;
    

     public Enrollment(int enrollmentId, Student student, Course course){
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
     }
     public void displayEnrollment(){
        System.out.println("Enrollment ID :"+ enrollmentId);
        System.out.println("Student : " + student.getName());
        System.out.println("Course  :"+ course.getCourseName());
        
     }
     public int getEnrollmentId() {
    return enrollmentId;
}
        public String getStudentName(){
         return student.getName();
        }
        public String getCourseName(){
         return course.getCourseName();
        }
        public int getCredits() {
        return course.getCredits();
        }

     }
