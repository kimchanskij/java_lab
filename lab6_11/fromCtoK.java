package lab6_11;

public class fromCtoK implements Convertable{
    @Override
    public void convert(int c) {
        System.out.printf("%d Цельсий в Кельвинах: %d%n", c, c+273);
    }
}
