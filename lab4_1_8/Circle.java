package lab4_1_8;
import java.lang.Math;

public class Circle extends Shape{
    protected double radius;

    public Circle(){};
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public String toString() {
        return String.format("Радиус: %.2f, Длина окружности: %.2f, Площадь: %.2f", radius, this.getPerimeter(), this.getArea());
    }
}
