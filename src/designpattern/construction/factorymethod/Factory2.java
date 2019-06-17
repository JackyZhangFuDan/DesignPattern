package designpattern.construction.factorymethod;

public class Factory2 implements Factory{

	@Override
	public void definition() {
		System.out.println("Factory class for product 2");
	}
	
	@Override
	public Product createProductInstance() {
		return new ConcreateProduct2();
	}
}
