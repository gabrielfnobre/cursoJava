public class ConstructorsInstancer {
    public static void main(String[] args){
        
        //EX01
        Constructories p1 = new Constructories();
        System.out.println("Ex01:");
        System.out.println(p1.showProduct());
        System.out.println();
        
        //EX02
        p1.name = "NoteBook";
        p1.price = 2340.50;
        p1.discont = 0.15;
        System.out.println("EX02:");
        System.out.println(p1.name);
        System.out.println(p1.showProduct());
        
        //EX03
        Constructories p2 = new Constructories("Caneta", 1.50, 0.20);
        System.out.println("\nEx03:");
        System.out.println(p2.showProduct());

    }

    /*  Ex01 - Note aqui a forma que usamos para instanciar uma variável com o construtor padrão. Note que, como ele não
                possuí nenhum método que atribua valores as variáveis, ele retorna um produto sem atributos definidos;
     */

    /*  Ex02 - Aqui nós atribuímos valores ao produto gerado no Ex01, note que a atribuição funciona sem problemas, 
                mostrando que a instancialização realmente deu certo;
     */

    /*  Ex03 - Já aqui nós inicializamos a variável com o construtor parametrizado, como ele já faz referencia direta 
                aos atributos da classe, fica fácil retornar os valores do objeto.
     */

}
