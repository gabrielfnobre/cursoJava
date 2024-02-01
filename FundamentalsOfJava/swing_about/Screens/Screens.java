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
		
		JFrame screen = new JFrame("My Subject"); // 1º criamos um frame (janela), a janela é o "Subject" no swing... 
		screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Faz a execução parar quando clicamos no "X" para fechar a janela
		screen.setSize(600, 600); //Dimensiona o tamanho da janela
		screen.setLayout(new FlowLayout()); //Define o layout como FlowLayout para que os componentes não peguem todo o tamanho da tela
		screen.setLocationRelativeTo(null); //Define a posição em que a janela aparece como o centro do monitor
		
		JButton button = new JButton("I'm Observer Concrete"); //O botão funciona como um Observer Concrete, que quer saber quando for clicado
		button.setPreferredSize(new Dimension(550, 50)); //Dimensionamento do botão
		screen.add(button); //Botão é registrado no subject, ou seja, a janela...
		
		JPanel painel = new JPanel(); //Painel é outro Observer Concrete
		screen.add(painel); //O Painel é registrado no subject também...
		painel.setBackground(Color.PINK); //Mudando a cor do painel...
		painel.setPreferredSize(new Dimension(200, 150)); //Dimensionando o painel...
		
		JLabel labelText = new JLabel(); //O texto é criado
		painel.add(labelText); //Texto é registrado no painel, não na tela...
		
		button.addActionListener(e -> { //Aqui temos o identificador do evento, quando o evento ocorre, a lambda é executada, alternando o texto
			String text = labelText.getText(); //do painel, sempre que o botão é clicado.
			if(text.equalsIgnoreCase("OOOOH")) {				
				labelText.setText("AAAAH");
			} else {
				labelText.setText("OOOOH");
			}
		}); //Quando o botão recebe um clic
		
		screen.setVisible(true);
	}
}
