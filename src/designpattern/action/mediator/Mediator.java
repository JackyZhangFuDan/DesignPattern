package designpattern.action.mediator;

import designpattern.PatternRole;

public interface Mediator extends PatternRole {
	public void register(Party p);
	public void relay(Party sender,String msg);
}
