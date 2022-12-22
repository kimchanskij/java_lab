package lab4_1_8;

public class Square extends Rectangle{
    protected double side;
    public Square(){}
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        width = side;
    }

    public void setLength(double side) {
        length = side;
    }

    public String toString() {
        return String.format("Сторона: %.2f, Периметр: %.2f, Площадь: %.2f", side, this.getPerimeter(), this.getArea());
    }
}
