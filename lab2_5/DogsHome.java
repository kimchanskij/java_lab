package lab2_5;
import java.util.ArrayList;
import java.util.Scanner;

public class DogsHome {
    private static ArrayList<Dog> array = new ArrayList<>();
    public static void main(String[] args) {
       Dog dog1 = new Dog("Шарик", 5);
       addDog(dog1);
       System.out.println(array);
       System.out.println(dog1.AgeTrans());
    }
    public static void addDog(Dog object) {
        array.add(object);
    }
}
