package ErrosAndExceptions.Students;

public class YearNotFound extends RuntimeException{ //#Ex-01
    private final int year;

    YearNotFound(int year){ //#Ex-02
        this.year = year;
    }

    @Override
    public String getMessage() { //#Ex-03
        return String.format("The year %d cannot use!", this.year);
    }
}

/*      #Ex-01 - Veja que apenas fizemos com que a classe "YearNotFound" herdasse
*               da classe RuntimeException, ao fazer isso automaticamente ela se
*               torna uma classe de throwable, ou seja ela poderá ser um erro
*               lançável. Além disso, ela herda todos os métodos de uma Runtime-
*               Exception;
*
*               OBSERVAÇÕES: Por ser uma RuntimeException, não há a necessidade
*               de fazer tratamento de erro nos métodos chamadores;
*
*       #Ex-02 - Veja que geramos um construtor para essa exception que deve
*               receber como parâmetro a string que gerou o erro. Isso nos ajuda
*               a exibir na mensagem de exceção onde o erro foi gerado;
*
*       #Ex-03 - Veja que criamos um override no método "getMessage" fazendo
*               com que a mensagem que quiséssemos seja exibida no console;
*
*   Vá agora para a classe "NameNotFound"...
* */