package designpattern.construction.builder.v1;

import designpattern.PatternRole;

public class ConcreteBuilder implements PatternRole{
    private int mAttr1;
	private int mAttr2;
	
	private int oAttr1;
	private int oAttr2;
    
    @Override
	public void definition() {
		System.out.println("Role: Builder.");
	}

    public ConcreteBuilder(int m1, int m2){
        this.mAttr1 = m1;
        this.mAttr2 = m2;
    }

    public Product build(){
        if(this.validate()){
            Product p = new Product(mAttr1, mAttr2);
            p.setOptionalAttr1(oAttr1);
            p.setMandatoryAttr2(oAttr2);
            return p;
        }
        return null;
    }

    public ConcreteBuilder setOptionalAttr1(int v){
        this.oAttr1 = v;
        return this;
    } 
    public ConcreteBuilder setOptionalAttr2(int v){
        this.oAttr2 = v;
        return this;
    }

    private bool validate(){
        //TODO: do some check here ...
        return true;
    }
}
