package lab2_3;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Circle> array = new ArrayList<>();
        int amount;
        Circle first = new Circle(new Point(5, 5), 0, 0);
        Circle second = new Circle(new Point(-1, 10), -3, 7);
        array.add(first);
        array.add(second);
        amount = array.size();
        for (Circle x : array) {
            System.out.println(x + "\n");
        }
        System.out.println("Количество элементов в массиве: " + amount);
    }
}
