package designpattern.action.state;

import designpattern.PatternRole;

public class Context implements PatternRole {
	
	private State state;
	
	@Override
	public void definition() {
		System.out.println("Role: context, which has state");	
	}
	
	public Context() {
		this.state = new ConcreteState();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void changeSomething() {
		System.out.println("context's information is changed......");
	}
	
	public void operation() {
		System.out.println("Context is doing something, then some steps depend on its state.");
		this.state.handle(this);
	}

}
