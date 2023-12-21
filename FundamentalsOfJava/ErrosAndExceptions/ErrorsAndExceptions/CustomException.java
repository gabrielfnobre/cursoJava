package ErrosAndExceptions.ErrorsAndExceptions;

import ErrosAndExceptions.Students.Student;
import ErrosAndExceptions.Students.ValidateStudent;

public class CustomException {
    public static void main(String[] args) {

        Student validStudent = new Student("Carl", 2023, "java");
        Student invalidStudent1 = new Student("Max", 2025, "java");

        ValidateStudent.student(validStudent); //Veja o resultado de um estudante válido!
        ValidateStudent.student(invalidStudent1); //Veja o resultado de um inválido!

    }
}

//      EXCEÇÃO CUSTOMIZADA

/*      É possível também que criemos as nossas próprias exceções customizadas no java,
*       muito embora essa não seja uma prática amplamente usada, afinal o java já posuí
*       uma série de exceções para os mais variados tipos de situações, o que torna dis-
*       pensável a ideia de criar exceções customizadas a toa.
*
*       Como podemos fazer para criar nossas excessões customizadas?
*
*       Podemos fazer isso facilmente apenas criando uma classe que herde de uma classe
*       que seja capaz de gerar exceções, como "Exception", "RuntimeException" ou "Null-
*       PointerException", entre outras.
*
*       Podemos gerar uma mensagem de erro a nossa escolha fazendo um override sobre os
*       métodos das exceptions e lançando os erros sobre uma classe de validação, ou
*       criando um método dentro da classe que gerará os objetos do nosso código por
*       exemplo. Fica a mercê da nossa criatividade.
*
*       Entre no pacote "Students" e vá na classe "YearNotFound" para acompanhar a cria-
*       ção de uma exceção customizada...
*
* */
