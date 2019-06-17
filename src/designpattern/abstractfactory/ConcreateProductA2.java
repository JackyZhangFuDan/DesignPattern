package designpattern.abstractfactory;

public class ConcreateProductA2 extends ProductA {

	@Override
	public void definition() {
		System.out.println("Another concreate product A class");
		
	}

	@Override
	public String name() {	
		return "Product A's 2nd type of product";
	}

}
