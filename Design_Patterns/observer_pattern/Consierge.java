package observer_pattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Consierge {

	private List<Observer> observerCollection = new ArrayList<>();
	
	public void registerObserver(Observer obs) {
		observerCollection.add(obs);
	}
	
	public void unRegisterObserver(Observer obs) {
		observerCollection.remove(obs);
	}
	
	public void notifyObservers(Date date) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
	}
	
}
