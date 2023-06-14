//Nesse chalenge:

//Fazer um programa que compara se 2 trabalhos deram deram certo e traz os seguintes resultados:

//  Se os 2 deram certo: A família vai para o shopping comprar uma TV de 50" e tomar sorvete;
//  Se apenas 1 deu certo: A família vai para o shopping comprar uma TV de 32" e tomar sorvete;
//  Se nenhum de certo: A família vai ficar em casa;

import javax.swing.JOptionPane;

public class tvBooleans {
    
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "Temos 2 trabalhos para fazer\n\s\s- Se ambos derem certo, vamos comprar uma TV de 50\" e tomar um sorvete no shopping.\n\s\s - Se apenas 1 der certo, vamos comprar uma TV de 32\" e tomar um sorvete no shopping.\n\s\s - Se nenhum der certo, vamos ficar em casa mesmo.");
        
        boolean trabalho1 = Boolean.parseBoolean(
            JOptionPane.showInputDialog("O primeiro trabalho deu certo?\nColoque \"sim\" ou \"nao\"...")
                .replace("sim", "true")
                .replace("nao", "false"));
        boolean trabalho2 = Boolean.parseBoolean(
            JOptionPane.showInputDialog("O segundo trabalho deu certo?\nColoque \"sim\" ou \"nao\"...")
                .replace("sim", "true")
                .replace("nao", "false"));

        if(trabalho1 && trabalho2){
            JOptionPane.showMessageDialog(null, "Uhuuu! Os 2 trabalhos deram certo, vamos comprar a TV de 50\" e tomar sorvete no shopping!");
        } else if(trabalho1 || trabalho2){
            JOptionPane.showMessageDialog(null, "Bom, soh 1 trabalho deu certo, vamos comprar a TV de 32\" e tomar um sorvete no shopping!");
        } else {
            JOptionPane.showMessageDialog(null, "Ih! Nenhum trabalho deu certo. Vamos ficar em casa mesmo.");
        }

        System.exit(0);

    }

}
