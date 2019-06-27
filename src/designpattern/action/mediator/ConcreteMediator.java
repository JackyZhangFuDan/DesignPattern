package designpattern.action.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
	
	private List<Party> parties = new ArrayList<Party>();
	
	@Override
	public void definition() {
		System.out.println("Role: Mediator");
	}

	@Override
	public void register(Party p) {
		this.parties.add(p);
	}

	@Override
	public void relay(Party sender, String msg) {
		for(Party p : this.parties) {
			if(sender != p) {
				p.receive(msg);
			}
		}
	}

}
