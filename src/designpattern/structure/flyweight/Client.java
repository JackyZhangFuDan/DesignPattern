package designpattern.structure.flyweight;

import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * Fly Weight模式的核心思想是共享，从而节省内存等资源。能共享是有前提的：大量同质对象有大量无状态的内部属性，而那些有状态的属性可以剥离出去。
	 * 于是可以把无状态的属性抽出来构成享元，有状态的属性抽出去构成非享元；内存中每个类型只要一个instance就够了；
	 * 而通过享元进行操作时直接传入那些非享元instance给享元，从而完成操作。
	 */
	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		
		FlyWeight fw1 = factory.getFlyWeight1("typeone1");
		FlyWeight fw2 = factory.getFlyWeight1("typeone2");
		FlyWeight fw3 = factory.getFlyWeight1("typeone1");
		
		FlyWeight fw4 = factory.getFlyWeight2("typetwo1");
		FlyWeight fw5 = factory.getFlyWeight2("typetwo2");
		FlyWeight fw6 = factory.getFlyWeight2("typetwo2");
		
		fw1.operation(new UnSharedFlyWeight("state1"));
		fw2.operation(new UnSharedFlyWeight("state2"));
		fw3.operation(new UnSharedFlyWeight("state2"));
		fw4.operation(new UnSharedFlyWeight("state4"));
		fw5.operation(new UnSharedFlyWeight("state4"));
		fw6.operation(new UnSharedFlyWeight("state5"));
	}
}
