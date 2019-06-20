package designpattern.structure.decorator;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component comp) {
		super(comp);
	}

	@Override
	public void operation() {
		this.additioinalOperations();
		this.comp.operation();
	}
	
	private void additioinalOperations() {
		System.out.println("aditional operations are done in concrete decorator.");
	}

}
