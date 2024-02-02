package swing_about.Screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


// TELAS:
/*	
 * 	Veja abaixo o exemplo de como telas visuais usando a API do swing.
 * 
 * 	Lembre-se que o swing usa fortemente o padrão observer na sua API.
 * 
 */

public class Screens {
	public static void main(String[] args) {
		
		JFrame screen = new JFrame("My Subject"); // 1º criamos um frame (janela), onde vamos colocar todos os componentes visuais... 
		screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Faz a execução parar quando clicamos no "X" para fechar a janela
		screen.setSize(600, 600); //Dimensiona o tamanho da janela
		screen.setLayout(new FlowLayout()); //Define o layout como FlowLayout para que os componentes não peguem todo o tamanho da tela
		screen.setLocationRelativeTo(null); //Define a posição em que a janela aparece como o centro do monitor
		
		JButton button = new JButton("Change the Text!!!"); //O botão funciona como um Subject, que quer saber quando o evento de click acontece
		button.setPreferredSize(new Dimension(550, 50)); //Dimensionamento do botão
		screen.add(button); //Botão é adicionado a janela
		
		JPanel painel = new JPanel(); //Criamos outro componente visual, o painel que pode receber elementos dentro dele
		screen.add(painel); //O Painel é adicionado a tela...
		painel.setBackground(Color.PINK); //Mudando a cor do painel...
		painel.setPreferredSize(new Dimension(200, 150)); //Dimensionando o painel...
		
		JLabel labelText = new JLabel(); //O texto é criado
		painel.add(labelText); //Texto adicionado ao painel rosa...
		
		button.addActionListener(e -> { //Aqui temos padrão observer implementado, quando o botão identifica o clica, ele fará um comportamento na letra do painel.
			String text = labelText.getText(); //que será alternada a cada click.
			if(text.equalsIgnoreCase("OOOOH")) {				
				labelText.setText("AAAAH");
			} else {
				labelText.setText("OOOOH");
			}
		});
		
		screen.setVisible(true);
	}
}
