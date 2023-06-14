/*  Nesse desafio:

    Cliar uma programação While que repete até que um usuário diga que quer sair...

 */

import javax.swing.JOptionPane;

public class whilePedePraSair {
    
    public static void main(String[] args){

        String exit = "nao";

        while(exit.equalsIgnoreCase("nao")){
            exit = JOptionPane.showInputDialog(null, "Voce quer sair? (Digite \"sim\" ou \"nao\"");
        }

        JOptionPane.showMessageDialog(null, "Adios Amigo!");

        System.exit(0);

    }

}
