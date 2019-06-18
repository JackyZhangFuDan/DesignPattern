package designpattern.construction.prototype;

import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	public static void main(String[] args) {
		Prototype prototype = new ConcretePrototype();
		
		System.out.println("prototype:");
		prototype.printSelf();
		
		System.out.println("clone1:");
		((Prototype)prototype.copy()).printSelf();
		

		System.out.println("clone2:");
		((Prototype)prototype.copy()).printSelf();
	}
}
