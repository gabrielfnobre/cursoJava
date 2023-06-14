//  SWITCH:

/*  O laço "switch" é um laço usado para quando queremos fazer a comparação de um valor
    recebido com vários valores diferentes e gerar um resultado específico dependendo 
    do valor que foi recebido.

    A forma de utilizá-lo é muito simples:

        switch(variavelQueSeraComparada){
            case valorDeComparacao:
                Sentenca a ser executada;
                break;
            case valorDeComparacao2:
                Sentenca a ser executada;
                break;
            default:
                Sentenca a ser executada por padrao caso nenhuma seja satisfeita;
        }

        Explicação:
            # Dentro dos parâmetros do switch não vamos receber uma operação booleana
                como acontece nos demais laços. Em vez disso recebemos a variável que
                contém o valor que será comparado com cada caso "case";

            # Os cases recebem os valores que serão comparados à variável. Se o valor
                for identico ao valor que está no case, o laço vai entrar na 
                execução do case.
                Podemos fazer um mesmo bloco de execução para 2 cases diferentes, 
                para isso basta usarmos um case atrás do outro assim:
                    case valor1: case valor2
                        Bloco de execução;
                Ou assim...
                    case valor1:
                    case valor2:
                        Bloco de execução;
                Dos 2 jeitos vai dar certo.
                AQUI VALE UMA OBSERVAÇÃO! Caso um valor entre no case e não possua um
                break dentro da sentença, todos os outros cases também serão 
                executados!

            # O uso do break é opcional, ele é usado para que saíamos do laço depois 
                de entrar em um case e não executemos nenhum outro;

            # O default é usado como um valor padrão caso nenhum case seja satisfeito,
                ele não precisa necessariamente ser usado por último, mas por 
                convenção nós temos o costume de colocá-lo no último lugar.

    Vejamos um exemplo...
 */

import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args){

        //Ex01
        String animal = JOptionPane.showInputDialog(
            null, "O animal e o que?\n\t\t- terrestre\n\t\t- rastejante\n\t\t- aquatico\n\t\t- anfibio");

        switch(animal.toLowerCase()){
            case "anfibio":
                JOptionPane.showMessageDialog(null, "O animal sabe andar e nadar");
            case "terrestre": case "rastejante":
                JOptionPane.showMessageDialog(null, "O animal sabe andar");
                break;
            case "aquatico":
                JOptionPane.showMessageDialog(null, "O animal sabe nadar");
                break;
            default:
                JOptionPane.showMessageDialog(null, "voce nao colocou valor nenhum");
        }

        System.exit(0);
    }

        /* Ex01 - Nesse exemplo capturamos um dos valores do usuário sobre um animal e devolvemos ao 
            usuário a resposta sobre o que o animal sabe fazer de acordo com o tipo de animal que ele
            é. No que algumas particularidades sobre esse switch:

                # Se o usuário escolher anfibio: Tanto o bloco do anfíbio será executado quanto o 
                    bloco do terrestre, por que o anfibio não tem um break;

                # Se o usuário escolher terrestre ou ratejante: O mesmo bloco de execução será 
                    executado, por que estamos usando os cases em conjunto, e o bloco do aquatico 
                    não será executado por causa do break;

                # No default temos o valor de exibição padrão, note que o default não precisa de 
                    break, pois ele já é a última execução;
         */
}
