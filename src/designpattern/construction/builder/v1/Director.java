package designpattern.construction.builder.v1;

public class Director {
    private ConcreteBuilder builder = null;

    public Director(int a1, int a2){
        this.builder = new ConcreteBuilder(a1, a2);
    }

    /*
     * 复杂的构建规则在这里......
     * 以下简化处理，每个情况造一个方法
     */

    public Product construct(int a3, int a4){
        if(this.builder != null) return null;
        return this.builder.setOptionalAttr1(a3).setOptionalAttr2(a4).build();
    };

    public Product constructWithout4thAttribute(int a4){
        if(this.builder != null) return null;
        return this.builder.setOptionalAttr1(a3).build();
    };

    public Product constructWithout3thAttribute(int a3){
        if(this.builder != null) return null;
        return this.builder.setOptionalAttr2(a4).build();
    };
}
