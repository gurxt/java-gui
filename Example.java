import javax.swing.*;
import java.awt.*;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Example example = new Example();
        example.setFrame(frame);
    }

    private void setFrame(JFrame _frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        _frame.setSize(width, height);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        _frame.setVisible(true);
        _frame.getContentPane().setBackground(Color.BLACK);
    }
}

/*
public class Button {
    JButton button = new JButton("hello");
    public Button(JFrame _frame, int _idx) {
        button.setBounds(130, 100 * (_idx + 1), 100, 40);
        _frame.add(button);
    }
    
    public JButton getButton() {
        return button;
    }
}
*/
