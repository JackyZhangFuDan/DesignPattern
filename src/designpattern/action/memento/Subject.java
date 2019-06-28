package designpattern.action.memento;

import designpattern.PatternRole;

public class Subject implements PatternRole {
	
	private String state1;
	private String state2;
	
	@Override
	public void definition() {
		System.out.println("Role: Object has state information");
	}
	
	public void setState1(String v) {
		this.state1 = v;
	}
	
	public void setState2(String v) {
		this.state2 = v;
	}
	
	public Memento createMemento() {
		return new Memento(this.state1,this.state2);
	}
	
	public void restore(Memento m) {
		this.state1 = m.getState1();
		this.state2 = m.getState2();
	}
	
	public void changeState(String state1, String state2) {
		this.state1 = state1;
		this.state2 = state2;
	}
	
	public void print() {
		System.out.println("Sate 1: " + state1 + "; State 2: " + state2);
	}
}
