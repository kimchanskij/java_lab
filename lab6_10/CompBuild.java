package lab6_10;
import java.util.Scanner;

public class CompBuild implements Fill {
    public Computer Build() {
        Computer computer = new Computer();
        int tmp = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите марку компьютера: ");
        for (Brands br : Brands.values()) {
            System.out.println(tmp + ") " + br);
            tmp++;
        }
        tmp = 0;
        int choose = sc.nextInt() - 1;
        for (Brands br : Brands.values()) {
            if (tmp == choose) {
                computer.setBrand(br);
                break;
            }
            tmp++;
        }
        sc.nextLine();
        System.out.println("Укажите процессор: ");
        computer.setCpu(new Processor(sc.nextLine()));
        System.out.println("Укажите количество памяти: ");
        computer.setMemory(new Memory(sc.nextInt()));
        sc.nextLine();
        System.out.println("Укажите монитор: ");
        computer.setMonitor(new Monitor(sc.nextLine()));

        return computer;
    }
}