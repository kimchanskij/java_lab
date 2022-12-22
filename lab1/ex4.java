package lab1;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        int i = 0, sum = 0, max = 0, min = 10000000;
        int []mas = new int[5];
        Scanner sc = new Scanner(System.in);
        while (i<5) {
            mas[i] = sc.nextInt();
            if (max < mas[i]){
                max = mas[i];
            }
            if (min > mas[i]){
                min = mas[i];
            }
            i++;
        }
        i = 0;
        do {
           sum += mas[i];
           i++;
        }while(i < 5);
        System.out.println("Сумма: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
