package lab4_1_2;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {}
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public String getNumber() {return number;}
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }
    public void sendMessage(String[] numbers) {
        for (String x: numbers) {
            System.out.println(x);
        }
    }
    @Override
    public String toString() {
        return "Номер: " + number + " Модель: " + model + " Вес: " + weight;
    }
}
