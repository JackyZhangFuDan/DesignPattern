package designpattern.action.iterator;

public class AggregateImpl implements Aggregate {
	
	private Object[] collections = null;
	
	@Override
	public void definition() {
		System.out.println("Role: Aggregate Implementation");
	}

	@Override
	public Iterator iterator() {
		return new IteratorImpl(this.collections);
	}
	
	public AggregateImpl(Object[] collections) {
		this.collections = collections;
	}
}
