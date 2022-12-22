package lab3_3_1;

public class Converter {
    public static void main(String[] args) {
        System.out.println(fromRUB(60) + "\n");
        System.out.println(fromUSD(1) + "\n");
        System.out.println(fromEUR(1) + "\n");
        System.out.println(fromGBP(1) + "\n");
    }
    static String str;
    public static String fromRUB(double money) {
        str = String.format("В долларах: %.2f \nВ евро: %.2f \nВ фунтах стерлингах: %.2f", money*0.0172, money*0.01785, money*0.016);
        return str;
    }

    public static String fromUSD(double money) {
        str = String.format("В рублях: %.2f \nВ евро: %.2f \nВ фунтах стерлингах: %.2f", money*58.1756, money*1.04, money*0.927);
        return str;
    }

    public static String fromEUR(double money) {
        str = String.format("В рублях: %.2f \nВ долларах: %.2f \nВ фунтах стерлингах: %.2f", money*56, money*0.96, money*0.89);
        return str;
    }

    public static String fromGBP(double money) {
        str = String.format("В рублях: %.2f \nВ долларах: %.2f \nВ евро: %.2f", money*62.75, money*1.078, money*1.12);
        return str;
    }
}
