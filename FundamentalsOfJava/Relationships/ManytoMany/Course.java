package Relationships.ManytoMany;
import java.util.ArrayList;

//Note como a implementação de N:N foi feita nessa classe...

public class Course {

    String name;    //Nosso objeto recebe um nome que servirá para identificá-lo
    ArrayList<Student> students = new ArrayList<>();    //Um ArrayList para guardar muitos objetos para
                                                        //um único objeto dessa classe...

    Course(String name){
        this.name = name;
    }

    void addStudent(Student student){   //Esse é o método que usamos para atribuír novos objetos a
        this.students.add(student);     //classe Students, note que ele recebe um objeto de student,
        student.courses.add(this);      //esse objeto não só cria novas instâncias em Student como
    }                                   //também usa o "this" para referenciar um objeto de
                                        //Course lá na classe Student. Isso que faz com que a classe
                                        //Student entenda que aqueles muitos objetos instaciados á
                                        //ela pertencem a um único objeto de Course...

    void showMeStudentsThatCourse(){                //Esse método mostrará somente os objetos dependentes
        for(Student student: this.students){        //que pertencem ao objeto em questão graças ao "this"...
            System.out.println(student.name);
        }
    }

}
