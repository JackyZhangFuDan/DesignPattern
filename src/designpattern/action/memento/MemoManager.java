package designpattern.action.memento;

import java.util.ArrayList;
import java.util.List;

import designpattern.PatternRole;

public class MemoManager implements PatternRole {
	
	private List<Memento> memos = new ArrayList<Memento>();
	
	@Override
	public void definition() {
		System.out.println("Role: Memento manager who will keep memento list");
	}
	
	public int addMemento(Memento m) {
		int idx = this.memos.size();
		this.memos.add(m);
		return idx;
	}
	
	public Memento getMemento(int index) {
		return this.memos.get(index);
	}
}
