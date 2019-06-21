package designpattern.structure.bridge;

public class AspectBridgeClassTwo implements AspectBridge {
	private AspectOne aspectOne = null;
	
	public AspectBridgeClassTwo(AspectOne ao) {
		this.aspectOne = ao;
	}
	
	@Override
	public void definition() {
		System.out.println("Role: Class two of class which take bridge role too");
	}

	@Override
	public void operation() {
		this.aspectOne.aspectOneContribution();
		System.out.println("Aspect bridge's class-two contribution.");
	}
}
