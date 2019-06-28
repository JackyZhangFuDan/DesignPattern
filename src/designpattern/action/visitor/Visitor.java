package designpattern.action.visitor;

import designpattern.PatternRole;

public interface Visitor extends PatternRole {
	public void visit(Subject subject);
}
