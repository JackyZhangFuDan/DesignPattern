package designpattern.action.visitor;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * Visitor模式是把操作和数据分离的一种模式。
	 * Visitor里面设立操作Subject的数据的visit方法，Subject是输入；Subject设立让Visitor来操作自己数据的accept方法，Visitor是参数
	 */
	public static void main(String[] args) {
		Subject s = new SubjectImpl();
		Visitor v = new VisitorImpl();
		s.accept(v);
	}
}
