package designpattern.action.templatemethod;

import designpattern.PatternRole;

public abstract class Template implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: Abstract class which contains algorithm frame");
	}
	
	public void algorithm() {
		System.out.println("Algorithm starts.");
		this.step1();
		this.step2();
		this.step3();
	}
	
	public abstract void step1();
	public abstract void step2();
	public abstract void step3();
}
