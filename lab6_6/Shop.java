package lab6_6;

public class Shop implements Printable{
    private String name;
    private String topic;

    public Shop(String name, String topic) {
        this.name = name;
        this.topic = topic;
    }
    public void Print() {
        System.out.printf("Журнал — (Название: %s, Тема: %s)%n", name, topic);
    }
}
