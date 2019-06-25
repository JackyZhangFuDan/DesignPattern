package designpattern.action.strategy;

import designpattern.PatternRole;

public class Context implements PatternRole {
	
	private Strategy s = null;
	
	@Override
	public void definition() {
		System.out.println("Role: Context which uses the strategy");
	}
	
	public Context(Strategy s) {
		this.s = s;
	}
	
	public void setStrategy(Strategy s) {
		this.s = s;
	}
	
	public void action() {
		System.out.println("Context is started, need to consider strategy......");
		this.s.strategy();
	}
}
