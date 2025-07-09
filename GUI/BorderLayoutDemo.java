package GUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    private JFrame frame;
    private JButton button1, button2, button3, button4, button5;

    public static void main(String[] args) {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        demo.go();
    }

    void go() {
        frame = new JFrame("Border Layout");
        button1 = new JButton("East");
        button2 = new JButton("South");
        button3 = new JButton("West");
        button4 = new JButton("North");
        button5 = new JButton("Center");

        frame.getContentPane().add(button1, BorderLayout.EAST);
        frame.getContentPane().add(button2, BorderLayout.SOUTH);
        frame.getContentPane().add(button3, BorderLayout.WEST);
        frame.getContentPane().add(button4, BorderLayout.NORTH);
        frame.getContentPane().add(button5, BorderLayout.CENTER);

        frame.setSize(350, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
