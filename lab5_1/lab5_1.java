package lab5_1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class lab5_1 {
    static int real = 0;
    static int milan = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("AC Milan x Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(200, 150);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 500));
        JButton btn1 = new JButton("AC Milan");
        JButton btn2 = new JButton("Real Madrid");
        JLabel label = new JLabel("Result: 0 X 0");
        JLabel lab = new JLabel("Last Scorer: N/A");
        Label lab1 = new Label("Winner: DRAW");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan +=1;
                label.setText("Result: " + milan + " X " + real);
                lab.setText("Last Scorer: AC Milan");
                if (milan > real) {
                    lab1.setText("Winner: AC Milan");
                }
                if (milan == real) {
                    lab1.setText("Winner: DRAW");
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                real += 1;
                label.setText("Result: " + milan + " X " + real);
                lab.setText("Last Scorer: Real Madrid");
                if (real > milan) {
                    lab1.setText("Winner: Real Madrid");
                }
                if (milan == real) {
                    lab1.setText("Winner: DRAW");
                }
            }
        });
        panel.add(btn1);
        panel.add(btn2);
        panel.add(label);
        panel.add(lab);
        panel.add(lab1);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
