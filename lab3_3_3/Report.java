package lab3_3_3;
import java.util.ArrayList;

public class Report {
    private static String result = "";
    private static ArrayList<Employee> array = new ArrayList<>();

    public static void addWorker(Employee worker) {
        array.add(worker);
    }

    public static String generateReport(){
        for (Employee x: array) {
            result += String.format("%s %75.2f %n", x.getFullname(), x.getSalary());
        }
        return result;
    }
}
