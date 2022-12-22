package lab6_11;

public class Test {
    public static void main(String[] args) {
        Convertable obj1 = new fromCtoK();
        obj1.convert(10);
        Convertable obj2 = new fromCtoF();
        obj2.convert(-40);
    }
}
