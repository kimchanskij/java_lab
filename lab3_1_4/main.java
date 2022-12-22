package lab3_1_4;
import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int x = 0;
        boolean s = true;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n = 0;
        int[] array = new int[0];
        while (s) {
            System.out.println("Введите размер массива: ");
            n = sc.nextInt();
            if (n > 3) {
                array = new int[n];
                s = false;
            }
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rnd.nextInt(n);
            System.out.print(array[i] + " ");
            if (array[i]%2 == 0) {
                arr[x] = array[i];
                x++;
            }
        }
        System.out.print("\nМассив из четных чисел: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
