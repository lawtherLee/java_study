package GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    private JFrame frame;
    private JButton button1, button2, button3;

    public static void main(String[] args) {
        FlowLayoutDemo demo = new FlowLayoutDemo();
        demo.go();
    }

    public void go() {
        frame = new JFrame("Flow Layout Demo");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");

        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);

        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
