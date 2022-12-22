package lab2_2;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args){
        Ball object = new Ball(5.5, 2);
        Ball obj = new Ball();
        object.move(2, 1.5);
        obj.move(-5, 0);
        System.out.println(object.getX() + ", " + object.getY());
        System.out.println(obj.getX() + ", " + obj.getY());
    }
}
