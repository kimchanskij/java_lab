package lab4_1_8;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return 2*length+2*width;
    }

    public String toString() {
        return String.format("Длина: %.2f, Ширина: %.2f, Периметр: %.2f, Площадь: %.2f", length, width, this.getPerimeter(), this.getArea());
    }
}
