package FUNDAMENTALS.FundamentalsOfJava.Relationships.ManytoMany;

//  RELAÇÃO MUITOS PARA MUITOS (N:N):

/*  Esta é uma relação onde muitos objetos podem conter dependências de muitos objetos por exemplo:
*   Muitos alunos podem fazer muitos cursos de uma escola, assim com muitos cursos podem ter
*   vários alunos.
*
*   Essa é a relação que chamamos de muitos para muitos. Essa relação precisa ser bidirecional para
*   dar certo a relação. Por exemplo: um mesmo curso de "javascript" terá que referenciar a
*   determinados alunos, enquanto esses alunos deverão também refenciar ao curso de "javascript"
*   enquanto referenciam a outros cursos que fazem.
*
*   Veja abaixo um exemplo onde temos 3 alunos e 3 cursos diferentes. Note que, ao mesmo tempo
*   que delegamos alunos para os cursos, automaticamente os cursos também referenciarão os alunos.
*   Veja como a relação é criada nas classes "Student" e "Course" para entender como implementar
*   isso no java...
*/
public class StudentsByCourse {
    public static void main(String[] args) {

        Student student1 = new Student("Rafael");
        Student student2 = new Student("Gustof");
        Student student3 = new Student("Michael");

        Course course1 = new Course("Java");
        Course course2 = new Course("Javascript");
        Course course3 = new Course("Python");

        student1.addCourse(course1);
        student1.addCourse(course3);

        student2.addCourse(course2);
        student2.addCourse(course1);

        course1.addStudent(student3);
        course2.addStudent(student3);
        course3.addStudent(student3);

        student1.showMeCoursesThatStudent();
        System.out.println();

        course2.showMeStudentsThatCourse();
        System.out.println();

        student3.showMeCoursesThatStudent();
        System.out.println();

        course1.showMeStudentsThatCourse();

    }
}
