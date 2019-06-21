package designpattern.structure.proxy;

import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * 我们可以看到Proxy模式和Decorator模式的类图非常类似，但它们的目的上的区别也是明显的。Proxy应该说会尊重Subject的操作，不做修饰，侧重在成为一个“搬运工”
	 */
	public static void main(String[] args) {
		//这里我们在实例化代理对象时要求客户端指定被代理对象，那么也完全可以把Subject对客户端屏蔽掉，这样似乎更合乎代理的理念
		Proxy proxy = new Proxy(new ConcreteSubject());
		proxy.operation();
	}
}
