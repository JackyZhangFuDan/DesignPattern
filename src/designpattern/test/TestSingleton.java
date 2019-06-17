package designpattern.test;

import org.junit.Test;

import designpattern.construction.singleton.Singleton;

public class TestSingleton {

	@Test
	public void testSingleton() {
		Singleton instance = null; 
		System.out.println("main method.");
		instance = Singleton.getInstance();
	}
}
