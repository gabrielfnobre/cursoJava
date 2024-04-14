package observer_pattern;

import java.util.Date;

//Essa classe representa um Observer Concrete!!!
public class Mom implements Observer{ //A mãe está implementando a interface Observer...
	
	public void notifyObserver(Date date) { //Método para quanto do filho chegar...
		System.out.println("Oh! My son arrived at the gate at " + date.getHours() + ":" + date.getMinutes() + "h");
		System.out.println("In 1 minute he'll arrive home!");
		System.out.println("Please, quit the lights!");
		System.out.println("And hide yourself!\n");
	}
	
	public void doYourTask() { //Método para ser executado enquanto o filho não chega...
		System.out.println("The mom is preparing the birthday...");
	}
	
}
