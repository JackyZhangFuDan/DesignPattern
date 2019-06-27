package designpattern.action.state;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * 状态模式，用于把context中随着某些“状态”改变而改变的操作隔离到State对象中
	 * 需要注意的是context状态的切换也是由state对象来完成的，context完全不必关心状态相关的问题。相比于策略模式，处理状态切换过程中的繁琐工作是状态模式的特点
	 */
	public static void main(String[] args) {
		Context	context = new Context();
		context.operation();
	}
}
