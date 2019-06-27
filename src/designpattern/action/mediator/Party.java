package designpattern.action.mediator;

import designpattern.PatternRole;

public interface Party extends PatternRole {
	public void send(String msg);
	public void receive(String msg);
}
