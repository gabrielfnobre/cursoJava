package FUNDAMENTALS.FundamentalsOfJava.Generics.CreatingGenericMethods;

public class CreatingGenericMethods {
    public static void main(String[] args) {

        String firstName = "Gabriel ";
        String lastName = "Nobre ";

        System.out.println(
                MyGenericMethod
                        .sumOrConcatenate(firstName, lastName) //usando esse método
        );                                                     //podemos concatenar...

        Integer num1 = 3;
        Integer num2 = 5;

        System.out.println(
                MyGenericMethod
                        .sumOrConcatenate(num1, num2) //Como também podemos somar
        );                                            //qualquer Integer, Float ou
                                                      //Double...

        MyGenericMethod.whatIsTheType(true); //Esse método mostra a que classe per-
        MyGenericMethod.whatIsTheType('a');  //tencem quaisquer tipos...
        MyGenericMethod.whatIsTheType(2.3);

    }
}

/*     CRIANDO MÉTODO GENÉRICOS:
*
*   Com o generics somos capazes também de criar métodos genéricos capazes de inferir
*   automaticamente qual deve ser o tipo de dado utilizado assim que recebe o tipo de
*   dado. Podemos até fazer com que o método retorne o tipo de Dado específico se de-
*   sejarmos.
*
*   Para isso usamos a seguinte sintaxe:
*
*       public <T> T nomeDoMetodo(T tipo) { ...
*
*       - Usamos o "<T>" para mostrar ao java que esse método é genérico e deve rece-
*           ber um tipo genérico do tipo "T";
*
*       - Usamos o "T" logo após o símbolo de "<T>" para dizer que o retorno do méto-
*           do também deve ser do tipo "T", aqui podemos também colocar qualquer ti-
*           po de retorno que desejarmos, até "void" para o caso de métodos que não
*           retornam nada;
*
*       - Usamos "T" novamente para o campo de parâmetros, para pegar um objeto de
*           um tipo qualquer;
*
*   Veja a implementação disso na prática nos 2 métodos existentes na classe: "MyGe-
*   nericMethod"...
*
* */