package designpattern.structure.facade;

import designpattern.PatternRole;

public class SubSystemTwo implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: sub system");
	}
	
	public void operation2() {
		System.out.println("Sub system two is working.");
	}
}
