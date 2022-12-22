package lab3_1_3;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        boolean res = true;
        int[] array = new int[4];
        Random rnd = new Random();
        for (int i = 0; i < 4; i++){
            array[i] = rnd.nextInt(10, 100);
            System.out.print(array[i] + " ");
            if (i > 0) {
                if (array[i] < array[i-1]) {
                    res = false;
                }
            }
        }
        if (res) {
            System.out.println("\nЯвляется строго возрастающей последовательностью");
        }
        else {
            System.out.println("\nНе является строго возрастающей последовательностью");
        }
    }
}

