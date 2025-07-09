package Event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {
    public MyButton(String text) {
        super(text);
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
