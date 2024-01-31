package observer_pattern;

public class Guest implements Observer {

	public void notifyObserver() {
		System.out.println("The boy arrived!");
		System.out.println("I need hide me!");
	}
	
}
