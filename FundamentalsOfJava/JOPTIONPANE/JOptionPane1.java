package JOPTIONPANE;

//JOptionPane:

/*  O JOptionPane é um pacote de ferramentas da lib "javax.swing", uma biblioteca já vem por 
    padrão dentro do JDK.
    O que ele faz exatamente é gerar uma interface gráfica por através de Janelas geradas pelo SO 
    do computador, essas janelas podem ser usadas para mostrar mensagens de alerta, bem como para 
    colher dados de usuário.

    A usabilidade é muito simples, basta importar a biblioteca "java.swing" juntamente com o 
    pacote "JOptionPane" e usar os métodos que compõe a biblioteca. Alguns métodos mais usados 
    são:

        # showMessageDialog() - Usado para mostrar uma mensagem para o usuário, recebe como 
                                parametro o tipo primitivo da mensagem, mas por padrão usa
                                "null", e na sequência a mensagem, que geralmente pode ser 
                                uma string;

        # showInputDialog() - Usado para colher dados de um usuário, ele retorna os dados em
                                forma de uma string;

        # showConfirmDialog() - Mostra uma janela de confirmação, com as opções "Yes", "No" e
                                "Cancel". De acordo com o valor escolhido ele pode retornar 
                                os valores "0" (Significa "Yes"), "1" (Significa "No"), "2"
                                (significa "Cancel") ou "-1" (Significa "Close Window");

    Veja um exemplo da usabilidade dessa biblioteca logo baixo...
*/


import javax.swing.JOptionPane;

public class JOptionPane1 {
    public static void main(String[] args){
        //Ex01
        String name = JOptionPane.showInputDialog("Qual o seu nome?");
        int confirmation = JOptionPane.showConfirmDialog(null, "Voce escreveu " + name + "\nSeu nome eh esse mesmo?");

        while(confirmation != JOptionPane.YES_OPTION){
            name = JOptionPane.showInputDialog("Qual o seu nome?");
            confirmation = JOptionPane.showConfirmDialog(null, "Voce escreveu " + name + "\nSeu nome eh esse mesmo?");
        }

        JOptionPane.showMessageDialog(null, "Obrigado " + name + " estamos encerrando o sistema.");
        System.exit(0);
    }

    /*  Ex01 - Veja que no exemplo abaixo estamos capturando o nome de uma pessoa usando o método "showInputDialog()" para
                capturar o nome de uma pessoa. Na sequência estamos capturando uma confirmação de usuário se o nome dele 
                realmente está correto, para isso estamos usando o método "showConfirmDialog()".
                Logo abaixo temos um loop while que verifica se o valor capturado pela janela de cofirmação vai nos 
                devolver o valor diferente de uma confirmação "YES_OPTION" para prosseguir com a execução do código. (Só
                explicando: "YES_OPTION" é uma constante interna da biblioteca que equivale ao valor "0", do botão "Yes", 
                temos outras constantes como: NO_OPTION (valor 1), CANCEL_OPTION (valor 2) e CLOSED_OPTION (valor -1).
                Após a saída do loop, temos um método "showMessageDialog()" que mostra uma última mensagm agradecendo a
                pessoa e encerrando o programa.
     */
}
