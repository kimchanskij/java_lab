package lab2_3;

public class Circle {
    private double centerX;
    private double centerY;
    private Point point;

    Circle(Point point, double centerX, double centerY) {
        this.point = point;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public String toString() {
        return "Центр окружности: (" + centerX + ", " + centerY + ")\nРадиус-точка: (" + point.getX() + ", " + point.getY() + ")";
    }

}
