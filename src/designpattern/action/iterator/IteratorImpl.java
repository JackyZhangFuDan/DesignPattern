package designpattern.action.iterator;

public class IteratorImpl implements Iterator {
	
	private Object[] agg = null;
	private int idx = -1;
	
	public IteratorImpl(Object[] aggs) {
		this.agg = aggs;
	}
	
	@Override
	public void definition() {
		System.out.println("Role: Iterator Implementation");
	}

	@Override
	public Object first() {
		return this.agg[0];
	}

	@Override
	public Object next() {
		if(this.agg == null) {
			return null;
		}
		if(idx >= this.agg.length - 1) {
			return null;
		}
		return this.agg[++idx];
	}

	@Override
	public boolean hasNext() {
		if(this.agg == null) {
			return false;
		}
		if(idx >= this.agg.length-1) {
			return false;
		}
		return true;
	}

}
