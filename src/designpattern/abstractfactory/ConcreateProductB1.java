package designpattern.abstractfactory;

public class ConcreateProductB1 extends ProductB {

	@Override
	public void definition() {
		System.out.println("A concreate product B class");
		
	}
	
	@Override
	public String name() {	
		return "Product B's 1st type of product";
	}

}
