package designpattern.action.command;

public class ReceiverA implements Receiver {

	@Override
	public void definition() {
		System.out.println("Role: a concrete receiver: A");
	}

	@Override
	public void doAction() {
		System.out.println("Receiver A is acting according to command");
	}

}
