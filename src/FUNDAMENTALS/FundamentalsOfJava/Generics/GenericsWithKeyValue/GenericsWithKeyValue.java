package FUNDAMENTALS.FundamentalsOfJava.Generics.GenericsWithKeyValue;

public class GenericsWithKeyValue {
    public static void main(String[] args) {

        Pairs<Integer, String> list = new Pairs<>(); //Veja que a especificação dos
        list.addPair(1, "Gabriel");                     //tipos é feita no momento
        list.addPair(2, "Graziela");                    //em que a classe "Pairs" é
        list.addPair(3, "Sebastian");                   //iniciada...
        list.addPair(4, "Quiqui");
        list.addPair(3, "Genies"); //Note que todas as instâncias de "Pair" são cri-
                                    //adas a partir do método "addPairs"...

        list.showValue(1); //Conseguimos pegar um valor pelo número da chave...
        list.showValue(2);
        list.showValue(3); //Conseguimos substituir valores...
        list.showValue(4);

        list.showAllList(); //Conseguimos mostrar todos os valores...

    }
}

/*      GENERICS COM CHAVE E VALOR:
*
*   Também é possível usar Generics para trabalhar com elementos que utilizam chave
*   e valor. Veja um exemplo prático disso, por favor vá até a classe "Pair"...
*
* */
