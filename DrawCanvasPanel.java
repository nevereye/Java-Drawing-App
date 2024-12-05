import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

// Chris Note:
// The User will draw on this JComponent.
// It will be stored in the main JFrame in the Main class.
// User draws
public class DrawCanvasPanel extends JPanel {

    // Chris:
    // stores user's drawing
    // we draw on the picture
    // Then we draw the picture onto the JPanel in paintComponent method.
    BufferedImage pic;
    Graphics2D bBrush;

    // constructor
    public DrawCanvasPanel()
    {
		pic = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

        

    }

    @Override
    // Update: For painting in java Swing we overide the paintComponent method
    // We also cast Graphics g as Graphics2D object.
    // I learned this from textbook and online articles.
    public void paintComponent(Graphics g){
        super.paintComponent(g); // pass g to super constructor.
        // Paints the background!

        // cast g as Graphics2D object (Better, more methods)
        Graphics2D g2d = (Graphics2D)g;


        g2d.drawImage(pic, 0, 0,null );

        //g.drawOval(100, 100, 100, 100);
        //repaint();
    }

    public void drawLine( Graphics2D g2d)
    {

    }
}
