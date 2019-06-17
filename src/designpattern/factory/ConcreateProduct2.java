package designpattern.factory;

public class ConcreateProduct2 implements Product {

	@Override
	public void definition() {
		System.out.println("Another concreate product class");
		
	}

	@Override
	public String name() {	
		return "Another product";
	}

}
