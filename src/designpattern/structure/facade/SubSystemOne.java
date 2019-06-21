package designpattern.structure.facade;

import designpattern.PatternRole;

public class SubSystemOne implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: sub system");
	}
	
	public void operation1() {
		System.out.println("Sub system one is working.");
	}
}
