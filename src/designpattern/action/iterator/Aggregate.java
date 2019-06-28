package designpattern.action.iterator;

import designpattern.PatternRole;

public interface Aggregate extends PatternRole {
	public Iterator iterator();
	
}
