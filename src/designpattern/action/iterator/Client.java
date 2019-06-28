package designpattern.action.iterator;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * 我们这里Iterator做成了全局类，这就要求Aggregation类把内部数据传递给Iterator，所以更合适的做法是把Iterator做成aggregation的内部类
	 */
	public static void main(String[] args) {
		String[] data = new String[2];
		data[0] = "1";
		data[1] = "2";
		
		Aggregate agg = new AggregateImpl(data);
		Iterator it = agg.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o.toString());
		}
	}
}
