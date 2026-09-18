package execution;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("student course and management system");
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Student ID =");
        while (!sc.hasNextInt()){
            System.out.println("Invalid input");
            sc.next();
        }
        int studentId = sc.nextInt();

while (studentId <= 0) {
    System.out.println("Student ID must be greater than 0.");
    System.out.print("Enter Student ID = ");
    studentId = sc.nextInt();
}

sc.nextLine();

        System.out.print("Enter Name =");
        String name = sc.nextLine();

        System.out.print("Enter Email =");
        String email = sc.nextLine();
        
        System.out.print("Enter phone =");
        String phone = sc.nextLine();

        Student student1 = new Student(studentId,name,email,phone);
        StudentManager studentManager = new StudentManager();
             studentManager.addStudent(student1);

             
             studentManager.displayStudents();

              System.out.print("Enter Student ID to search: ");
int searchStudentId = sc.nextInt();

Student searchedStudent = studentManager.findStudent(searchStudentId);

if (searchedStudent != null) {
    System.out.println("Student found:");
    searchedStudent.displayStudent();
} else {
    System.out.println("Student not found.");
}




             FileManager fileManager = new FileManager();
             fileManager.saveStudent(student1);

       
        System.out.println("---------STUDENT DETAILS------------");
        
        
        System.out.println("entre course ID :");
        while (!sc.hasNextInt()){
            System.out.println("Invalid input");
            sc.next();
        }
        int courseId = sc.nextInt();

while (courseId <= 0) {
    System.out.println("Course ID must be greater than 0.");
    System.out.print("Enter Course ID = ");
    courseId = sc.nextInt();
}

sc.nextLine();

        System.out.println("entre course Name :");
        String courseName = sc.nextLine();
        

        System.out.println("Enter credits :");

while (!sc.hasNextInt()) {
    System.out.println("Invalid input");
    sc.next();
}

int credits = sc.nextInt();

while (credits <= 0) {
    System.out.println("Credits must be greater than 0.");
    System.out.println("Enter credits :");
    credits = sc.nextInt();
}

        
System.out.println("---------COURSE DETAILS------------");
 Course course1 = new Course( courseId, courseName, credits);
        CourseManager courseManager = new CourseManager();


        courseManager.addCourse(course1);

       


        courseManager.displayCourses();

              System.out.print("Enter Course ID to search: ");
int searchCourseId = sc.nextInt();

Course searchedCourse = courseManager.findCourse(searchCourseId);

if (searchedCourse != null) {
    System.out.println("Course found:");
    searchedCourse.displayCourse();
} else {
    System.out.println("Course not found.");
}



        fileManager.saveCourse(course1);
        System.out.print("Enter Enrollment ID = ");

while (!sc.hasNextInt()) {
System.out.println("Invalid input");
sc.next();
}

int enrollmentId = sc.nextInt();

while (enrollmentId <= 0) {
System.out.println("Enrollment ID must be greater than 0.");
System.out.print("Enter Enrollment ID = ");
enrollmentId = sc.nextInt();
}

        Enrollment enrollment1 = new Enrollment(enrollmentId, student1, course1);

         fileManager.saveEnrollment(enrollment1);


 System.out.println("----------ENROLLMENT DETAILS-----------");
        enrollment1.displayEnrollment();

        System.out.println("/////---------GRADE DETAILS------------//////");
        
        
        System.out.print("entre Grade ID = :");
        while (!sc.hasNextInt()){
            System.out.println("Invalid input");
            sc.next();


        
    }
        int gradeId = sc.nextInt();

while (gradeId <= 0) {
    System.out.println("Grade ID must be greater than 0.");
    System.out.print("Enter Grade ID = ");
    gradeId = sc.nextInt();
}
        System.out.print("Enter Grade (A-E):");
        String grade =sc.next().toUpperCase();

        

            while(!grade.equals("A")&& 
                  !grade.equals("B")&&
                  !grade.equals("C")&&
                  !grade.equals("D")&&
                  !grade.equals("E")){
                System.out.println(("invalid grade"));
        
        System.out.println("Enter Grade (A-E):");
        grade =sc.next().toUpperCase();

                  }
        
Grade grade1 = new Grade(gradeId, enrollment1, grade);

fileManager.saveGrade(grade1);
                  
       grade1.displayGrade();
        
      System.out.println("Grade point :" + grade1.getGradePoint());

ArrayList<Grade> grades =new ArrayList<>();
grades.add(grade1);
AcademicReport report = new AcademicReport(student1, grades);


report.displayReport();


        sc.close();
}

}