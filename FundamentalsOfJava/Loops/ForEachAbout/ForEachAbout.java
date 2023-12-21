package Loops.ForEachAbout;

// SOBRE O FOR EACH:

/*  Assim como em outras linguagens, o java possuí uma função que nos ajuda a iterar sobre os 
    valores de um array de forma mais facilitada, que é o "for each".

    Por através do for each conseguimos iterar sobre os valores de um array por através de uma
    label pré-declarada, onde à cada iteração a label irá equivaler ao valor índice atual onde
    o laço estiver.

    A sintáxe é bem simples:

        for(int valor: nomeDoArray){
            valor...
        }

        Explicando:
                - Não usamos a palavra reservada "forEach" como em outras linguagens, em vez 
                    disso usamos a palavra "for", o que irá diferenciar um laço "for" de um
                    "forEach" será a assinatura do método;

                - Note que um forEach tem como assinatura do método uma variável que se 
                    tornará o identificador do índice atual referente ao laço em que o 
                    forEach se encontra;

                - Note também que é preciso identificar qual array será iterado, logo após
                    os ":" da label;

                - Após isso é só usar a label dentro do bloco de código do "forEach", isso 
                    irá fazer com que o "forEach"

    Vejamos um exemplo logo abaixo...
 */

public class ForEachAbout {
    public static void main(String[] args){
        
        double[] notas = {9.9, 8.7, 7.2, 9.4};

        //Ex01
        for(double qualquerNome: notas){
            System.out.println("Nota do aluno: " + qualquerNome);
        }
    }

    /*  Ex 01 - Aqui temos um exemplo simples do uso do forEach, note que temos uma label, note
                que é necessário que a label tenha um tipo primitivo identico ao tipo primitivo
                dos valores do array, podemos dar "qualquerNome" a label.
     */
}
