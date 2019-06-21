package designpattern.structure.proxy;

public class ConcreteSubject implements Subject {

	@Override
	public void definition() {
		System.out.println("Role: Subject Implementation");
	}

	@Override
	public void operation() {
		System.out.println("Subject's implementation takes action.");
	}
	
	

}
