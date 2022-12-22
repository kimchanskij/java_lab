package lab5_2;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class gui2 extends JFrame{
    public static void main(String[] args) {
        new gui2();
    }

    public void paint(Graphics g) {
        super.paint(g);
        int a = 50;
        int b = 50;
        for (int i = 0; i < 5; i++) {
            Figure oval = new Figure(a, b);
            g.setColor(oval.color);
            g.fillOval(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight());
            a += 150;
        }
        a = 50;
        b = 200;
        for (int i = 0; i < 5; i++) {
            Figure oval = new Figure(a, b);
            g.setColor(oval.color);
            g.fillRect(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight());
            a += 150;
        }
        a = 50;
        b = 350;
        for (int i = 0; i < 5; i++) {
            Figure oval = new Figure(a, b);
            g.setColor(oval.color);
            g.fillArc(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight(), new Random().nextInt(0, 360), new Random().nextInt(0, 360));
            a += 150;
        }
        a = 50;
        b = 500;
        for (int i = 0; i < 5; i++) {
            Figure oval = new Figure(a, b);
            g.setColor(oval.color);
            g.fillRoundRect(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight(), oval.getWidth(), oval.getHeight());
            a += 150;
        }
    }
    public gui2 () {
        super("FIGURES");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
