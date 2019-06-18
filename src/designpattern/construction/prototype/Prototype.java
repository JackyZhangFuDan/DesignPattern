package designpattern.construction.prototype;

import designpattern.PatternRole;

public interface Prototype extends PatternRole {
	public Object copy();
	
	public void printSelf();
}
