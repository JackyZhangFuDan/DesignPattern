package designpattern.singleton;

/*
 * 这里用了一个静态内部类来持有单一实例，利用的是静态内部类的如下特性：
 * 1，静态内部类只有在被使用时才会被jvm加载。也就是说它并不像其外层类的静态属性和静态块一样当外部类被加载时就被加载了。这个性质就达成了单例的延迟加载
 * 2，类的加载会被jvm保证线程安全，也就是说两个线程同时出发类加载的话jvm会保证该类只被加载一次。这个性质就达成了单例的线程安全
 * 这是目前看到的既简洁又周到的单例实现机制
 */
public class Singleton {
	
	static {
		System.out.println("Singleton static constructor");
	}
	
	private Singleton() {
		System.out.println("Singleton.constructor()");
	}
	
	public static Singleton getInstance() {
		System.out.println("Singleton.getInstance()");
		return Singleton.InstanceHolder.instance;
	}
	
	private static class InstanceHolder {
		public static Singleton instance = new Singleton();
		
		static {
			System.out.println("InstanceHolder static constructor");
		}
	}
	
	public static void main(String[] args) {
		//这个语句执行完后，外部类Singleton被加载，但静态内部类InstanceHolder并没有被加载. 
		//这个demo中可能体现不出外部类的加载是这个语句触发的，因为这里main函数是在外部类上的，外部类必然最先加载
		Singleton instance = null; 
		
		System.out.println("main method.");
		
		instance = Singleton.getInstance();
	}

}
