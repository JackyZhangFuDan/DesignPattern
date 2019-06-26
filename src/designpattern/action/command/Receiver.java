package designpattern.action.command;

import designpattern.PatternRole;

public interface Receiver extends PatternRole {
	public void doAction();
}
