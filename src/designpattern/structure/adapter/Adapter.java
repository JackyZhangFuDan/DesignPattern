package designpattern.structure.adapter;

import designpattern.PatternRole;

/*
 * 这个Adapte是基于聚合的而不是继承
 */
public class Adapter implements Target {
	private Adaptee adaptee = null;
	
	public Adapter(Adaptee ade) {
		this.adaptee = ade;
	}
	
	@Override
	public void definition() {
		System.out.println("Role: adapter (composite mode)");
	}
	
	//当外来请求时，把请求的参数转化以后发给adaptee去处理，这里略去了参数转化，比较好理解
	@Override
	public void handler() {
		System.out.println("in handler of adapter.");
		this.adaptee.handleRequest();
	}
	
}
