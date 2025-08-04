package SwingComp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;


public class FileChooserDemo implements ActionListener {
    JFrame frame;
    JFileChooser fc;
    JTextField tf;
    JButton openBtn, saveBtn, delBtn;

    public static void main(String[] args) {
        FileChooserDemo fcd = new FileChooserDemo();
        fcd.go();
    }

    public void go() {
        frame = new JFrame("FileChooseDemo");
        fc = new JFileChooser();
        tf = new JTextField();

        openBtn = new JButton("Open File");
        openBtn.addActionListener(this);

        saveBtn = new JButton("Save File");
        saveBtn.addActionListener(this);

        delBtn = new JButton("Delete File");
        delBtn.addActionListener(this);

        JPanel jp = new JPanel();
        jp.add(openBtn);
        jp.add(saveBtn);
        jp.add(delBtn);


        Container cp = frame.getContentPane();
        cp.add(jp, BorderLayout.CENTER);
        cp.add(tf, BorderLayout.SOUTH);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button == openBtn) {
            int select = fc.showOpenDialog(frame);
            if (select == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                tf.setText("Opening: " + file.getName());
            } else {
                tf.setText("Open command canceled by user");
            }
        } else if (button == saveBtn) {
            int select = fc.showSaveDialog(frame);
            if (select == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                tf.setText("Saving: " + file.getName());
            } else {
                tf.setText("Save command canceled by user");
            }
        } else if (button == delBtn) {
            int select = fc.showDialog(frame, "删除");
            if (select == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                tf.setText("Deleting: " + file.getName());
            } else {
                tf.setText("Delete command canceled by user");
            }
        }
    }
}
