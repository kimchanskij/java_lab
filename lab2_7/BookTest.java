package lab2_7;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("М. А. Булгаков", "Мастер и Маргарита", 1967);
        Book book2 = new Book("Л. Н. Толстой", "Война и мир", 1869);
        Book book3 = new Book("Н. В. Гоголь", "Ревизор", 1836);
        Book book4 = new Book("И.А. Бунин", "Тёмные аллеи", 1946);
        BookCase shelf = new BookCase();
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);
        shelf.addBook(book4);
        System.out.println("Самая старая книга: " + shelf.findOld());
        System.out.println("Самая новая книга: " + shelf.findNew());
        shelf.Sort();
        System.out.println(shelf.toString());
    }
}
