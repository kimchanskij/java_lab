package lab3_2_1;

public class lab {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    public static void ex1() {
        Double x1 = Double.valueOf("9");
        Double x2 = Double.valueOf("5");
        System.out.println(x1 + "\n" + x2);
    }

    public static void ex2() {
        String x = "123";
        double res = Double.parseDouble(x);
        System.out.println(res);
    }

    public static void ex3() {
        Double x = Double.valueOf("1");
        System.out.println(x.byteValue() + " " + x.shortValue() + " " + x.intValue() + " " + x.longValue() + " " + x.floatValue());
    }

    public static void ex4() {
        Double x = Double.valueOf("5");
        System.out.println(x);
    }

    public static void ex5() {
        double x = 1.1;
        String d = Double.toString(x);
        System.out.println(d);
    }
}
