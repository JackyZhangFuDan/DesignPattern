package designpattern.action.templatemethod;

public class Concrete extends Template {
	
	@Override
	public void definition() {
		System.out.println("Role: Concrete class which contains implementation of each steps");
	}
	
	@Override
	public void step1() {
		System.out.println("execute step 1.");
	}

	@Override
	public void step2() {
		System.out.println("execute step 2.");
	}

	@Override
	public void step3() {
		System.out.println("execute step 3.");
	}

}
