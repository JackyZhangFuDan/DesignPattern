package designpattern.structure.bridge;

public class AspectBridgeClassOne implements AspectBridge {
	
	private AspectOne aspectOne = null;
	
	public AspectBridgeClassOne(AspectOne ao) {
		this.aspectOne = ao;
	}
	
	@Override
	public void definition() {
		System.out.println("Role: Class one of class which take bridge role too");
	}

	@Override
	public void operation() {
		this.aspectOne.aspectOneContribution();
		System.out.println("Aspect bridge's class-one contribution.");
	}

}
