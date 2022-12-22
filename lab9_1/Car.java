package lab9_1;
import java.util.Comparator;


public class Car implements Comparable<Car> {
    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }


    @Override
    public int compareTo(Car o) {
        return power - o.power;
    }

    @Override
    public String toString() {
        return getModel();
    }
}
