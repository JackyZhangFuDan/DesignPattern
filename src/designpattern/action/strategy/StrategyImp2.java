package designpattern.action.strategy;

public class StrategyImp2 implements Strategy {

	@Override
	public void definition() {
		System.out.println("Role: another implementation of strategy");
		
	}

	@Override
	public void strategy() {
		System.out.println("This is strategy implementation two");
	}

}
