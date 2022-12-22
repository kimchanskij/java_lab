package lab4_1_10;

public class Car extends Transport{
    public Car(double distance, int human) {
        super(100, 500, distance, human);
    }

    public String toString() {
        return String.format("Время: %.1f, Стоимость: %.1f", this.timeConverter(), this.priceConverter());
    }
}
