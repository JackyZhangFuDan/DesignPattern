package designpattern.action.strategy;

public class StrategyImp implements Strategy {

	@Override
	public void definition() {
		System.out.println("Role: implementation of strategy");
		
	}

	@Override
	public void strategy() {
		System.out.println("This is strategy implementation one");
	}

}
