package GUI;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrameDemo");
        JButton btn = new JButton("啊 姜策");

        JPanel contentPanel = new JPanel();
        // 设置布局管理器
        contentPanel.setLayout(new BorderLayout());
        // 向面板添加按钮
        contentPanel.add(btn, BorderLayout.CENTER);

//        frame.getContentPane().add(btn, BorderLayoutDemo.CENTER);
        frame.setContentPane(contentPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
