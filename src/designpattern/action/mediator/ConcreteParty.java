package designpattern.action.mediator;

public class ConcreteParty implements Party {
	
	private Mediator m = null;
	
	public ConcreteParty(Mediator m) {
		this.m = m;
		m.register(this);
	}
	
	@Override
	public void definition() {
		System.out.println("Role: concrete party");
	}
	
	@Override
	public void send(String msg) {
		System.out.println("one party is sending message to others......");
		this.m.relay(this, "hello from a party");
	}

	@Override
	public void receive(String msg) {
		System.out.println("I ( a party ) get message from others :" + msg);
	}

}
