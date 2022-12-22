package lab5_4;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args){
                JFrame frame = new JFrame("gif");
                frame.setSize(300, 300);
                frame.setBackground(Color.gray);
                frame.setLocationRelativeTo(null);
                JLabel jLabel = new JLabel("");
                Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\kim_d\\Downloads\\2GU.gif");
                ImageIcon imageIcon = new ImageIcon(image);
                jLabel.setIcon(imageIcon);
                frame.add(jLabel);
                frame.setVisible(true);
            }
    }