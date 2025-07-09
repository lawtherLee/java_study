package GUI;

import javax.swing.*;
import java.awt.event.*;

class ButtonExample extends WindowAdapter implements ActionListener {
    JFrame f;
    JButton b;
    JTextField tf;
    int tag = 0;

    public static void main(String[] args) {
        ButtonExample be = new ButtonExample();
        be.go();
    }

    public void go() {
        f = new JFrame("Button Example");
        b = new JButton("Click Me");
        tf = new JTextField();
        b.addActionListener(this);
        f.getContentPane().add(b, "South");
        f.getContentPane().add(tf, "Center");
        f.addWindowListener(this);
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = "You have pressed the Button";
        String s2 = "You do another time";
        if (tag == 0) {
            tf.setText(s1);
            tag = 1;
        } else {
            tf.setText(s2);
            tag = 0;
        }
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}
