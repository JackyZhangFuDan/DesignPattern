package designpattern.structure.proxy;

public class Proxy implements Subject {
	
	private Subject subject = null;
	
	public Proxy(Subject sub) {
		this.subject = sub;
	}
	
	@Override
	public void definition() {
		System.out.println("Role: proxy");
	}

	@Override
	public void operation() {
		System.out.println("Proxy is calling the subject");
		this.subject.operation();
	}

}
