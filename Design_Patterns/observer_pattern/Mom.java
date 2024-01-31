package observer_pattern;

public class Mom implements Observer{
	
	public void notifyObserver() {
		System.out.println("My son arrived!");
		System.out.println("Please, quit the lights!");
		System.out.println("And hide yourself!");
	}
	
}
