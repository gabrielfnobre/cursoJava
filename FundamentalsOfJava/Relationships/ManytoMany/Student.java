package Relationships.ManytoMany;
import java.util.ArrayList;

//Note como a implementação de N:N foi feita nessa classe...

public class Student {

    String name;    //Nosso objeto recebe um nome que servirá para identificá-lo
    ArrayList<Course> courses = new ArrayList<>();  //Um ArrayList para guardar muitos objetos para
                                                    //um único objeto dessa classe...

    Student(String name){
        this.name = name;
    }

    void addCourse(Course course){  //Esse é o método que usamos para atribuír novos objetos a
        this.courses.add(course);   //classe Courses, note que ele recebe um objeto de course
        course.students.add(this);  //esse objeto não só cria novas instâncias em Course como
    }                               //também usa o "this" para referenciar um objeto de
                                    //Student lá na classe Course. Isso que faz com que a classe
                                    //Course entenda que aqueles muitos objetos instaciados á
                                    //ela pertencem a um único objeto de Student...

    void showMeCoursesThatStudent(){            //Esse método mostrará somente os objetos dependentes
        for(Course course: this.courses){       //que pertencem ao objeto em questão graças ao "this"...
            System.out.println(course.name);
        }
    }
}
