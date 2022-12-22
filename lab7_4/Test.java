package lab7_4;

public class Test {
    public static void main(String[] args) {
        MathFunc object = new MathFunc();
        System.out.printf("%.2f; %.2f; %.2f; %.2f",
                object.pow(3, 4),
                object.module(4, 3),
                object.CircleLength(5),
                object.CircleSquare(5));
    }
}
