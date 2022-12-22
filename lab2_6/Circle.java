package lab2_6;

public class Circle {
    private int R;
    private double length;
    private double square;

    public Circle(int R) {
        this.R = R;
    }

    public double Square() {
        square = 3.14*R*R;
        return square;
    }

    public double Length() {
        length = 2*3.14*R;
        return length;
    }

    public boolean Compare(Circle object) {
        if (object.R == R) {
            return true;
        }
        return false;
    }
}
