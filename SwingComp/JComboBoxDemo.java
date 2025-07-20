package SwingComp;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxDemo {
    JFrame frame = new JFrame("JComboBox Demo");
    JComboBox<String> jcb1, jcb2;
    JTextArea ta = new JTextArea(0, 30);
    JPanel[] panels;

    public static void main(String[] args) {
        JComboBoxDemo cbd = new JComboBoxDemo();
        cbd.go();
    }

    public void go() {
        panels = new JPanel[4]; // 初始化面板数组
        for (int i = 0; i < 4; i++) {
            panels[i] = new JPanel();
        }

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};

        jcb1 = new JComboBox<String>(items);
        panels[0].add(jcb1);
        jcb1.setSelectedIndex(3);
        Border etched = BorderFactory.createEtchedBorder();
        Border border = BorderFactory.createTitledBorder(etched, "Uneditable JComboBox");
        panels[0].setBorder(border);

        jcb2 = new JComboBox<String>();
        jcb2.addItem("Item 5");
        jcb2.addItem("Item 6");
        jcb2.addItem("Item 7");
        jcb2.addItem("Item 8");
        jcb2.setEditable(true);
        panels[1].add(jcb2);
        border = BorderFactory.createTitledBorder(etched, "Editable JComboBox");
        panels[1].setBorder(border);

        JScrollPane jp = new JScrollPane(ta);
        panels[2].setLayout(new BorderLayout());
        panels[2].add(jp);
        border = BorderFactory.createTitledBorder(etched, "Results");
        panels[2].setBorder(border);

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox jcb = (JComboBox) e.getSource();
                if (jcb == jcb1) {
                    jcb2.insertItemAt((String) jcb1.getSelectedItem(), 0);
                    ta.append("\nItem" + jcb1.getSelectedItem() + "inserted");
                } else {
                    ta.append("\n You selected item:" + jcb2.getSelectedItem());
                    jcb2.addItem((String) jcb2.getSelectedItem());
                }
            }
        };

        jcb1.addActionListener(al);
        jcb2.addActionListener(al);

        panels[3].setLayout(new GridLayout(0, 1));
        panels[3].add(panels[0]);
        panels[3].add(panels[1]);
        
        Container cp = frame.getContentPane();
        cp.setLayout(new GridLayout(0, 1));
        cp.add(panels[3]);
        cp.add(panels[2]);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
