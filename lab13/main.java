package lab13;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Person man = new Person("Антон", "Антонов");
        man.showName();

        Address address = new Address("Россия; Московская область; Москва; Анохина; 14; 6; 100");
        address.show();

        Shirt shirt = new Shirt();
        shirt.add();
        System.out.println(shirt.toString());

        lab5 lab5 = new lab5();
        lab5.formatter("89175655655");

        File dir = new File("C:\\Users\\kim_d\\IdeaProjects\\st\\src");
        File file = new File("dir", "1.txt");


    }
    public static void files(File file) {

    }

    public static class Person {
        String first_name = "None";
        String second_name = "None";

        Person(String first_name, String second_name) {
            this.first_name = first_name;
            this.second_name = second_name;
        }

        public void showName() {
            System.out.println(first_name + " " + second_name);
        }
    }

    public static class Address {
        String country;
        String region;
        String city;
        String street;
        String house;
        String k;
        String flat;

        Address(String x) {
            String[] res = x.split(";");
            this.country = res[0];
            this.region = res[1];
            this.city = res[2];
            this.street = res[3];
            this.house = res[4];
            this.k = res[5];
            this.flat = res[6];
        }

        public void show() {
            System.out.printf("%s, %s, %s, %s, %s, %s, %s%n", country, region, city, street, house, k, flat);
        }
    }

    public static class Shirt {
        ArrayList<String> shirts = new ArrayList<>();

        public void add() {
            shirts.add("S001,Black Polo Shirt,Black,XL");
            shirts.add("S002,Black Polo Shirt,Black,L");
            shirts.add("S003,Blue Polo Shirt,Blue,XL");
            shirts.add("S004,Blue Polo Shirt,Blue,M");
            shirts.add("S005,Tan Polo Shirt,Tan,XL");
            shirts.add("S006,Black T-Shirt,Black,XL");
            shirts.add("S007,White T-Shirt,White,XL");
            shirts.add("S008,White T-Shirt,White,L");
            shirts.add("S009,Green T-Shirt,Green,S");
            shirts.add("S010,Orange T-Shirt,Orange,S");
            shirts.add("S011,Maroon Polo Shirt,Maroon,S");
        }

        @Override
        public String toString() {
            String res = "";
            for (String o : shirts) {
                String[] x = o.split(",");
                res += String.format("Артикул: %s, Название: %s, Цвет: %s, Размер: %s%n", x[0], x[1], x[2], x[3]);
            }
            return res;
        }
    }

    public static class lab5 {
        public void formatter(String x) {
            if (x.startsWith("+")) {
                if (x.length() == 12) {
                    System.out.println(x.substring(0, 2) + " " + x.substring(2, 5) + " " + x.substring(5, 8) + " " + x.substring(8, 12));
                }
                if (x.length() == 13) {
                    System.out.println(x.substring(0, 3) + " " + x.substring(3, 6) + " " + x.substring(6, 9) + " " + x.substring(9, 13));
                }
                if (x.length() == 14) {
                    System.out.println(x.substring(0, 4) + " " + x.substring(4, 7) + " " + x.substring(7, 10) + " " + x.substring(10, 14));
                }
            } else {
                System.out.println("+7" + " " + x.substring(1, 4) + " " + x.substring(4, 7) + " " + x.substring(7, 11));
            }
        }
    }
}
