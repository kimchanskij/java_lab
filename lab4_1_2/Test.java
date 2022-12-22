package lab4_1_2;

public class Test {
    public static void main(String[] args) {
        String[] x = {"79777777777", "79999999999", "79111994857"};
        Phone ph1 = new Phone();
        Phone ph2 = new Phone("79269990203", "iPhone");
        Phone ph3 = new Phone("79775441820", "Samsung", 150);

        System.out.println(ph1.toString()+ "\n" + ph2.toString() + "\n" + ph3.toString());

        System.out.println(ph1.getNumber() + "\n" + ph2.getNumber() + "\n" + ph3.getNumber());

        ph1.receiveCall("Антон");
        ph2.receiveCall("Ваня");
        ph3.receiveCall("Даня");

        ph1.receiveCall("Антон", "79523412431");
        ph2.receiveCall("Ваня", "79182940593");
        ph3.receiveCall("Даня", "79996667770");

        ph1.sendMessage(x);
    }
}
