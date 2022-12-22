package lab2_1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Author object = new Author("Oleg", "oleg@gmail.com", 'm');
        System.out.println(object.toString());
    }
}
