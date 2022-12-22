package lab8_10;

public class Class {
    public static void main(String[] args) {
        System.out.println(Reverse(12345));
        System.out.println(Recursion(12345, 0));
        System.out.println(Invert(12345));
    }

    public static int Back(int x, int res) {
        if (x > 0) {
            return Back(x / 10, (res * 10) + (x % 10));
        }
        return res;
    }

    public static int Reverse(int x) {
        return Back(x, 0);
    }

    public static int Recursion(int a, int b) {
        if (a == 0) return b;
        return (a%10)%2 != 0 ? + Recursion(a/10, b*10+a%10) : Recursion(a/10, b);
    }

    public static int Invert(int a) {
        if (a/10 == 0) {return a;}
        System.out.print(a % 10 + " ");
        return Invert(a/10);
    }
}
