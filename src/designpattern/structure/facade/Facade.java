package designpattern.structure.facade;

import designpattern.PatternRole;

public class Facade implements PatternRole {
	
	private SubSystemOne subOne = null;
	private SubSystemTwo subTwo = null;
	
	public Facade(SubSystemOne sso, SubSystemTwo sst) {
		this.subOne = sso;
		this.subTwo = sst;
	}
	
	@Override
	public void definition() {
		System.out.println("Role: facade");
	}
	
	public void operation() {
		System.out.println("Facade operation is triggered, it starts to coordinate sub systems to finish the action.");
		this.subOne.operation1();
		this.subTwo.operation2();
	}
}
