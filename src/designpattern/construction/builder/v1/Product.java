package designpattern.construction.builder.v1;

import designpattern.PatternRole;

public class Product implements PatternRole{
    private int mandatoryAttr1;
	private int mandatoryAttr2;
	
	private int optionalAttr1;
	private int optionalAttr2;

	@Override
	public void definition() {
		System.out.println("Role: Product.");
	}
	
    public Product(int ma1, int ma2) {
		this.mandatoryAttr1 = ma1;
		this.mandatoryAttr2 = ma2;
	}
	
	public int getMandatoryAttr1() {
		return mandatoryAttr1;
	}

	public void setMandatoryAttr1(int mandatoryAttr1) {
		this.mandatoryAttr1 = mandatoryAttr1;
	}

	public int getMandatoryAttr2() {
		return mandatoryAttr2;
	}

	public void setMandatoryAttr2(int mandatoryAttr2) {
		this.mandatoryAttr2 = mandatoryAttr2;
	}

	public int getOptionalAttr1() {
		return optionalAttr1;
	}

	public void setOptionalAttr1(int optionalAttr1) {
		this.optionalAttr1 = optionalAttr1;
	}

	public int getOptionalAttr2() {
		return optionalAttr2;
	}

	public void setOptionalAttr2(int optionalAttr2) {
		this.optionalAttr2 = optionalAttr2;
	}
}
