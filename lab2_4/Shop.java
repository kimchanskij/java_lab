package lab2_4;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> array = new ArrayList<>();

    public void addComp(String name, String os, String cpu, String videocard) {
        Computer comp = new Computer(name, os, cpu, videocard);
        if (array.add(comp)) {
            System.out.println("Компьютер успешно добавлен!");
        }
        else {
            System.out.println("Не удалось добавить компьютер!");
        }
    }

    public void deleteComp(String name) {
        boolean tmp = false;
        for (Computer comp: array) {
            if (comp.getName().equals(name)) {
                array.remove(comp);
                tmp = true;
                break;
            }
        }
        if (tmp) {System.out.println("Компьютер успешно удалён!");}
        else {System.out.println("Такого компьютера нет в базе данных!");}
    }

    public void findComp(String x) {
        boolean tmp = true;
        for (Computer comp: array) {
            if (comp.getName().equals(x)) {
                tmp = false;
                System.out.println(comp.toString());
                break;
            }
        }
        if (tmp) {System.out.println("Компьютер не найден!");}
    }

    @Override
    public String toString() {
        String result = "";
        for (Computer x: array) {
            result += "Название: " + x.getName() + ", ОС: " + x.getOs() + ", ЦПУ: " + x.getCpu() + ", Видеокарта: " + x.getVideocard() + "\n";
        }
        return result;
    }
}
