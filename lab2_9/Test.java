package lab2_9;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] arg) {
        Poker poker = new Poker();
        poker.ShuffleCards();
        Scanner sc = new Scanner(System.in);
        int pl = sc.nextInt();
        System.out.println(poker.GivingCards(pl));
    }
}
