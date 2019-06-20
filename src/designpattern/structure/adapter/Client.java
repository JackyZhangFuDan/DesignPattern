package designpattern.structure.adapter;

import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	//在这个例子中，客户端以目标接口来访问Adaptee提供的服务，而Ataptee以自己的方式提供服务，完全不必理会外围调用的方式
	public static void main(String[] args) {
		Target adapter = new Adapter(new Adaptee());
		adapter.handler();
	}
}
