import javax.swing.*;
import java.awt.*;

// Chris Note:
// The User will draw on this JComponent.
// It will be stored in the main JFrame in the Main class.
// User draws
public class DrawCanvasPanel extends JPanel {
    // constructor
    public DrawCanvasPanel()
    {
        this.setBackground(Color.black);    
    }

    @Override
    // Update: For painting in java Swing we overide the paintComponent method
    // We also cast Graphics g as Graphics2D object.
    // I learned this from textbook and online articles.
    public void paintComponent(Graphics g){
        super.paintComponent(g); // pass g to super constructor.

        // cast g as Graphics2D object (Better, more methods)
        Graphics2D g2d = (Graphics2D)g; 

        g.drawOval(100, 100, 100, 100);
        //repaint();
    }
}
