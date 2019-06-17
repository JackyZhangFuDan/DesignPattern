package designpattern.construction.factory;

import designpattern.PatternRole;

public class Factory implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Factory class");
	}
	
	public static Product getProductInstance(String productId) {
		switch(productId) {
		case "1":
			return new ConcreateProduct1();
		case "2":
			return new ConcreateProduct2();
		default:
			return null;
		}
	}
}
