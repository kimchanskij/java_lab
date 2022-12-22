package lab2_4;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        boolean finish = true;
        while (finish) {
            System.out.println("Выберите действие:\n" + "1) Добавить компьютер\n" + "2) Удалить компьютер\n" + "3) Найти компьютер по названию\n" + "4) Показать каталог\n" + "5) Закрыть меню");
            String act = sc.nextLine();
            if (act.equals("1")) {
                System.out.print("Введите данные компьютера построчно в формате - Название, ОС, ЦПУ, Видеокарта: ");
                String name = sc.nextLine();
                String os = sc.nextLine();
                String cpu = sc.nextLine();
                String videocard = sc.nextLine();
                shop.addComp(name, os, cpu, videocard);
            }
            if (act.equals("2")) {
                System.out.print("Введите название компьютера: ");
                shop.deleteComp(sc.nextLine());
            }
            if (act.equals("3")) {
                System.out.print("Введите название компьютера: ");
                shop.findComp(sc.nextLine());
            }
            if (act.equals("4")) {
                System.out.println(shop.toString());
            }
            if(act.equals("5")) {
                finish = false;
            }
            try {
                Thread.sleep(2500);
            }
            catch(InterruptedException e) {
                System.out.println("Прервано!");
            }
        }
    }
}
