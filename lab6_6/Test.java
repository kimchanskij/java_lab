package lab6_6;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Printable> array = new ArrayList<>();
        array.add(new Shop("GQ", "Самые влиятельные люди"));
        array.add(new Book("Ведьмак", "Сапковский", 1986));
        array.add(new Shop("Forbes", "100 самых богатых людей"));
        array.add(new Book("Марсианские хроники", "Брэдбери", 1950));
        for (Printable x: array) {
            x.Print();
        }
    }
}
