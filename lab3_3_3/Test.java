package lab3_3_3;

public class Test {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Олег Иванов", 33333.111);
        Employee worker2 = new Employee("Антон Фирсов", 44444.155);
        Employee worker3 = new Employee("Анна Борисова", 55555.094);
        Report.addWorker(worker1);
        Report.addWorker(worker2);
        Report.addWorker(worker3);
        System.out.println(Report.generateReport());
    }
}
