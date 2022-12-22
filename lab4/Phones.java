package lab4;

public enum Phones {
    IPHONE (80000),
    SAMSUNG (50000),
    XIAOMI (20000),
    HUAWEI (30000);

    private final int price;

    Phones(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
