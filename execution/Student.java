package execution;

public class Student {
   private int studentId;
   private String name; 
   private String email;
   private String phone;
   
   public Student(int studentId,String name,String email,String phone){
    this.studentId = studentId;
    this.name = name;
    this.email = email;
    this.phone = phone;

   }
   
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
        public int getStudentId() {
    return studentId;
}
    
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void displayStudent() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        



    }
}


