package lab13;

import java.util.Locale;

public class lab13_1 {
    public static void main(String[] args) {
        String lab1= "I like Java";
        System.out.println(lab1.charAt(10));
        System.out.println(lab1.endsWith("!!!"));
        System.out.println(lab1.startsWith("I like"));
        System.out.println(lab1.indexOf("Java"));
        System.out.println(lab1.replace("a", "o"));
        System.out.println(lab1.toUpperCase());
        System.out.println(lab1.toLowerCase());
        System.out.println(lab1.substring(2, 6));
    }
}
