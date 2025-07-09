package GUI;

import javax.swing.*;
import java.awt.*;

public class FrameWithPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame with panel");
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.CYAN);

        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        JButton btn = new JButton("啊 姜策", new ImageIcon("icon.gif"));
        panel.add(btn);

//        JLabel label = new JLabel("啊 姜策", JLabel.CENTER);

//        contentPane.add(label, BorderLayoutDemo.NORTH);
        contentPane.add(panel, BorderLayout.SOUTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
