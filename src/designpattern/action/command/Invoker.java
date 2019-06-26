package designpattern.action.command;

import designpattern.PatternRole;

public class Invoker implements PatternRole {
	
	private Command command = null;
	
	@Override
	public void definition() {
		System.out.println("Role: command invoker, it just takes command instance from client and invoker it");
	}
	
	public Invoker(Command comm) {
		this.command = comm;
	}
	
	public void setCommand(Command com) {
		this.command = com;
	}
	
	public void call() {
		System.out.println("Invoker starts to call the command");
		this.command.act();
	}
}
