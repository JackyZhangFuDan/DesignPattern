package designpattern.action.visitor;

public class VisitorImpl implements Visitor {

	@Override
	public void definition() {
		System.out.println("Role: Visitor");
	}

	@Override
	public void visit(Subject subject) {
		System.out.println("Visitor starts to deal with subject's data");
		System.out.println("Visitor got data: " + subject.getData());
	}

}
