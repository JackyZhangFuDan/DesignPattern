package designpattern.construction.builder;

import designpattern.PatternRole;

/*
 * 这是一个简化了的Builder模式，在各种框架中被广泛应用着
 */
public class Product implements PatternRole {
	
	private int mandatoryAttr1;
	private int mandatoryAttr2;
	
	private int optionalAttr1;
	private int optionalAttr2;
	
	@Override
	public void definition() {
		System.out.println("Role: Product");
	}
	
	private Product(int ma1, int ma2) {
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

	public static class Builder{
		private int ma1;
		private int ma2;
		
		private int oa1;
		private int oa2;
		
		public Builder(int ma1, int ma2) {
			this.ma1 = ma1;
			this.ma2 = ma2;
		}
		
		public Builder optionalAttr1(int v) {
			this.oa1 = v;
			return this;
		}
		
		public Builder optionalAttr2(int v) {
			this.oa2 = v;
			return this;
		}
		
		public boolean validation() {
			//TODO: some checks here
			return true;
		}
		
		public Product build() {
			if(!this.validation()) {
				return null;
			}
			
			Product p = new Product(this.ma1, this.ma2);
			p.optionalAttr1 = this.oa1;
			p.optionalAttr2 = this.oa2;
			
			return p;
		}
	}
}
