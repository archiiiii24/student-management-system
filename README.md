Student Course & Academic Management System

📌 1. Project Overview

The Student Course & Academic Management System is a Java command-line application created to manage a simple academic information set in an organized manner.

The application enables the user to manage students, courses, enrollment, and grades. This application also generates an academic report and calculates the students’ GPA based on the course’s credit and grade point.

▶️ 2. Features

▶️Student Management

Add student details
Display student information
Search student by Student ID
Validate Student ID

▶️ Course Management

Add course details
Display course information
Search course by Course ID
Validate Course ID and credits

▶️ Enrollment Management

Records student enrollment in a course
Display enrollment details
Validate Enrollment ID

▶️ Academic Performance

Records grade from A to E
Converts grades to grade points
Calculates weighted grade points

Generates academic report

Calculates final GPA

▶️ File Storage

The application stores records in a text-file:
`students.txt`
`courses.txt`

`enrollment.txt`
`grades.txt`


⚙️3. Technologies

Programming Language: Java
Development Environment: Visual Studio Code
Storage: Text files
Version Control: Git and GitHub
Input: Java Scanner
File Handling: FileWriter

📂 4. Project Structure


student management system
│
├── execution
│  ├── Main.java
│  ├── Student.java
│  ├── Course.java
│  ├── Enrollment.java
│  ├── Grade.java
│  ├── AcademicReport.java
│  ├── StudentManager.java
│  ├── CourseManager.java
│  └── FileManager.java
│
├── data
│  ├── students.txt
│  ├── courses.txt
│  ├── enrollment.txt
│  └── grades.txt
│
├── docs
│
├── screenshots
│
├── README.md
└── statement.md

# 5. Modules
🛠️ Module 1: Student Management
This module deals with student registration, display student information, and search student by Student ID.
🛠️ Module 2: Course & Enrollment Management
This module deals with course management and records student enrollment in a course.
🛠️ Module 3: Academic Performance Management
This module deals with the records of grades, calculation of weighted grade points, generating academic reports, and GPA calculation.
📚 6. Workflow

Student Details
↓
Course Details
↓
Enrollment
↓
Grade
↓
Academic Report
↓
GPA Calculation

# 7. Requirements
Java JDK installed
Visual Studio Code or supported Java IDE
Git (version control)

# 8. Execution
### Step 1: Open the project
Launch Visual Studio Code and open the `student management system` folder.

### Step 2: Compile the project
Launch the terminal in the project root directory and execute the following command:
```powershell
javac execution\Main.java execution\Student.java execution\Course.java execution\Enrollment.java execution\Grade.java execution\AcademicReport.java execution\StudentManager.java execution\CourseManager.java execution\FileManager.java
```
### Step 3: Run the application
The following command launches the application:
```powershell
java execution.Main
```
### Step 4: Provide the required information
The application prompts for the following information:
Student ID
Student name
Email
Phone number
Course ID
Course name
Credits
Enrollment ID
Grade ID
Grade
The application now displays an academic report and calculates the final GPA.

# 9. Validation
The application does the following level of validation:
Student ID
Course ID
Enrollment ID
Grade ID
Course credits
Grades (A-E)
Invalid numeric values are rejected, and grades should only be from A to E.

# 10. File Storage
Student information, course, enrollment, and grade are stored in a text file within the `data` folder. The application uses the Java file handling feature to append new records to the specified text file.

# 11. Testing
The application was tested with the following:
Valid student information
Valid course information
Student search
Course search
Student enrollment
Grade record
GPA calculation
Invalid IDs
Invalid course credits
Invalid grade input
Text-file storage

🚀12. Future Enhancement


Some of the future enhancement of this application could include the following:
Update and delete student records
Multiple course per student
Multiple grade in the academic report
Graphical User Interface (GUI)
Database
Login and user authentication
Downloadable academic report


👩‍🎓 13. Author


Name: Archita Singh Registration No: 25BAI11553 Course: Programming in JAVA


