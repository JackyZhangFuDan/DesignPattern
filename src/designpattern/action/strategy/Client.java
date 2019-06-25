package designpattern.action.strategy;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * 当Context在运行时，它需要依赖strtegy来做决定，这时候不同的strategy自然会带来不同结果
	 * context可以不关心具体strategy的实现内容，按需调换strategy而不用改程序
	 */
	public static void main(String[] args) {
		Strategy s1 = new StrategyImp();
		Strategy s2 = new StrategyImp2();
		
		Context c = new Context(s1);
		c.action();
		
		c.setStrategy(s2);
		c.action();
	}
}
