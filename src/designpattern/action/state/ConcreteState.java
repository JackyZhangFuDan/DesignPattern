package designpattern.action.state;

public class ConcreteState implements State {

	@Override
	public void definition() {
		System.out.println("Role: a concrete state");
	}

	@Override
	public void handle(Context context) {
		System.out.println("Concrete state is woking on context");
		context.changeSomething();
		
		//if necessary, state object can switch context's state:
		//context shouldn't be bother to take care state switching.
		System.out.println("current state finds that context needs to switch state, it makes that happen, with bothering context");
		ConcreteState2 s2 = new ConcreteState2();
		context.setState(s2);
		context.changeSomething();
	}
}
