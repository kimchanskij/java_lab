package lab4;
import java.util.ArrayList;

public class Shop {

    private ArrayList<Common> cart = new ArrayList<>();
    ;
    private ArrayList<User> users = new ArrayList<>();

    public boolean addUser(String log, String pass) {
        User user = new User(log, pass);
        return users.add(user);
    }

    public boolean authentication(String log, String pass) {
        for (User user: users) {
            if (user.getLogin().equals(log)) {
                if (user.getPassword().equals(pass)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String showCatalogue() {
        String res = "";
        for (Catalogue cat: Catalogue.values()) {
            res += cat + "\n";
        }
        return res;
    }

    public boolean chooseCatalogue(String name) {
        String res = "";
        Integer tmp = 1;
        switch(name) {
            case "LAPTOPS":
                for (Laptops lap: Laptops.values()) {
                    res += tmp.toString() + ") " + lap + " - " + lap.getPrice() + "\n";
                    tmp += 1;
                }
                System.out.println(res);
                return true;
            case "PHONES":
                for (Phones ph: Phones.values()) {
                    res += tmp.toString() + ") " + ph + " - " + ph.getPrice() + "\n";
                    tmp += 1;
                }
                System.out.println(res);
                return true;
            default:
                System.out.println("Не найден каталог с таким названием");
                return false;
        }
    }
    public boolean addCartPHONE(String product) {
        switch (product) {
            case "1":
                cart.add(Common.IPHONE);
                System.out.println("Товар добавлен в корзину!");
                return true;
            case "2":
                cart.add(Common.SAMSUNG);
                System.out.println("Товар добавлен в корзину!");
                return true;
            case "3":
                cart.add(Common.XIAOMI);
                System.out.println("Товар добавлен в корзину!");
                return true;
            case "4":
                cart.add(Common.HUAWEI);
                System.out.println("Товар добавлен в корзину!");
                return true;
        }
        System.out.println("Произошла ошибка, попробуйте заново");
        return false;
    }

    public boolean addCartLAPTOP(String product) {
        switch (product) {
            case "1":
                cart.add(Common.MACBOOK);
                System.out.println("Товар добавлен в корзину!");
                return true;
            case "2":
                cart.add(Common.ACER);
                System.out.println("Товар добавлен в корзину!");
                return true;
            case "3":
                cart.add(Common.ASUS);
                System.out.println("Товар добавлен в корзину!");
                return true;
            case "4":
                cart.add(Common.LENOVO);
                System.out.println("Товар добавлен в корзину!");
                return true;
        }
        System.out.println("Произошла ошибка, попробуйте заново");
        return false;
    }

    public String showCart() {
        int total = 0;
        String x = "";
        for (Common obj: cart) {
            total += obj.getPrice();
            x += obj + " - " + obj.getPrice() + "\n";
        }
        if (x.equals("")) {
            return "Корзина пуста";
        }
        x += "Сумма к оплате: " + total;
        return x;
    }
}