package designpattern.abstractfactory;

public class ConcreateProductA1 extends ProductA {

	@Override
	public void definition() {
		System.out.println("A concreate product A class");
		
	}
	
	@Override
	public String name() {	
		return "Product A's 1st type of product";
	}

}
