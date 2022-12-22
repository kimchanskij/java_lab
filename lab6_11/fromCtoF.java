package lab6_11;

public class fromCtoF implements Convertable{
    @Override
    public void convert(int c) {
        System.out.printf("%d Цельсий в Фаренгейтах: %.0f%n", c, c*1.8+32);
    }
}
