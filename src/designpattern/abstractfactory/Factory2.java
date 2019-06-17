package designpattern.abstractfactory;

public class Factory2 implements Factory{

	@Override
	public void definition() {
		System.out.println("Factory class for product 2");
	}
	
	@Override
	public ProductA createProductAInstance() {
		return new ConcreateProductA2();
	}
	
	@Override
	public ProductB createProductBInstance() {
		return new ConcreateProductB2();
	}
}
