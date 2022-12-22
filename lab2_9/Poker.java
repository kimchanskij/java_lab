package lab2_9;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;

public class Poker {
    private int Players;
    private String[] NumCard = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
    private String[] ColorCard = {"Пики", "Черви", "Бубны", "Крести"};
    private ArrayList<String> Cards = new ArrayList<>(52);
    public void ShuffleCards() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                Cards.add(NumCard[i] + ColorCard[j]);
            }
        }
        Random rnd = new Random();
        for (int i = 0; i < 200; i++) {
            int x1 = rnd.nextInt(52);
            int x2 = rnd.nextInt(52);
            if (x1 != x2) {
                String temp1 = Cards.get(x1);
                String temp2 = Cards.get(x2);
                Cards.remove(x1);
                Cards.add(x1, temp2);
                Cards.add(x2, temp1);
                Cards.remove(x2 + 1);
            }
        }
    }
    public String GivingCards(int players) {
        String res = "";
        Players = players;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < 5; j++) {
                res += Cards.get(0) + " ";
                Cards.remove(0);
            }
            res += "\n\n";
        }
        return res;
    }
}