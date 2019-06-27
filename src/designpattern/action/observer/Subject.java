package designpattern.action.observer;

import designpattern.PatternRole;

public interface Subject extends PatternRole {
	public void subscribe(Observer obs);
	public void unSubscribe(Observer obs);
	public void notifyAllObserver();
}
