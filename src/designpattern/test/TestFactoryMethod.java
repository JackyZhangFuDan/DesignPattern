package designpattern.test;

import org.junit.Test;

import designpattern.construction.factorymethod.Factory1;
import designpattern.construction.factorymethod.Product;

public class TestFactoryMethod {
	
	/*
	 * 和简单工厂相比（designpattern.facory），工厂方法要客户端自己调用正确的工厂类来获取正确产品，而不是向同一个工厂传入不同参数来获取不同产品
	 * 其实客户端的工作没有本质的减轻，甚至还稍有加重。但好处是开闭原则被遵守了：当有新产品时不必修改已有代码，加入新产品类和工厂类就可以了
	 */
	@Test
	public void testFactoryMethodPattern() {
		//需要那种类型的产品，客户端就需要自己调用那种类型的产品工厂
		Product p1 = new Factory1().createProductInstance();
		System.out.println(p1.name());
	}
}