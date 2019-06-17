package designpattern.abstractfactory;

import designpattern.factory.Product;

public abstract class ProductA implements Product {

	@Override
	public void definition() {
		System.out.println("Parent class of product A");	
	}

}
