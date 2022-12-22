package lab2_6;

public class Test {
    public static void main(String[] args) {
        Circle object1 = new Circle(15);
        Circle object2 = new Circle(10);
        System.out.println(object1.Compare(object2));
        System.out.println(object1.Length());
        System.out.println(object1.Square());
    }
}
