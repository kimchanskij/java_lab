package lab2_7;

import java.util.ArrayList;

public class BookCase {
    private ArrayList<Book> array = new ArrayList<>();

    private int amount;

    public void addBook(Book object) {
        array.add(object);
    }

    public Book findNew() {
        int temp = 0, result = 0;
        for (int i = 0; i < array.size(); i++) {
            if (temp < array.get(i).getOld()) {
                temp = array.get(i).getOld();
                result = i;
            }
        }
        return array.get(result);
    }

    public Book findOld() {
        int temp = 2023, result = 0;
        for (int i = 0; i < array.size(); i++) {
            if (temp > array.get(i).getOld()) {
                temp = array.get(i).getOld();
                result = i;
            }
        }
        return array.get(result);
    }

    public void Sort() {
        Book temp;
        for (int i = 0; i < array.size(); i++) {
            for (int j = array.size()-1; j >= i+1; j--) {
                if (array.get(j).getOld() < array.get(j-1).getOld()) {
                    temp = array.get(j);
                    array.set(j, array.get(j-1));
                    array.set(j-1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        String res = "Книжная полка - ";
        for(int i = 0; i < array.size(); i++) {
            res += "Автор: " + array.get(i).getAuthorName() + ", Книга: " + array.get(i).getBookName() + ", Год: " + array.get(i).getOld() + "\n";
        }
        return res;
    }
}
