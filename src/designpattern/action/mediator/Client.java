package designpattern.action.mediator;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * 中介模式把对象之间的网状关系转化为星型关系，对象之间的交互不再是直接进行-这样就要求每个人都直到所有人，而是通过中介者来完成
	 */
	public static void main(String[] args) {
		Mediator m = new ConcreteMediator();
		Party p1 = new ConcreteParty(m);
		Party p2 = new ConcreteParty(m);
		Party p3 = new ConcreteParty(m);
		
		p1.send("hello hello!!");
	}
}
