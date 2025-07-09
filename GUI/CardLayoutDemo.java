package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class CardLayoutDemo extends MouseAdapter {
    CardLayout myCard;
    JFrame frame;
    Container contentPane;


    public static void main(String[] args) {
        CardLayoutDemo demo = new CardLayoutDemo();
        demo.go();
    }

    public static Color getRandomColor() {
        Random random = new Random();
        // 生成 0 到 255 之间的随机整数作为 RGB 值
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }

    public void go() {
        frame = new JFrame("CardLayout Demo");
        contentPane = frame.getContentPane();
        myCard = new CardLayout();
        contentPane.setLayout(myCard);

        for (int i = 0; i < 3; i++) {
            Color randomColor = getRandomColor();

            JPanel panel = new JPanel();
            JLabel label = new JLabel("This is the " + (i + 1) + "panel");


            panel.add(label);
            panel.setBackground(randomColor);

            panel.addMouseListener(this);
            contentPane.add(panel, "panel" + (i + 1));
        }

        myCard.show(contentPane, "panel1");
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void mouseClicked(MouseEvent e) {
        myCard.next(contentPane);
    }
}
