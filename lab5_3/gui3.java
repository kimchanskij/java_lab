package lab5_3;

import javax.swing.*;
import java.awt.*;

public class gui3 extends JFrame {
    public gui3() {
        super("Image");
        setSize(1500, 900);
        setBackground(Color.gray);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new ShowImage();
        JLabel label = new JLabel();
        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new gui3();
    }
}