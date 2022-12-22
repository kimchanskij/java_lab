package lab2_8;

public class ex8 {
    public static void main(String[] args) {
        String[] x = {"1", "2", "3", "4", "5"};
        Converter(x);
    }

    public static void Converter(String[] txt) {
        String temp = "";
        for (int i = 0; i < txt.length; i++) {
            for (int j = txt.length-1; j >= i+1; j--) {
                temp = txt[j];
                txt[j] = txt[j-1];
                txt[j-1] = temp;
            }
        }
        for (int i = 0; i < txt.length; i++) {
            System.out.print(txt[i]);
        }
    }
}
