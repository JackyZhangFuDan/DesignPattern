package designpattern.construction.builder;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	public void testAbstractFactory() {
		//那么些mandatory的属性都放在构造函数里
		Product.Builder productBuilder = new Product.Builder(1, 2);
		//正是由于Builder的安排，我们这里可以以一种非常可读的方式设置Option的attrbute
		Product product = productBuilder.optionalAttr1(3).optionalAttr2(4).build();
	}
}
