package lab6_10;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        CompBuild builder = new CompBuild();
        Computer comp1 = builder.Build();
        Computer comp2 = builder.Build();
        Computer comp3 = builder.Build();
        shop.addComp(comp1);
        shop.addComp(comp2);
        shop.addComp(comp3);
        shop.deleteComp(comp2);
        shop.findComp(comp3);
        shop.showCatalogue();
    }
}
