package designpattern.structure.bridge;


public class AspectOneClassOne implements AspectOne {
	@Override
	public void definition() {
		System.out.println("Role: One class of Aspect One.");
	}

	@Override
	public void aspectOneContribution() {
		System.out.println("aspect one's class one contribution");
	}

}
