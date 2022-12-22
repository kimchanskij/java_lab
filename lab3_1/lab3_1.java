package lab3_1;
import java.util.Random;


public class lab3_1 {
    public static void main(String[] args) {
        ex1();
    }
    public static void ex1() {
        Random rnd = new Random();
        double temp;
        double[] array = new double[10];
        System.out.print("Через Math: ");
        for (int i = 0; i < 10; i++) {
            array[i] = Math.random();
            System.out.printf("%.3f ", array[i]);
        }
        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j >= i + 1; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.3f ", array[i]);
        }

        System.out.print("\nЧерез Random: ");

        for (int i = 0; i < 10; i++) {
            array[i] = rnd.nextDouble();
            System.out.printf("%.3f ", array[i]);
        }

        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j >= i + 1; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.3f ", array[i]);
        }
    }
}