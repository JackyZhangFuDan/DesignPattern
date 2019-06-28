package designpattern.action.memento;


import designpattern.PatternRole;

public class Client implements PatternRole {

	@Override
	public void definition() {
		System.out.println("Role: client.");
	}
	
	/*
	 * 备忘录模式。
	 * 把Subject的内部信息保存起来，以备不时之需。涉及到的角色：1）Memo管理员；2）Subject；3）Memo，保存Subject某一时刻状态快照
	 */
	public static void main(String[] args) {
		Subject s = new Subject();
		s.setState1("s1");
		s.setState2("s2");
		
		System.out.println("after subject is created: ");
		s.print();
		
		Memento m = s.createMemento();
		
		MemoManager mm = new MemoManager();
		int idx = mm.addMemento(m);
		
		s.changeState("s11", "s22");
		System.out.println("after subject is changed:");
		s.print();
		
		m = mm.getMemento(idx);
		s.restore(m);
		System.out.println("after subject is restored:");
		s.print();
	}
}
