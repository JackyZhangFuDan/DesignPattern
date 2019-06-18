package designpattern.construction.prototype;

import java.util.ArrayList;

import designpattern.PatternRole;

public class ConcretePrototype implements PatternRole, Prototype {
	
	private int property1 = 0;
	private int property2 = 0;
	private Object propertyObject = null;
	
	@Override
	public void definition() {
		System.out.println("Role: concrete prototype.");
	}
	
	public ConcretePrototype() {
		System.out.println("This is a very complex or time consuming process......");
		this.property1 = 10;
		this.property2 = 11;
		this.propertyObject = new ArrayList<String>();
		((ArrayList)this.propertyObject).add("string putted to the prototype");
	}
	
	@Override
	public Object copy() {
		ConcretePrototype clone = new ConcretePrototype();
		clone.property1 = this.property1;
		clone.property2 = this.property2;
		//深拷贝。如果propertyObject实现了Cloneable接口的话这里直接调用它是最好的，因为这个对象内部可能还引用了其它对象，只有它自己才能在内部clone
		clone.propertyObject = new ArrayList<String>(); 
		
		return clone;
	}

	@Override
	public void printSelf() {
		System.out.println("Myself information:");
		System.out.println("p1: " + this.property1);
		System.out.println("p2: " + this.property2);
		System.out.println("po: " + this.propertyObject);
		
	}
	
	
}
