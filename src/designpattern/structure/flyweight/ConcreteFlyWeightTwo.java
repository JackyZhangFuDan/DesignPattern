package designpattern.structure.flyweight;

public class ConcreteFlyWeightTwo implements FlyWeight {

	@Override
	public void definition() {
		System.out.println("Role: Concrete Fly Weight Class");
	}
	
	public ConcreteFlyWeightTwo() {
		super();
		System.out.println("Fly weight instance is created, type is two.");
	}
	
	@Override
	public void operation(UnSharedFlyWeight usfw) {
		System.out.println("Fly Weight type two, operation is triggerred, with unshared state: " + usfw.state);
		
	}

}
