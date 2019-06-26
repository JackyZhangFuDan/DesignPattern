package designpattern.action.chainofresponsibility;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * 
	 */
	public static void main(String[] args) {
		Handler head = new HandlerOne();
		Handler h = new HandlerTwo();
		head.setNext(h);
		
		head.handle("two");
	}
}
