package lab3_3_3;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String name, double sal) {
        fullname = name;
        salary = sal;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}
