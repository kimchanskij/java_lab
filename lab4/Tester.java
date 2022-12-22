package lab4;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        String log;
        String pass;
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        boolean work = false;
        System.out.println("Вам нужно зарегистрироваться, придумайте логин и пароль");
        System.out.println("Логин: ");
        log = sc.nextLine();
        System.out.println("Пароль: ");
        pass = sc.nextLine();
        shop.addUser(log, pass);
        boolean valid = true;
        while (valid) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Прервано!");
            }
            System.out.println("\nВход в аккаунт\nЛогин: ");
            log = sc.nextLine();
            System.out.println("Пароль: ");
            pass = sc.nextLine();
            if (shop.authentication(log, pass)) {
                work = true;
                valid = false;
                while (work) {
                    System.out.println("1) Каталог\n2) Корзина\n3) Выход");
                    String s = sc.nextLine();
                    if (s.equals("1")) {
                        System.out.println(shop.showCatalogue());
                        System.out.println("1) Выбрать подкаталог\n2) Назад");
                        switch (sc.nextLine()) {
                            case "1":
                                boolean t = true;
                                while (t) {
                                    t = false;
                                    System.out.println("Какой подкаталог вас интересует?");
                                    String cat = sc.nextLine();
                                    if (shop.chooseCatalogue(cat)) {
                                        System.out.println("1) Добавить товар в корзину\n2) Назад");
                                        switch (sc.nextLine()) {
                                            case "1":
                                                System.out.println("Введите номер товара, который желаете добавить");
                                                if (cat.equals("PHONES")) {
                                                    shop.addCartPHONE(sc.nextLine());
                                                }
                                                if (cat.equals("LAPTOPS")) {
                                                    shop.addCartLAPTOP(sc.nextLine());
                                                }
                                                break;
                                            case "2":
                                                break;
                                            default:
                                                System.out.println("Введите номер интересующей вкладки");
                                        }
                                    }
                                }
                                break;
                            case "2":
                                break;
                            default:
                                System.out.println("Введите номер интересующей вкладки");
                                break;
                        }
                    }
                    if (s.equals("2")) {
                        System.out.println(shop.showCart());
                    }
                    if (s.equals("3")) {
                        work = false;
                        break;
                    }
                    try {
                        Thread.sleep(2500);
                    } catch (InterruptedException e) {
                        System.out.println("Прервано!");
                    }
                }
            }
            else {
                System.out.println("Неверные данные");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                }
            }
        }
    }
}