package designpattern.factorymethod;

import designpattern.PatternRole;

public interface Factory extends PatternRole {
	public Product createProductInstance();
}
