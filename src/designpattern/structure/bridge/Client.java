package designpattern.structure.bridge;

import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * Bridge模式的目的是通过组合来减少类的继承，减少子类个数
	 * 当有多个维度一起变化从而会演化出许多子类时考虑用Bridge模式简化类。让各个维度都有自己的类系列，然后让一个维度上的类起Bridge的作用去组合其它维度的类
	 */
	public static void main(String[] args) {
		System.out.println("Test Aspect One + One:");
		AspectBridge ab = new AspectBridgeClassOne(new AspectOneClassOne());
		ab.operation();
		
		System.out.println("Test Aspect Two + One:");
		ab = new AspectBridgeClassTwo(new AspectOneClassOne());
		ab.operation();
		
		System.out.println("Test Aspect Two + Two:");
		ab = new AspectBridgeClassTwo(new AspectOneClassTwo());
		ab.operation();
	}
}
