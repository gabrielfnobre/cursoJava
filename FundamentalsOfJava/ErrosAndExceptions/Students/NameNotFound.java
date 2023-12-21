package ErrosAndExceptions.Students;

public class NameNotFound extends Exception{ //#Ex-01
    private final String name;

    NameNotFound(String name){ //#Ex-02
        this.name = name;
    }

    @Override
    public String getMessage() { //#Ex-03
        return String.format("The name %s cannot use!", this.name);
    }
}

/*      #Ex-01 - Veja que fizemos com que a classe "NameNotFound" herdasse da
*               classe "Exception", assim, essa classe automaticamente se
*               torna-se uma throwable, fazendo com que erros possam ser lan-
*               çados a partir dela. Sem falar que todos os métodos de Excep-
*               tion podem ser herdados para ela;
*
*               OBSERVAÇÃO: Por ser herdeira de Exception, essa classe têm
*               que ser tratada por um try-catch!
*
*       #Ex-02 - Aqui nós criamos um construtor para que o valor que gera o
*               erro possa ser passado, isso possibilita que possamos mostrar
*               ao usuário onde o erro foi ocasionado no console;
*
*       #Ex-03 - E aqui temos um override do método "getMessage", onde nós
*               criamos uma mensagem customizada exibindo para o usuário o lu-
*               gar exato onde o erro aconteceu;
*
*
*   Vá agora para a classe "ValidateStudent"...
**/
