package lab2_10;

import java.util.Scanner;
import java.lang.String;

public class HowMany {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String txt = x.nextLine();
        int temp = 0;
        for (String q : txt.split(" ")) {
            temp++;
        }
        System.out.println(temp);
        }
    }

