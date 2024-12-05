import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

// Chris Note:
// The User will draw on this JComponent.
// It will be stored in the main JFrame in the Main class.
// User draws
public class DrawCanvasPanel extends JPanel {

    // CHRIS IS WORKING HERE

    // Chris:
    // stores user's drawing
    // we draw on the picture
    // Then we draw the picture onto the JPanel in paintComponent method.
    private BufferedImage pic;
    private Graphics2D bBrush;

    Color backgroundColor;
    Color brushColor;

    // constructor
    public DrawCanvasPanel()
    {
		pic = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);

        // Background color of JPanel component, NOT the picture.
        this.setBackground(Color.GRAY);

        // Default Colors used to draw ONTO the picture.
        backgroundColor = Color.WHITE;
        brushColor = Color.BLACK;

        
        bBrush = pic.createGraphics();
        bBrush.fillRect(0,0,100,100);

        // call dispose 
        bBrush.dispose();

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

        // draws Image
        g2d.drawImage(pic, 0, 0,null );
        
        //g.drawOval(100, 100, 100, 100);
        //repaint();
    }

    public void set( Graphics2D g2d)
    {

    }
}
