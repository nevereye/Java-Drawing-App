import javax.swing.*;
import java.awt.*;

// Chris Note:
// The User will draw on this JComponent.
// It will be stored in the main JFrame in the Main class.
public class DrawCanvasPanel extends JPanel {
    // constructor
    public DrawCanvasPanel()
    {

    }

    @Override
    public void paint(Graphics g){
        g.drawOval(0, 0, 100, 100);
        repaint();
    }
}
