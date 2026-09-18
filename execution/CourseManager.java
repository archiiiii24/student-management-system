package execution;

import java.util.ArrayList;

public class CourseManager {

private ArrayList<Course> courses = new ArrayList<>();

public void addCourse(Course course) {
courses.add(course);
}

public void displayCourses() {
for (Course course : courses) {
course.displayCourse();
System.out.println("----------------------");
}
}
public Course findCourse(int courseId){
    for (Course course : courses){
       if (course.getCourseId() == courseId){
            return course;
        }
    }
    return null;

}
}
