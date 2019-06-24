package designpattern.structure.flyweight;

public class ConcreteFlyWeightOne implements FlyWeight {

	@Override
	public void definition() {
		System.out.println("Role: Concrete Fly Weight Class");
		
	}
	
	public ConcreteFlyWeightOne() {
		super();
		System.out.println("Fly weight instance is created, type is one.");
	}
	
	@Override
	public void operation(UnSharedFlyWeight usfw) {
		System.out.println("Fly Weight type one, operation is triggerred, with unshared state: " + usfw.state);
	}

}
