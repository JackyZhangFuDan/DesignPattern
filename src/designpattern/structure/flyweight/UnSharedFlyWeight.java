package designpattern.structure.flyweight;

import designpattern.PatternRole;

public class UnSharedFlyWeight implements PatternRole {
	
	public String state;
	
	@Override
	public void definition() {
		System.out.println("Role: Unshared Fly Weight State.");
		
	}
	
	public UnSharedFlyWeight(String state) {
		this.state = state;
	}

}
