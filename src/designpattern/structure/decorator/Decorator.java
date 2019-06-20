package designpattern.structure.decorator;

public abstract class Decorator implements Component {
	
	protected Component comp = null;
	
	public Decorator(Component comp) {
		this.comp = comp;
	}
	
	@Override
	public void definition() {
		System.out.println("Role: component interface");
	}

}
