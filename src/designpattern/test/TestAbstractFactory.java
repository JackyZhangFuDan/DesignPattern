package designpattern.test;

import org.junit.Test;

import designpattern.construction.abstractfactory.Factory;
import designpattern.construction.abstractfactory.Factory1;
import designpattern.construction.abstractfactory.ProductA;
import designpattern.construction.abstractfactory.ProductB;

public class TestAbstractFactory {
	/*
	 * 和工厂方法模式相比，抽象工厂模式的区别是一个工厂类可以生产多个类型的产品，而不是单个类型. 在没有其它区别
	 */
	@Test
	public void testAbstractFactory() {
		Factory f = new Factory1();
		ProductA pa = f.createProductAInstance();
		ProductB pb = f.createProductBInstance();
		
		System.out.println(pa.name());
		System.out.println(pb.name());
	}
}
