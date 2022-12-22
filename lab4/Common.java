package lab4;

public enum Common {
    MACBOOK (120000),
    ACER (50000),
    ASUS (60000),
    LENOVO (70000),
    IPHONE (80000),
    SAMSUNG (50000),
    XIAOMI (20000),
    HUAWEI (30000);

    private final int price;

    Common(int price) {
        this.price = price;
    }

    public int getPrice() { return this.price; }
}