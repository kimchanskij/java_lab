package lab12_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class gui1 extends Panel{
    public void paint(Graphics g) {
        super.paint(g);
        int a = 90;
        int b = 50;
        for (int i = 0; i < 5; i++) {
            Figure oval = new Figure(a, b);
            g.setColor(oval.color);
            g.fillOval(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight());
            a += 150;
        }
        a = 90;
        b = 200;
        for (int i = 0; i < 5; i++) {
            Figure oval = new Figure(a, b);
            g.setColor(oval.color);
            g.fillRect(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight());
            a += 150;
        }
        a = 90;
        b = 350;
        for (int i = 0; i < 5; i++) {
            Figure oval = new Figure(a, b);
            g.setColor(oval.color);
            g.fillArc(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight(), new Random().nextInt(0, 360), new Random().nextInt(0, 360));
            a += 150;
        }
        a = 90;
        b = 500;
        for (int i = 0; i < 5; i++) {
            Figure oval = new Figure(a, b);
            g.setColor(oval.color);
            g.fillRoundRect(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight(), oval.getWidth(), oval.getHeight());
            a += 150;
        }
    }
}
