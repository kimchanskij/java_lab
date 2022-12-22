package lab1;
import java.util.Scanner;

public class ex7 {
    static int factorial(int a){
        int n = 1;
        for (int i=2; i <= a; i++){
            n *= i;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(factorial(x));
    }
}