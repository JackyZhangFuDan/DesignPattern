package designpattern.structure.composite;

import designpattern.structure.composite.Component;

public class Leaf implements Component {
	
	private String key = null;
	
	public Leaf(String key) {
		this.key = key;
	}
	
	@Override
	public void definition() {
		System.out.println("Role: Leaf");
	}

	@Override
	public void getInformation() {
		System.out.println("leaf operation is called, leaf's key: "+this.key);
	}

	@Override
	public String getKey() {
		return this.key;
	}

}
