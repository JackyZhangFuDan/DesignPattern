package designpattern.action.visitor;

import designpattern.PatternRole;

public interface Subject extends PatternRole {
	public void accept(Visitor visitor);
	public String getData();
}
