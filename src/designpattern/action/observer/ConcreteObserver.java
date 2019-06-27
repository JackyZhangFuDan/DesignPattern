package designpattern.action.observer;

import designpattern.PatternRole;

public class ConcreteObserver implements Observer {

	@Override
	public void definition() {
		System.out.println("Role: Observer");
	}

	@Override
	public void callback() {
		System.out.println("Observer's callback is triggered by subject");
	}

}
