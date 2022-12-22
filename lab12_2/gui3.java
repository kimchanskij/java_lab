package lab12_2;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui3 extends JFrame {
    public int amount = 0;
    public gui3() {
        super("Image");
        setSize(800, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Задания");
        JMenuItem item1 = new JMenuItem("Фигуры");
        JMenuItem item2 = new JMenuItem("Картинка");
        JMenuItem item3 = new JMenuItem("Гифка");
        JMenuItem item4 = new JMenuItem("Очистить");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menubar.add(menu);
        setJMenuBar(menubar);

        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (amount > 0) {
                    getContentPane().remove(0);
                    amount--;
                }
                setSize(800, 750);
                setLocationRelativeTo(null);
                Panel panel1 = new ShowImage();
                add(panel1);
                amount++;
            }
        });
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (amount > 0) {
                    getContentPane().remove(0);
                    amount--;
                }
                setSize(865, 700);
                setLocationRelativeTo(null);
                Panel gu1 = new gui1();
                add(gu1);
                amount++;
            }
        });

        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (amount > 0) {
                    getContentPane().remove(0);
                    amount--;
                }
                setSize(400, 400);
                setLocationRelativeTo(null);
                Panel pan = new Panel();
                Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\kim_d\\Downloads\\2GU.gif");
                ImageIcon imageIcon = new ImageIcon(image);
                JLabel jLabel = new JLabel("");
                jLabel.setIcon(imageIcon);
                pan.add(jLabel);
                add(pan);
                amount++;
            }
        });

        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (amount > 0) {
                    getContentPane().remove(0);
                    amount--;
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui3();
    }
}
