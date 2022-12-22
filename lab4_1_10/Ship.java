package lab4_1_10;

public class Ship extends Transport{
    public Ship(double distance, int human) {
        super(60, 500, distance, human);
    }

    public String toString() {
        return String.format("Время: %.1f, Стоимость: %.1f", this.timeConverter(), this.priceConverter());
    }
}
