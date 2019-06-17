package designpattern.construction.abstractfactory;

public class Factory2 implements Factory{

	@Override
	public void definition() {
		System.out.println("Factory class for product cluster 2");
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
