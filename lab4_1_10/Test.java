package lab4_1_10;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(1000, 2);
        Train train = new Train(1000, 2);
        Ship ship = new Ship(1000, 2);
        Plane plane = new Plane(1000, 2);
        System.out.printf("Машина - %s%nПоезд - %s%nКорабль - %s%nСамолет - %s%n", car.toString(), train.toString(), ship.toString(), plane.toString());
    }
}
