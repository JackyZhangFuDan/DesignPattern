package designpattern.structure.composite;

import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * 组合模式可以很好的表示层次结构，例如树。
	 * 有两种具体实现模式，这里采用Composite和Leaf用不同类的方式，比较清楚
	 * 在UML中“组合”代表部分之间不可独立存在的关联；而”聚合“代表部分之间可以分开独立存在的关联
	 */
	public static void main(String[] args) {
		Leaf l = new Leaf("l1");
		Composite c = new Composite("c1");
		Composite c2 = new Composite("c1c1");
		c.add( c2);
		c2.add(l);
		
		c.getInformation();
	}
}
