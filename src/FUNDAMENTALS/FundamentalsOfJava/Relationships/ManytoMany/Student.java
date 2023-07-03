package FUNDAMENTALS.FundamentalsOfJava.Relationships.ManytoMany;
import java.util.ArrayList;

public class Student {

    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name){
        this.name = name;
    }

    void addCourse(Course course){
        this.courses.add(course);
        course.students.add(this);
    }

    void showMeCoursesThatStudent(){
        for(Course course: this.courses){
            System.out.println(course.name);
        }
    }
}
