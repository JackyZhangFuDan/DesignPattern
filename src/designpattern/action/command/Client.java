package designpattern.action.command;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * 客户端指定Receiver，然后构建Command，把receiver告诉Command，最后通过Invoker去执行命令
	 */
	public static void main(String[] args) {
		Receiver r = new ReceiverA();
		Command c = new ConcreteCommandOne(r);
		Invoker i = new Invoker(c);
		
		i.call();
	}
}
