package designpattern.action.chainofresponsibility;

import designpattern.PatternRole;

public interface Handler extends PatternRole {
	public void handle(String request);
	public void setNext(Handler next);
}
