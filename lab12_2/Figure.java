package lab12_2;

import java.util.Random;
import java.awt.*;

public class Figure extends Shape {
    public Figure(int x, int y) {
        super(Color.getHSBColor(new Random().nextFloat(0, 1), new Random().nextFloat(0, 1), new Random().nextFloat(0, 1)), x, y, new Random().nextInt(50, 150), new Random().nextInt(50, 100));
    }
}

