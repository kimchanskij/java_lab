package lab7_4;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double x, double y) {
        return Math.pow(x, y);
    }

    @Override
    public double module(double a, double b) {
        return pow(a*a + b*b, 0.5);
    }

    public double CircleLength(double R) {
        return 2*PI*R;
    }

    public double CircleSquare(double R) {
        return PI*pow(R, 2);
    }
}
