package designpattern.construction.abstractfactory;

public class ConcreateProductB2 extends ProductB {

	@Override
	public void definition() {
		System.out.println("Another concreate product B class");
		
	}
	
	@Override
	public String name() {	
		return "Product B's the 2nd product cluster";
	}

}
