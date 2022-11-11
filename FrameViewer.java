/*10. Run the following program:
Modify the program as follows:
• Double the frame size.
• Change the greeting to “Hello, your name!”.
• Change the background color to pale green (see Exercise E2.10).
• For extra credit, add an image of yourself. (Hint: Construct an ImageIcon.)*/

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class FrameViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        JLabel label = new JLabel("Hello, your name!");
        label.setOpaque(true);
        label.setBackground(Color.green);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // هنا تم اضافة صورة للفريم
        Container c = frame.getContentPane();
        label.setIcon(new ImageIcon("C:\\play.png"));
        Dimension size = label.getPreferredSize();
        label.setBounds(10, 30, size.width, size.height);
        c.add(label);
        frame.setVisible(true);


    }
}
