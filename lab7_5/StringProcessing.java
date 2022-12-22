package lab7_5;

public class StringProcessing implements StringWorkable{
    @Override
    public int CountSymbols(String str) {
        return str.length();
    }

    @Override
    public String Uneven(String str) {
        int temp = 1;
        String[] s = str.split("");
        String result = "";
        for (String x: s) {
            if (temp%2 > 0) {
                result += x;
            }
            temp++;
        }
        return result;
    }

    @Override
    public String Inverting(String str) {
        String[] array = str.split("");
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return result;
    }
}
