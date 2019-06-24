package designpattern.structure.flyweight;

import java.util.HashMap;

import designpattern.PatternRole;

public class FlyWeightFactory implements PatternRole {
	
	private HashMap<String, FlyWeight> flyPool = new HashMap<String, FlyWeight>();
	
	@Override
	public void definition() {
		System.out.println("Role: Fly Weight Factory");
	}
	
	public FlyWeight getFlyWeight1(String key) {
		FlyWeight result = this.flyPool.get(key);
		
		if(result == null) {
			result = new ConcreteFlyWeightOne();
			this.flyPool.put(key, result);
		}
		
		return result;
	}
	
	public FlyWeight getFlyWeight2(String key) {
		FlyWeight result = this.flyPool.get(key);
		
		if(result == null) {
			result = new ConcreteFlyWeightTwo();
			this.flyPool.put(key, result);
		}
		
		return result;
	}

}
