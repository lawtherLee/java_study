package GUI;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class TwoStatesButtonDemo {
    JFrame frame = new JFrame("Two states button demo");

    List<JCheckBox> cbList = new ArrayList<>();
    List<JRadioButton> rbList = new ArrayList<>();

    JTextArea ta = new JTextArea();

    public TwoStatesButtonDemo() {
        for (int i = 1; i <= 6; i++) {
            cbList.add(new JCheckBox("cb" + i));
            rbList.add(new JRadioButton("rb" + i));
        }
    }

    public static void main(String[] args) {
        TwoStatesButtonDemo demo = new TwoStatesButtonDemo();
        demo.go();
    }

    public void go() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        JPanel pa = new JPanel();
        JPanel pb = new JPanel();

        p1.add(cbList.get(0));
        p1.add(cbList.get(1));
        p1.add(cbList.get(2));

        Border etched = BorderFactory.createEtchedBorder();
        Border border = BorderFactory.createTitledBorder(etched, "Check boxes");

        p1.setBorder(border);

        p2.add(cbList.get(3));
        p2.add(cbList.get(4));
        p2.add(cbList.get(5));
        border = BorderFactory.createTitledBorder(etched, "Check groups");
        p2.setBorder(border);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(cbList.get(3));
        group1.add(cbList.get(4));
        group1.add(cbList.get(5));

        p3.add(rbList.get(0));
        p3.add(rbList.get(1));
        p3.add(rbList.get(2));
        border = BorderFactory.createTitledBorder(etched, "Radio boxes");
        p3.setBorder(border);

        p4.add(rbList.get(3));
        p4.add(rbList.get(4));
        p4.add(rbList.get(5));
        border = BorderFactory.createTitledBorder(etched, "Radio groups");
        p4.setBorder(border);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(rbList.get(3));
        group2.add(rbList.get(4));
        group2.add(rbList.get(5));

        JScrollPane jp = new JScrollPane(ta);

        p5.setLayout(new BorderLayout());
        p5.add(jp, BorderLayout.CENTER);

        border = BorderFactory.createTitledBorder(etched, "Results");
        p5.setBorder(border);

        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox cb = (JCheckBox) e.getSource();
                if (cb == cbList.get(0)) {
                    ta.append("cb1 is " + (cb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (cb == cbList.get(1)) {
                    ta.append("cb2 is " + (cb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (cb == cbList.get(2)) {
                    ta.append("cb3 is " + (cb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (cb == cbList.get(3)) {
                    ta.append("cb4 is " + (cb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (cb == cbList.get(4)) {
                    ta.append("cb5 is " + (cb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (cb == cbList.get(5)) {
                    ta.append("cb6 is " + (cb.isSelected() ? "selected" : "deselected") + "\n");
                }
            }

        };

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton rb = (JRadioButton) e.getSource();
                if (rb == rbList.get(0)) {
                    ta.append("rb1 is " + (rb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (rb == rbList.get(1)) {
                    ta.append("rb2 is " + (rb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (rb == rbList.get(2)) {
                    ta.append("rb3 is " + (rb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (rb == rbList.get(3)) {
                    ta.append("rb4 is " + (rb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (rb == rbList.get(4)) {
                    ta.append("rb5 is " + (rb.isSelected() ? "selected" : "deselected") + "\n");
                } else if (rb == rbList.get(5)) {
                    ta.append("rb6 is " + (rb.isSelected() ? "selected" : "deselected") + "\n");
                }
            }

        };

        for (JCheckBox checkBox : cbList) {
            checkBox.addItemListener(il);
        }

        for (JRadioButton radioButton : rbList) {
            radioButton.addActionListener(al);
        }

        pa.setLayout(new GridLayout(0, 1));
        pb.setLayout(new GridLayout(0, 1));

        pa.add(p1);
        pa.add(p2);
        pb.add(p3);
        pb.add(p4);

        Container cp = frame.getContentPane();
        cp.setLayout(new GridLayout(0, 1));
        cp.add(pa);
        cp.add(pb);
        cp.add(p5);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

