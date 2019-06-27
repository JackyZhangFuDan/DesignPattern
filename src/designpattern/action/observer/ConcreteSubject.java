package designpattern.action.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void definition() {
		System.out.println("Role: Concrete Subject");
	}

	@Override
	public void subscribe(Observer obs) {
		this.observers.add(obs);
	}

	@Override
	public void unSubscribe(Observer obs) {
		this.observers.remove(obs);
	}

	@Override
	public void notifyAllObserver() {
		for(Observer obs : this.observers) {
			obs.callback();
		}
	}

}
