package designpattern.construction.builder.v1;

import designpattern.PatternRole;

public class Client implements PatternRole{
	
	@Override
	public void definition() {
		System.out.println("Role: Client.");
	}

	public void testAbstractFactory() {	
		Director director = new Director(1, 2);
		
		//得到product
		Product product1 = director.construct(3,4);
		Product product2 = director.constructWithout3thAttribute(3);
		Product product3 = director.constructWithout4thAttribute(4);
	}
}
