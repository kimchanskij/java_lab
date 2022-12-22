package lab9_1;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFinal_score() - o2.getFinal_score();
    }

    public static void quickSort(Student[] list, int leftBorder, int rightBorder) {
        SortingStudentsByGPA o = new SortingStudentsByGPA();
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = list[(leftMarker + rightMarker) / 2];
        do {
            while (o.compare(pivot, list[leftMarker]) < 0) {
                leftMarker++;
            }
            while (o.compare(pivot, list[rightMarker]) > 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = list[leftMarker];
                    list[leftMarker] = list[rightMarker];
                    list[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(list, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(list, leftBorder, rightMarker);
        }
    }
}

