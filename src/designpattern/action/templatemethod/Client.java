package designpattern.action.templatemethod;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	
	public static void main(String[] args) {
		Concrete c = new Concrete();
		c.algorithm();
	}
}
