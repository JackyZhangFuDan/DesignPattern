package designpattern.construction.abstractfactory;

import designpattern.PatternRole;

public interface Factory extends PatternRole {
	public ProductA createProductAInstance();
	public ProductB createProductBInstance();
}
