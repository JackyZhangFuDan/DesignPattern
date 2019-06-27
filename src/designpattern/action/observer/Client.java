package designpattern.action.observer;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();
		Observer obs = new ConcreteObserver();
		sub.subscribe(obs);
		
		sub.notifyAllObserver();
	}
}
