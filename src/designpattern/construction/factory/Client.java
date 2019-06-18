package designpattern.construction.factory;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	public static void main(String[] args) {
		Product p1 = Factory.getProductInstance("1");
		System.out.println(p1.name());
		Product p2 = Factory.getProductInstance("2");
		System.out.println(p2.name());
		
	}
}
