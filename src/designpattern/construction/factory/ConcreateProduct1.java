package designpattern.construction.factory;

public class ConcreateProduct1 implements Product {

	@Override
	public void definition() {
		System.out.println("Concreate product class");
		
	}
	
	@Override
	public String name() {	
		return "A product";
	}

}
