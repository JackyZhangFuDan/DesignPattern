package designpattern.action.memento;

import designpattern.PatternRole;

public class Memento implements PatternRole {
	
	private String state1;
	private String state2;
	
	@Override
	public void definition() {
		System.out.println("Role: memento");
	}
	
	public Memento(String s1, String s2) {
		this.state1 = s1;
		this.state2 = s2;
	}
	
	public String getState1() {
		return this.state1;
	}
	
	public String getState2() {
		return this.state2;
	}
}
