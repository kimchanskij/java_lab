package lab4_1_10;

public class Train extends Transport{
    public Train(double distance, int human) {
        super(80, 200, distance, human);
    }

    public String toString() {
        return String.format("Время: %.1f, Стоимость: %.1f", this.timeConverter(), this.priceConverter());
    }
}
