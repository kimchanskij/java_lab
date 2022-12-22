package lab2_7;

public class Book {
    private String AuthorName;
    private String BookName;
    private int Old;

    public Book(String authorName, String bookName, int old) {
        AuthorName = authorName;
        BookName = bookName;
        Old = old;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public String getBookName() {
        return BookName;
    }

    public int getOld() {
        return Old;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setOld(int old) {
        Old = old;
    }

    @Override
    public String toString(){
        return "Автор: " + AuthorName + ", Книга: " + BookName + ", Год: " + Old;
    }
}
