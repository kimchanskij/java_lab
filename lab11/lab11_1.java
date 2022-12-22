package lab11;
import java.text.SimpleDateFormat;
import java.util.*;

public class lab11_1 {
    public static void main(String[] args) {
        lab5();
    }
    public static void lab1() {
        String surname = "Ким";
        Date now = new Date();
        Calendar get = Calendar.getInstance();
        get.set(Calendar.YEAR, 2022);
        get.set(Calendar.MONTH, Calendar.SEPTEMBER);
        get.set(Calendar.DAY_OF_MONTH, 1);
        get.set(Calendar.HOUR, -3);
        get.set(Calendar.MINUTE, 0);
        get.set(Calendar.SECOND, 0);
        System.out.println(surname);
        System.out.printf("Дата получения задания: %s%n", get.getTime());
        System.out.printf("Дата сдачи: %s", now);
    }

    public static void lab2() {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате: dd:mm:yyyy");
        String[] date = sc.nextLine().split(":");
        cal2.set(Calendar.DAY_OF_MONTH, Integer.parseInt(date[0]));
        cal2.set(Calendar.MONTH, Integer.parseInt(date[1])-1);
        cal2.set(Calendar.YEAR, Integer.parseInt(date[2]));
        if (cal1.compareTo(cal2) > 0) {
            System.out.println("Текущая дата позже");
        }
        else if (cal1.compareTo(cal2) < 0) {
            System.out.println("Текущая дата раньше");
        }
        else {
            System.out.println("Даты равны");
        }
    }

    public static void lab4() {
        date();
        calendar();
    }

    public static void date() {
        Scanner sc = new Scanner(System.in);
        Date date = new Date(sc.nextInt()-1900, sc.nextInt()-1, sc.nextInt(), sc.nextInt(), sc.nextInt(), 0);
        System.out.println(date);
    }

    public static void calendar() {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        calendar.set(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.printf("%s-%s-%s %s:%s", calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR), calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE));
    }

    public static void lab5() {
        Date date = new Date();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long a0;
        long a1;
        long a2;
        long b0;
        long b1;
        long b2;
        long x1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i*2);
        }
        long x2 = System.currentTimeMillis();
        a0 = x2-x1;
        arrayList.contains(99999);
        x1 = System.currentTimeMillis();
        a1 = x1-x2;
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(0);
        }
        x2 = System.currentTimeMillis();
        a2 = x2-x1;

        x1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i*2);
        }
        x2 = System.currentTimeMillis();
        b0 = x2-x1;
        linkedList.contains(99999);
        x1 = System.currentTimeMillis();
        b1 = x1-x2;
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(0);
        }
        x2 = System.currentTimeMillis();
        b2 = x2-x1;
        System.out.printf("%50s%15s%nВремя добавления 100.000 элементов: %10s%15s%nВремя поиска последнего элемента: %12s%15s%nВремя удаления: %32s%13s", "ArrayList", "LinkedList", a0, b0, a1, b1, a2, b2);
    }

    
}
