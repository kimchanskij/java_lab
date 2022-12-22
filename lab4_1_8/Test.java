package lab4_1_8;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.toString());
        Rectangle r = new Rectangle(10, 5, "Red", true);
        System.out.println(r.toString());
        Square s = new Square(7, "Black", false);
        System.out.println(s.toString());
    }
}
