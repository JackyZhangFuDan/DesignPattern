package designpattern.construction.abstractfactory;

public class ConcreateProductA2 extends ProductA {

	@Override
	public void definition() {
		System.out.println("Another concreate product A class");
		
	}

	@Override
	public String name() {	
		return "Product A's instance in 2nd product cluster";
	}

}
