package execution;

public class Grade {
    private int gradeId;
    private Enrollment enrollment;
    private String grade;

    public Grade(int gradeId, Enrollment enrollment, String grade){
        this.gradeId = gradeId;
        this.enrollment = enrollment;
        this.grade = grade;
       
    }
    public String getCourseName() {
    return enrollment.getCourseName();
    }
     public void displayGrade() {

        System.out.println("Grade Id :" + gradeId);
        System.out.println("student:" + enrollment.getStudentName());
        System.out.println("course :" + enrollment.getCourseName());
        System.out.println("grade :" + grade);
     }
        public double getGradePoint(){
            if(grade.equalsIgnoreCase("A")){
                return 10;

            }
            else if (grade.equalsIgnoreCase("B")){
                return 8;

            }
        
            else if (grade.equalsIgnoreCase("C")){
                 return 6;
            }
    
            else if (grade.equalsIgnoreCase("D")){
                 return 5;
            }
            
            else if (grade.equalsIgnoreCase("E")){
                 return 4;
            }
            else{
                return 0;
            }
        }
            public double calculateWeightedPoints() {
                return getGradePoint() * enrollment.getCredits();
            }
            public int getCredits(){
                return enrollment.getCredits();
            }
            public int getGradeId() {
                return gradeId;
              }
            

     }
