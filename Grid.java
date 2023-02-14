import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.lang.Math;

public class Example {
    /* entry point for the application */
    public static void main(String[] args) {
        SwingExample example = new SwingExample();
    }
}

public class SwingExample extends JFrame {
    /* image icon -- using more than once */
    ImageIcon image = new ImageIcon("seelie.jpg"); 
    Border border = BorderFactory.createLineBorder(new Color(0x989898));

    /* constructor */
    public SwingExample() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        /* set a label */
        this.createGrid(100);
        this.setNone(); // last frame.
        this.setFrame();
    }

    private void setFrame() {
        /* JFrame = a GUI window */
        this.setTitle("JFrame Example");
        this.setSize(1000,1000);
        this.setResizable(true);
        this.setVisible(true);
        //this.setLayout(null);
        this.getContentPane().setBackground(new Color(0x444444));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* change image icon. */
        this.setIconImage(image.getImage());
    }

    private void createGrid(int _cells) {
        int xy = (int) Math.ceil(Math.sqrt(_cells));

        for (int i=0; i < 100; i++) {
            this.setLabel(xy, i);
        }
    }

    private void setLabel(int _xy, int _idx) {
        JLabel label = new JLabel();
        int xyPow = (int) Math.pow(_xy, 2);
        int xBound = (int) (_idx % _xy) * xyPow;
        int yBound = (int) Math.floor(_idx / _xy) * xyPow;
        
        label.setBounds(xBound, yBound, xyPow, xyPow);
        label.setForeground(new Color(0xFFFFFF));
        label.setText(Integer.toString(_idx));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        this.add(label);
        /*
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
        this.add(label);
        */
    }

    private void setNone() {
        JLabel label = new JLabel();
        this.add(label);
    }
}

