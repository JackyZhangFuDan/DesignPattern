package designpattern.construction.factorymethod;

import designpattern.PatternRole;

public interface Factory extends PatternRole {
	public Product createProductInstance();
}
