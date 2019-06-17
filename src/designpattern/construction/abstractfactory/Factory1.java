package designpattern.construction.abstractfactory;

public class Factory1 implements Factory{

	@Override
	public void definition() {
		System.out.println("Factory class for product cluster 1");
	}
	
	@Override
	public ProductA createProductAInstance() {
		return new ConcreateProductA1();
	}
	
	@Override
	public ProductB createProductBInstance() {
		return new ConcreateProductB1();
	}
}
