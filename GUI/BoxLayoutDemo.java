package GUI;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    private JFrame frame;
    private JPanel panel1, panel2;

    public static void main(String[] args) {
        BoxLayoutDemo demo = new BoxLayoutDemo();
        demo.go();
    }

    void go() {
        frame = new JFrame("BoxLayout Demo");
        Container contentPane = frame.getContentPane();
        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(new JLabel("First"));
        panel1.add(new JLabel("Second"));
        panel1.add(new JLabel("Third"));
        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(new JButton("Yes"));
        panel2.add(new JButton("No"));
        panel2.add(new JButton("Maybe"));
        contentPane.add(panel1, BorderLayout.CENTER);
        contentPane.add(panel2, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
