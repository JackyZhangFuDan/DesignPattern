package designpattern.structure.adapter;

import designpattern.PatternRole;

public class Adaptee implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: adaptee");
	}
	
	//Adaptee原始提供的服务接口
	public void handleRequest() {
		System.out.println("in handler of adaptee.");
		//do something here
	}

}
