package OO.AboutSuper;

/*  Note aqui, que já estamos fazendo o contrário do que fizemos na classe
*   SubClassComum, em vez de usar o super sem parâmetros para chamar o
*   método construtor padrão, nós usamos o super passando parâmetro com a
*   mesma assinatura que o construtor implementado na SuperClasse...
*
*   Agora vá no arquivo SuperOverload para ver essa implementação junto
*   com overloads implementados no construtor da própria sub classe...
* */

public class SubClassParams extends SuperClassComum {
    SubClassParams(String name){
        super(name);
    }
}
