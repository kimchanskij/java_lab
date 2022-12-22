package lab6_1;

public class Test {
    public static void main(String[] args) {
        Movable point = new MovablePoint(0, 0, 5, 5);
        point.moveLeft();
        point.moveUp();
        System.out.println(point.toString());
        Movable circle = new MovableCircle(0,0,7,7,10);
        circle.moveDown();
        circle.moveRight();
        System.out.println(circle.toString());
    }
}
