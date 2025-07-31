package SwingComp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo implements ActionListener {
    JFrame frame;
    JDialog dialog;
    JButton button;

    public static void main(String[] args) {
        DialogDemo dd = new DialogDemo();
        dd.go();
    }

    public void go() {
        frame = new JFrame("Dialog");
        dialog = new JDialog(frame, "dialog", true);
        dialog.getContentPane().add(new JLabel("I am a dialog"));
        dialog.setSize(60, 40);

        button = new JButton("click me");
        button.addActionListener(this);

        Container cp = frame.getContentPane();
        cp.add(button, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        dialog.setVisible(true);
    }

}
