package OO.Constructors;

//  CONSTRUTORES

/*  Para mais detalhes sobre como funcionam os construtores, olhe o arquivo "Constructors.txt".

    Veja alguns exemplos de usabilidade logo abaixo, para ver eles sendo instanciados, olhe o
    arquivo ConstructorsInstancer.java...
 */

public class Constructories {
    
    String name;
    double price;
    double discont;

    //Ex01
    Constructories(){}

    //Ex02
    Constructories(String nameInitial,
                double priceInitial,
                double discontInitial){
            name = nameInitial;
            price = priceInitial;
            discont = discontInitial;
    }

    String priceWithDiscont(){
        return String.format("R$ %.2f", (price * (1 - discont)));
    }

    String showProduct(){
        return String.format("Product: %s\nPrice: %.2f\nPrice with discont: %s", name, price, priceWithDiscont());
    }

    /*  Ex01 - Nesse exemplo temos um construtor padrão, poderíamos ter colocado alguma programação
                nele se quiséssemos;
     */

    /*  Ex02 - Aqui temos um construtor parametrizado, note que podemos ter mais construtores como
                esse se quiséssemos, bastaria para isso que eles tivessem assinaturas diferentes;
     */

}
