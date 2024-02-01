package observer_pattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Essa classe representa um Subject!!!
public class Consierge {
	
	private List<Observer> observers = new ArrayList<>(); //Uma collection com todos os Observer Concrete
															//ATENÇÃO!!! Lembre-se que uma classe que implementa uma interface também pode ser referenciado como objeto dessa interface!!!
	
	public void registerObserver(Observer obs) { //Um método registrador de observers...
		observers.add(obs);
	}
	
	public void unRegisterObserver(Observer obs) { //Um método removedor de observers...
		observers.remove(obs);
	}
	
	public void notifyObservers() { //Um método que presta atenção no evento o notifica os observers quando o evento acontecer...
		Scanner scanner = new Scanner(System.in);
		String response = "";
		
		while(!response.equalsIgnoreCase("yes")) {
			
			System.out.println("\nHas the birthday boy arrived?");
			response = scanner.nextLine();
			
			if(response.equalsIgnoreCase("yes")) { //Quando o evento acontece chama os observers executando uma lambda para todos eles...
				System.out.println("Consierge: Yes! He arrived!\n");
				observers.stream().forEach(o -> o.notifyObserver(new Date()));
			} else {
				System.out.println("Consierge: Not yet!\n"); //Enquanto o evento não acontece ele permite que os observers continuem com suas execuções normais...
				observers.stream().forEach(o -> o.doYourTask());
			}
		}
		
		scanner.close();
	}
	
}