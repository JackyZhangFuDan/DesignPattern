package designpattern.action.iterator;

import designpattern.PatternRole;

public interface Iterator extends PatternRole {
	public Object first();
	public Object next();
	public boolean hasNext();
}
