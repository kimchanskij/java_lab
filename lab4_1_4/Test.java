package lab4_1_4;

public class Test {
    public static void main(String[] args) {
        double[][] x = {{1.0, 2.0, 3.0},
                        {4.0, 5.0, 6.0},
                        {7.0, 8.0, 9.0}};
        double[][] y = {{1.0, 2.0, 3.0},
                        {4.0, 5.0, 6.0},
                        {7.0, 8.0, 9.0}};
        Matrix m = new Matrix(x);
        Matrix mm = new Matrix(y);
        System.out.println(m.Sum(mm));
        System.out.println(m.MultInt(5));
        System.out.println(m.Mult(mm));
    }
}
