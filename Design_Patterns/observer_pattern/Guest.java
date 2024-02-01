package observer_pattern;

import java.util.Date;

//Essa classe representa um Observer Concrete!!!
public class Guest implements Observer { //Convidado implementa a interface Observer...

	public void notifyObserver(Date date) { //Método para quando o convidado chegar...
		System.out.println("Oh! The boy arrived!");
		System.out.println("Good thing I arrived before " + date.getHours() + ":00h");
		System.out.println("I need hide me!\n");
	}
	
	public void doYourTask() { //Método para ser executado enquanto o convidado não chega...
		System.out.println("The guest chats with the others guests while helping the birthday boy's mother...");
	}
}
