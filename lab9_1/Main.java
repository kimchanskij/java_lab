package lab9_1;
import java.util.*;

public class Main {
    private static Student[] iDNumber = new Student[4];
    private static Student[] array = new Student[3];

    public static void setiDNumber() {
        Student student = new Student("Олег", "Олегов", "Программная инженерия", 1, "ИКБО-01-22", 4);
        student.setDate_of_birth(24, 4, 2002);
        Student student1 = new Student("Иван", "Иванов", "Программная инженерия", 2, "ИКБО-05-21", 3);
        student1.setDate_of_birth(10, 9, 2000);
        Student student2 = new Student("Антон", "Антонов", "ИВТ", 1, "ИВБО-07-22", 5);
        student2.setDate_of_birth(5, 4, 2003);
        Student student3 = new Student("Роман", "Романов", "Юриспруденция", 4, "ЮНБО-10-19", 2);
        student3.setDate_of_birth(12, 11, 2001);
        iDNumber[0] = student;
        iDNumber[1] = student1;
        iDNumber[2] = student2;
        iDNumber[3] = student3;
    }

    public static void setArray() {
        Student student4 = new Student("Николай", "Николаев", "ПМИ", 3, "ИМБО-15-20", 4);
        student4.setDate_of_birth(23, 1, 2000);
        Student student5 = new Student("Алиса", "Алисова", "Робототехника", 2, "ИРБО-21-21", 5);
        student5.setDate_of_birth(30, 7, 2002);
        Student student6 = new Student("Виктория", "Викторова", "ПМ", 3, "ИПБО-09-20", 2);
        student6.setDate_of_birth(19, 3, 2002);
        array[0] = student4;
        array[1] = student5;
        array[2] = student6;
    }

    public static Student[] Merge(Student[] o1, Student[] o2) {
        int tmp = 0;
        Student[] arr = new Student[o1.length + o2.length];
        for (Student o: o1) {
            arr[tmp] = o;
            tmp++;
        }
        for(Student o: o2) {
            arr[tmp] = o;
            tmp++;
        }
        return arr;
    }

    public static void outArray() {
        for (Student o: iDNumber) {
            System.out.println(o.toString());
        }
    }
    public static void main(String[] args) {
        setiDNumber();
        setArray();
        Sort.insertSort(iDNumber);
        System.out.println("\nСортировка по фамилии - ");
        for (Student o: iDNumber) {
            System.out.println(o.toString());
        }
        SortingStudentsByGPA.quickSort(iDNumber, 0, 3);
        System.out.println("\nСортировка по итоговым баллам в порядке убывания - ");
        for (Student o: iDNumber) {
            System.out.println(o.toString());
        }
        System.out.println("\nСортировка соединенного списка - ");
        Student[] mergeArray = Merge(iDNumber, array);
        Sort.mergeSort(mergeArray, 7);
        for (Student o: mergeArray) {
            System.out.println(o.toString());
        }
//        Car car = new Car("BMW", 250);
//        Car car1 = new Car("Toyota",200);
//        Car car2 = new Car("Honda",150);
//        Set<Car> arr = new TreeSet<>();
//        arr.add(car);
//        arr.add(car1);
//        arr.add(car2);
//        System.out.println("\nАвтомобили по возрастанию мощности - ");
//        for (Object o: arr) {
//            System.out.println(o);
//        }
    }
}
