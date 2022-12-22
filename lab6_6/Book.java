package lab6_6;

public class Book implements Printable{
    private String name;
    private String author;
    private int release;

    public Book(String name, String author, int release) {
        this.name = name;
        this.author = author;
        this.release = release;
    }

    public void Print() {
        System.out.printf("Книга — (Название: %s, Автор: %s, Дата выхода: %s)%n", name, author, release);
    }
    public void privet() {
        System.out.println("1");
    }
}
