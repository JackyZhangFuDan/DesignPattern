package designpattern.factorymethod;

public class Factory1 implements Factory{

	@Override
	public void definition() {
		System.out.println("Factory class for product 1");
	}
	
	@Override
	public Product createProductInstance() {
		return new ConcreateProduct1();
	}
}
