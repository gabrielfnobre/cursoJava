package FUNDAMENTALS.FundamentalsOfJava.ErrorsAndExceptions.Students;

import java.time.LocalDate;

public class ValidateStudent { //#Ex-01

    private ValidateStudent() {}; //#Ex-02

    public static void student(Student student){ //#Ex-03
        if(student == null){
            throw new IllegalArgumentException("The student isn't exist!"); //#Ex-04
        } else if(student.name == null | student.name.trim().isEmpty()){
            try { //#Ex-05
                throw new NameNotFound(student.name);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } else if(student.year > LocalDate.now().getYear() || student.year < 1900){
            throw new YearNotFound(student.year); //#Ex-06
        } else {
            System.out.println("The student is validaded!"); //#Ex-07
        }
    }

}

/*      #Ex-01 - Essa classe foi criada para servir de validação para os estudantes,
*               ela validará se os valores de "name" e "year" foram passados corre-
*               tamente.
*
*       #Ex-02 - Inutilizamos o construtor para que ela não possa ser instanciada;
*
*       #Ex-03 - O método "student" será o responsável por fazer as validações das
*               instâncias de student, recebendo um objeto do tipo "Student" como
*               parâmetro;
*
*       #Ex-04 - Se receber um valor nulo, ela joga uma exceção "IllegalArgument-
*               Exception", uma exceção do próprio java;
*
*       #Ex-05 - Se receber um valor "name" nulo ou vazio ela joga uma exceção do
*               tipo "NameNotFound", que nós mesmos criamos. Note que ela também
*               pega o "name" como parâmetro para mostrar onde o erro aconteceu;
*
*               DETALHE IMPORTANTE!!!
*               Veja que ela está dentro de um "try-catch", isso é obrigatório
*               pois ela herda de "Exception", o que faz com que tenhamos a obri-
*               gatoriedade de fazer um tratamento de erro;
*
*       #Ex-06 - Se receber um "year" que seja maior do que o ano atual ou menor
*               que 1900, ele joga um "YearNotFound" também criado por nós a
*               partir de "RuntimeException";
*
*               DETALHE IMPORTANTE!!!
*               Por fazer parte de RuntimeException, não há a obrigatoriedade de
*               fazer um tratamento com "try-catch";
*
*       #Ex-07 - Valor mostrado se tudo estiver OK...
*
*   Vá agora na classe "Student" para ver como está a classe que gera os objetos
*   de Student...
* */