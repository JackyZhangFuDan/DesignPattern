package designpattern.construction.singleton;

import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	public static void main(String[] args) {
		Singleton instance = null; 
		System.out.println("main method.");
		instance = Singleton.getInstance();
	}
}
