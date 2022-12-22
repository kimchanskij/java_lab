package lab7_5;

public class Test {
    public static void main(String[] args) {
        StringWorkable object = new StringProcessing();
        System.out.println(object.CountSymbols("12345"));
        System.out.println(object.Uneven("12345"));
        System.out.println(object.Inverting("12345"));
    }
}
