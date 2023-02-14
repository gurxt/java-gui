import javax.swing.*;
import java.awt.*;

public class Example {
    /* entry point for the application */
    public static void main(String[] args) {
        SwingExample example = new SwingExample();
    }
}

public class SwingExample extends JFrame {
    /* image icon -- using more than once */
    ImageIcon image = new ImageIcon("seelie.jpg"); 
    /* constructor */
    public SwingExample() {
        /* set a label */
        this.setLabel();
        this.setFrame();
    }

    public void setFrame() {
        /* JFrame = a GUI window */
        this.setTitle("JFrame Example");
        this.setSize(420,420);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x444444));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* change image icon. */
        this.setIconImage(image.getImage());
    }

    public void setLabel() {
        JLabel label = new JLabel();
        label.setIcon(image);
        label.setText("Hello World.");
        label.setForeground(new Color(0xFFFFFF));
        label.setHorizontalTextPosition(JLabel.LEFT);
        this.add(label);
    }
}

