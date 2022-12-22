package lab7_3;

public class Test
{
    public static void main(String[] args)
    {
        MovableRectangle movableRectangle = new MovableRectangle(new MovablePoint(0,0,5, 5), new MovablePoint(5,5,5,5));

        movableRectangle.moveLeft();
        movableRectangle.moveUp();
        movableRectangle.moveLeft();
        movableRectangle.moveUp();

        System.out.printf("Точки:%n%sОдинаковая скорость: %s",movableRectangle.toString(), movableRectangle.SpeedTest());
    }
}