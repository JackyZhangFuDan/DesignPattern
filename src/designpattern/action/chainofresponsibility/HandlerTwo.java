package designpattern.action.chainofresponsibility;

public class HandlerTwo implements Handler {

	private Handler next;
	
	@Override
	public void definition() {
		System.out.println("Role: a concrete handler");
		
	}

	@Override
	public void handle(String request) {
		if(request.contains("two")) {
			System.out.println("Handler two can handle it");
		}else {
			System.out.println("Handler two can't handle it");
			if(this.next != null) {
				this.next.handle(request);
			}
		}
	}

	@Override
	public void setNext(Handler next) {
		this.next = next;
	}
}
