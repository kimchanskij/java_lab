package lab9_1;
import java.util.Date;
import java.text.SimpleDateFormat;

class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private String group;
    private int final_score;

    private Date date_of_birth;

    public Student(String name, String surname, String speciality, int course, String group, int final_score) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.final_score = final_score;
    }

    public void setDate_of_birth(int day, int month, int year) {
        this.date_of_birth = new Date();
        date_of_birth.setYear(year-1900);
        date_of_birth.setMonth(month-1);
        date_of_birth.setDate(day);
    }

    public String birth_formatter() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return format.format(date_of_birth);
    }

    public int getFinal_score() {
        return final_score;
    }

    @Override
    public int compareTo(Student o) {
        return surname.compareTo(o.surname);
    }

    @Override
    public String toString() {
        return String.format("Ф.И.: %s %s, Дата рождения: %s, Специальность: %s, Курс: %s, Группа: %s, Итоговый балл: %s", surname, name, birth_formatter(),speciality, course, group, final_score);
    }
}