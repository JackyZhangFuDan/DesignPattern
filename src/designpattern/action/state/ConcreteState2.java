package designpattern.action.state;

public class ConcreteState2 implements State {

	@Override
	public void definition() {
		System.out.println("Role: another concrete state");
	}

	@Override
	public void handle(Context context) {
		System.out.println("Concrete state 2 is woking on context");
		context.changeSomething();
	}

}
