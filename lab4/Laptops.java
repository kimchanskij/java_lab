package lab4;

public enum Laptops {
    MACBOOK (120000),
    ACER (50000),
    ASUS (60000),
    LENOVO (70000);

    private final int price;

    Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
