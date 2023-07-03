package FUNDAMENTALS.FundamentalsOfJava.Relationships.ManytoMany;
import java.util.ArrayList;

public class Course {

    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name){
        this.name = name;
    }

    void addStudent(Student student){
        this.students.add(student);
        student.courses.add(this);
    }

    void showMeStudentsThatCourse(){
        for(Student student: this.students){
            System.out.println(student.name);
        }
    }

}
