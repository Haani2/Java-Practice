package JavaSwing;

import javax.swing.*;

public class swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");
        JButton btn   = new JButton("Click Me");
        JLabel  label = new JLabel("Hello, Swing!");

        btn.addActionListener(e -> label.setText("Button clicked!"));

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(label);
        frame.add(btn);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
