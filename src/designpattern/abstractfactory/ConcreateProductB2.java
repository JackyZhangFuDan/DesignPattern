package designpattern.abstractfactory;

public class ConcreateProductB2 extends ProductB {

	@Override
	public void definition() {
		System.out.println("Another concreate product B class");
		
	}
	
	@Override
	public String name() {	
		return "Product B's 2st type of product";
	}

}
