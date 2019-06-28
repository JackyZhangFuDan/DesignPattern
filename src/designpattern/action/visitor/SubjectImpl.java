package designpattern.action.visitor;

public class SubjectImpl implements Subject {
	
	private String data = "subject's data";
	
	@Override
	public void definition() {
		System.out.println("Role: Subject");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getData() {
		return this.data;
	}

}
