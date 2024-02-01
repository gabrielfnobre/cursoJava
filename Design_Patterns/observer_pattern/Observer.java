package observer_pattern;

import java.util.Date;

//Essa interface representa o Observer!
//Essa interface tem 2 métodos que devem ser implementados na mãe e nos
//convidados...

public interface Observer {
	public void notifyObserver(Date date); //Método que recebe a data que o convidado chega
	public void doYourTask(); //Método que executa uma ação enquanto o convidado não chega
}

//Veja as classe Mãe(Mom), Convidado(Guest) e Porteiro(Consierge)...
