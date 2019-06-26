package designpattern.action.chainofresponsibility;

public class HandlerOne implements Handler {
	
	private Handler next;
	
	@Override
	public void definition() {
		System.out.println("Role: a concrete handler");
		
	}

	@Override
	public void handle(String request) {
		if(request.contains("one")) {
			System.out.println("Handler one can handle it");
		}else {
			System.out.println("Handler one can't handle it");
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
