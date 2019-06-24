package designpattern.structure.composite;

import java.util.HashMap;
import java.util.Map;

import designpattern.structure.composite.Component;

public class Composite implements Component {
	
	private String key = null;
	private Map<String, Component> components = new HashMap<String, Component>();
	
	@Override
	public void definition() {
		System.out.println("Role: Composite");
	}

	@Override
	public void getInformation() {
		System.out.println("Componsite operation is called. Its key: "+this.key);
		for(Component comp : this.components.values()) {
			comp.getInformation();
		}
	}
	
	public Composite(String key) {
		this.key = key;
	}
	
	public void add(Component comp) {
		this.components.put(comp.getKey(), comp);
	}
	
	public void remove(String key) {
		this.components.remove(key);
	}

	@Override
	public String getKey() {
		return this.key;
	}

	

}
