package lab4_1_10;

public class Plane extends Transport{
    public Plane(double distance, int human) {
        super(500, 2000, distance, human);
    }

    public String toString() {
        return String.format("Время: %.1f, Стоимость: %.1f", this.timeConverter(), this.priceConverter());
    }
}