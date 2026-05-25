package JavaSwing;
import javax.swing.*;
import java.awt.event.*;

public class eventDeligation {
    public static class KeyDemo extends JFrame implements KeyListener {
        JLabel label;

        KeyDemo() {
            label = new JLabel("Press any key");

            // Step 3: register — 'this' frame listens to its own key events
            addKeyListener(this);

            add(label);
            setSize(300, 120);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }

        // Step 2: three methods MUST be overridden when implementing KeyListener
        public void keyPressed(KeyEvent e) {
            label.setText("Key Pressed: " + e.getKeyChar());
        }

        public void keyReleased(KeyEvent e) {
            label.setText("Key Released: " + e.getKeyChar());
        }

        public void keyTyped(KeyEvent e) {
            label.setText("Key Typed: " + e.getKeyChar());
        }

        public static void main(String[] args) {
            new KeyDemo();
        }
    }
}
