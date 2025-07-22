package SwingComp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListDemo {
    JFrame frame = new JFrame("JList Demo");
    JList list;
    DefaultListModel listModel;
    JPanel panel;
    JTextField tf;
    JButton btn;

    public static void main(String[] args) {
        JListDemo ld = new JListDemo();
        ld.go();
    }

    public void go() {
        listModel = new DefaultListModel();
        listModel.addElement("1");
        listModel.addElement("2");
        listModel.addElement("3");
        listModel.addElement("5");

        list = new JList(listModel);

        JScrollPane jsp = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        Container cp = frame.getContentPane();
        cp.add(jsp);

        tf = new JTextField(15); //
        btn = new JButton("Add");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(tf.getText());
            }
        });

        panel = new JPanel();
        panel.add(tf);
        panel.add(btn);

        cp.add(panel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
