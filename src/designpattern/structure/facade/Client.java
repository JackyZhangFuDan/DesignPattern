package designpattern.structure.facade;

import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	//这里我们把component外面包了一层，做些其它的事情
	//Decorator可以有多个实现类，Client根据需要选取使用哪个
	public static void main(String[] args) {
		SubSystemOne sso = new SubSystemOne();
		SubSystemTwo sst = new SubSystemTwo();
		Facade facade = new Facade(sso,sst);
		facade.operation();
	}
}
