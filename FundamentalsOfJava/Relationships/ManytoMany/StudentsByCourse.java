package Relationships.ManytoMany;

//  RELAÇÃO MUITOS PARA MUITOS (N:N):

/*  Esta é uma relação onde muitos objetos podem conter dependências de muitos objetos por exemplo:
*   Muitos alunos podem fazer muitos cursos de uma escola, assim com muitos cursos podem ter
*   vários alunos.
*
*   Essa é a relação que chamamos de muitos para muitos. Essa relação precisa ser bidimensional para
*   fazer efeito. Por exemplo: um mesmo curso de "javascript" terá que referenciar a determinados
*   alunos, enquanto esses alunos deverão também refenciar ao curso de "javascript" ao mesmo tempo
*   que referenciam a outros cursos que fazem.
*
*   Veja abaixo:
*       Um exemplo onde temos 3 alunos e 3 cursos diferentes. Note que, ao mesmo tempo que
*   delegamos alunos para os cursos, automaticamente os cursos também referenciarão aos alunos.
*   Veja como a relação é criada nas classes "Student" e "Course" para entender como implementar
*   isso no java...
*/
public class StudentsByCourse {
    public static void main(String[] args) {

        //Ex01:
        Student student1 = new Student("Rafael");
        Student student2 = new Student("Gustof");
        Student student3 = new Student("Michael");

        Course course1 = new Course("Java");
        Course course2 = new Course("Javascript");
        Course course3 = new Course("Python");

        //Ex02:
        student1.addCourse(course1);
        student1.addCourse(course3);

        student2.addCourse(course2);
        student2.addCourse(course1);

        course1.addStudent(student3);
        course2.addStudent(student3);
        course3.addStudent(student3);

        //Ex03:
        System.out.println("\nEx03:");

        student1.showMeCoursesThatStudent();
        System.out.println();



        //Ex04:
        System.out.println("Ex04:");

        course2.showMeStudentsThatCourse();
        System.out.println();



        //Ex05:
        System.out.println("Ex05:");

        student3.showMeCoursesThatStudent();
        System.out.println();



        //Ex06:
        System.out.println("Ex06:");

        course1.showMeStudentsThatCourse();

    }

    /*  Ex01 -  Note aqui que temos a implementação de 3 alunos diferentes e 3 livros diferentes.
    *           Se atente aos nomes deles, e veja como a implementação N:N dará certo para ambos
    *           os lados nos exemplos futuros...
    */

    /*  Ex02 -  Note aqui que fizemos uma mescla, implementando tanto cursos á alunos, como também
    *           alunos á cursos. Essa atribuição vai acontecer de forma bidimensional. A classe
    *           Students irá receber os alunos atribuídos por através dela, como também aqueles
    *           que forma atribuídos por através da classe Course. Isso acontecerá também do lado
    *           da classe Course. Para entender como isso acontece, veja a implementação destas
    *           classes;
    */

    /*  Ex03 -  Veja como o student 1 realmente pegou os cursos que lhe foram atribuídos por
    *           através dos cursos 1 e 3;
    */

    /*  Ex04 -  Veja também que o mesmo que aconteceu com o student do exemplo 3, acontece com o
    *           curso 2, ele recebe somente os estudantes que foram atribuídos a esse curso;
    */

    /*  Ex05 -  Neste exemplo podemos ver que o estudante 3 foi o único a receber 3 cursos, note
    *           mais um detalhe interessante, que é o fato de ele ter recebido essas atribuições
    *           por através da classe Course invés da classe Student, ainda assim quando chamamos
    *           método "showMeCoursesThatStudent" - método de Student - ele imprime corretamente
    *           os 3 cursos que esse estudante recebeu;
    */

    /*  Ex06 -  Neste exemplo agora imprimimos somente os alunos que pertencem ao curso 1, o
    *           único curso que tem 3 estudantes como dependentes. Note que ele imprime
    *           justamente o nome dos 2 alunos;
    */

}
