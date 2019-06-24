package designpattern.structure.composite;

import designpattern.PatternRole;

public interface Component extends PatternRole {
	public String getKey();
	public void getInformation();
}
