package LambdaExpressions.FunctionalInterfaces;

/*  Veja que é muito simples, basta usarmos apenas 1 método abstrato dentro da interface, podemos implementar quantos
*   métodos default e estáticos quisermos, mas abstratos, só 1. Além disso, temos que usar a notation
*   "@FunctionalInterface" no topo da nossa interface...
* */

@FunctionalInterface    //Aqui está nossa notation...
public interface Calculate {
    Integer execute(int a, int b); //Apenas 1 método abstrato, se usar 2 vai dar erro...

    default void ICanExistHereImDefault(){ //Podemos usar métodos default tranquilamente...
        System.out.println("I can existing here!");
    }

    static void meTooCanExistHereImStatic(){ //Também podemos usar métodos estáticos o quanto quisermos...
        System.out.println("Me too can existing here, I'm static!");
    }

    //VÁ AGORA PARA A CLASSE FunctionalInterfaces...
}
