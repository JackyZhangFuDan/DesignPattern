package designpattern.structure.flyweight;

import designpattern.PatternRole;

public interface FlyWeight extends PatternRole {
	public void operation(UnSharedFlyWeight usfw);
}
