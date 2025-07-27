package SwingComp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo implements ItemListener, ActionListener {
    JFrame frame = new JFrame("Menu Demo");
    JTextField tf = new JTextField();

    public static void main(String[] args) {
        MenuDemo md = new MenuDemo();
        md.go();
    }

    public void go() {
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu menu, subMenu;
        JMenuItem menuItem;

        menu = new JMenu("File");
        menuBar.add(menu);
        menu.setMnemonic(KeyEvent.VK_F);

        menuItem = new JMenuItem("New");
        menuItem.setMnemonic(KeyEvent.VK_N);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menuItem = new JMenuItem("Save", KeyEvent.VK_S);
        menuItem.addActionListener(this);
        menuItem.setEnabled(false);
        menu.add(menuItem);

        menuItem = new JMenuItem("Close");
        menuItem.setMnemonic(KeyEvent.VK_C);
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menu.add(new JSeparator());

        menuItem = new JMenuItem("Exit", KeyEvent.VK_E);
        menuItem.addActionListener(this);
        menu.add(menuItem);

        menu = new JMenu("Option");
        menuBar.add(menu);
        menu.add("Font");

        subMenu = new JMenu("Color");
        menu.add(subMenu);
        menuItem = new JMenuItem("Foreground");
        menuItem.addActionListener(this);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        subMenu.add(menuItem);

        menuItem = new JMenuItem("Background");
        menuItem.addActionListener(this);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
        subMenu.add(menuItem);
        menu.addSeparator();

        JCheckBoxMenuItem cm = new JCheckBoxMenuItem("Always On Top");
        cm.addItemListener(this);
        menu.add(cm);
        menu.addSeparator();

        JRadioButtonMenuItem rm = new JRadioButtonMenuItem("Small", true);
        rm.addItemListener(this);
        menu.add(rm);

        ButtonGroup group = new ButtonGroup();
        group.add(rm);

        rm = new JRadioButtonMenuItem("Large");
        rm.addItemListener(this);
        menu.add(rm);
        group.add(rm);

        menu = new JMenu("Help");
        menuBar.add(menu);
        menuItem = new JMenuItem("About", new ImageIcon("dukeWaveRed.gif"));
        menuItem.addActionListener(this);
        menu.add(menuItem);

        tf.setEditable(false);
        Container cp = frame.getContentPane();
        cp.add(tf, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int state = e.getStateChange();
        JMenuItem menuItem = (JMenuItem) e.getSource();
        String command = menuItem.getText();

        if (state == ItemEvent.SELECTED)
            tf.setText(command + "selected");
        else
            tf.setText(command + "deselected");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText(e.getActionCommand());
        if (e.getActionCommand() == "Exit")
            System.exit(0);
    }

}
