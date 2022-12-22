package lab6_10;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> data= new ArrayList<>();

    public void addComp(Computer computer) {
        if (data.add(computer)) {
            System.out.println("Компьютер успешно добавлен!");
        }
        else {
            System.out.println("Компьютер не получилось добавить!");
        }
    }

    public void deleteComp(Computer computer) {
        if (data.remove(computer)) {
            System.out.println("Компьютер удалён!");
        }
        else {
            System.out.println("Компьютер не найден в базе данных!");
        }
    }

    public void findComp(Computer computer) {
        if (data.contains(computer)) {
            System.out.println(computer.toString());
        }
        else {
            System.out.println("Компьютер не найден!");
        }
    }

    public void showCatalogue() {
        System.out.println("Каталог: ");
        for (Computer c: data) {
            System.out.println(c.toString());
        }
    }
}
