package designpattern.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import designpattern.factory.Factory;
import designpattern.factory.Product;

public class TestFactory {
	
	@Test
	public void testFactory() {
		Product p1 = Factory.getProductInstance("1");
		System.out.println(p1.name());
		Product p2 = Factory.getProductInstance("2");
		System.out.println(p2.name());
		
		if(!p1.name().equals("A product")) fail();
		if(!p2.name().equals("Another product")) fail();
	}
}
