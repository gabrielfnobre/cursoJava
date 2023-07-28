package FUNDAMENTALS.FundamentalsOfJava.LambdaExpressions.FunctionalInterfaces;

/*  Veja que é muito simples, basta usarmos apenas 1 método dentro da interface e usar a notation
*   "@FunctionalInterface", simples assim...
* */

@FunctionalInterface    //Aqui está nossa notation...
public interface Calculate {
    Integer execute(int a, int b); //Apenas 1 método, se usar 2 vai dar erro...

}
