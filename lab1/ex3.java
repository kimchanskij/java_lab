package lab1;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int sum = 0;
        double arif = 0;
        int[] mas = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
            sum += mas[i];
        }
        arif = sum;
        arif /= 5;
        System.out.println("Сумма: " + sum + "\n" + "Среднее арифметическое: " + arif);
    }
}
