package lab4_1_10;

public abstract class Transport {
    private double time;
    private double speed;
    private int priceforhour;
    private double distance;
    private double price;
    private int human;

    public Transport(double speed, int priceforhour, double distance, int human) {
        this.speed = speed;
        this.priceforhour = priceforhour;
        this.distance = distance;
        this.human = human;
    }

    public double timeConverter() {
        time = distance/speed;
        return time;
    }

    public double priceConverter() {
        price = priceforhour*this.timeConverter()*human;
        return price;
    }

    public abstract String toString();
}
