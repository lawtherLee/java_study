package GUI;

import javax.swing.*;
import java.awt.*;

class MyWindow extends JFrame {


    MyWindow() {
        setTitle("Grid Example");
        Container contentPane = getContentPane();
        contentPane.setPreferredSize(new Dimension(400, 350));
        contentPane.setLayout(new GridLayout(3, 2));


        for (int i = 0; i < 6; i++) {
            JButton button = new JButton("btn" + (i + 1));
            contentPane.add(button);
        }
        pack();
        setVisible(true);
    }


}

public class GridLayoutDemo {
    public static void main(String[] args) {
        MyWindow that = new MyWindow();
        that.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}