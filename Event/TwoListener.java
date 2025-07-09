package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TwoListener implements MouseMotionListener, MouseListener {
    private JFrame frame;
    private JTextField tf;

    public static void main(String[] args) {
        TwoListener two = new TwoListener();
        two.go();
    }

    public void go() {
        frame = new JFrame("Mouse Motion Listener Demo");
        Container contentPane = frame.getContentPane();
        contentPane.add(new Label("Click and drag the  mouse"), BorderLayout.NORTH);
        tf = new JTextField(30);
        contentPane.add(tf, BorderLayout.SOUTH);

        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseDragged(MouseEvent e) {
        String s = " Mouse dragged at " + e.getX() + ", " + e.getY();
        tf.setText(s);
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }


    public void mousePressed(MouseEvent e) {

    }


    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        String s = " Mouse entered at ";
        tf.setText(s);
    }

    public void mouseExited(MouseEvent e) {

    }

}
