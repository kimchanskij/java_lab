package lab7_3;

public class MovableRectangle implements Movable
{
    protected MovablePoint topLeft;

    protected MovablePoint bottomRight;

    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight)
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public boolean SpeedTest()
    {
        if (topLeft.xSpeed == bottomRight.xSpeed) {
            if (topLeft.ySpeed == bottomRight.ySpeed) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString()
    {
        return String.format("TopLeft: %s\nBottomRight: %s\n", topLeft.toString(), bottomRight.toString());
    }
}
