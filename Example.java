import javax.swing.*;
import javax.swing.border.Border;
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
        this.setLabel(0, 0);
        this.setLabel(502, 0);
        this.setLabel(0, 500);
        this.setLabel(502, 500);
        this.setNone();
        this.setFrame();
    }

    private void setFrame() {
        /* JFrame = a GUI window */
        this.setTitle("JFrame Example");
        this.setSize(1000,1000);
        this.setResizable(true);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0x444444));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* change image icon. */
        this.setIconImage(image.getImage());
    }

    private void setLabel(int _x, int _y) {
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.green, 2);

        label.setIcon(image);
        label.setText("Hello World.");
        label.setForeground(new Color(0xFFFFFF));
        label.setBackground(new Color(0x000000));
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(10);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(border);
        label.setBounds(_x, _y, 500, 500);

        this.add(label);
    }

    private void setNone() {
        JLabel label = new JLabel();
        this.add(label);
    }
}

