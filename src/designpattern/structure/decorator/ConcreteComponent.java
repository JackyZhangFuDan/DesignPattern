package designpattern.structure.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void definition() {
		System.out.println("Role: Concrete component");
		
	}

	@Override
	public void operation() {
		System.out.println("operation done by concrete component");
	}

}
