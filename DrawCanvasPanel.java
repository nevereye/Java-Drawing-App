import javax.swing.*;
import java.awt.*;

// Chris Note:
// The User will draw on this JComponent.
// It will be stored in the main JFrame in the Main class.
public class DrawCanvasPanel extends JPanel {
    // stores background color.
    private Color backgroundColor;
    // stores user's brush color.
    private Color brushColor;

    // INSERT variable for Brush size

    // constructor
    public DrawCanvasPanel()
    {
        // default colors for background and brush color:
        backgroundColor = Color.white;
        brushColor = Color.BLACK;

        this.setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g){
        g.drawOval(0, 0, 100, 100);
        repaint();
    }
}
