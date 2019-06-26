package designpattern.action.command;

public class ConcreteCommandOne implements Command {
	private Receiver actor = null;
	
	public ConcreteCommandOne(Receiver r) {
		this.actor = r;
	}

	@Override
	public void definition() {
		System.out.println("Role: concrete command");
	}

	@Override
	public void act() {
		System.out.println("concreate command one starts to ask receiver to take action");
		this.actor.doAction();
	}
	
}
