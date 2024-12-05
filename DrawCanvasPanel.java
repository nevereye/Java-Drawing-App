import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

// UPDATE (12/5/24) - Finished drawing blank canvas

// Chris Note:
// The User will draw on this JComponent.
// It will be stored in the main JFrame in the Main class.
// User draws
public class DrawCanvasPanel extends JPanel {

    // CHRIS IS WORKING HERE

    
    // Chris:
    // We stores  the user's drawing edits into BufferedImage.
    // we draw on the BufferedImage picture, NOT directly onto JPanel.
    // we edit pixel date (draw) of the picture using bBrush Graphics2D.
    // Then we draw (render) the picture onto the JPanel in paintComponent method using the JPanel's own Graphics object.
    private BufferedImage picture;
    private Graphics2D bBrush;

    // color of Picture's background.
    Color backgroundColor;
    // color bBrush is using to draw onto pic. It's the pen we use to draw on our canvas!
    Color brushColor;

    // width and height of picture.
    int picHeight;
    int picWidth;

    // constructor
    public DrawCanvasPanel()
    {
        // Define Image Width and Height:
        picHeight = 400;
        picWidth = 400;

        // Creates BufferedImage object. (our REAL drawing canvas).
        // Note: BufferedImage Object's pixels appear to be all colored black by defualt on creation.
		picture = new BufferedImage(picWidth, picHeight, BufferedImage.TYPE_INT_RGB);

        // Background color of JPanel component, NOT the picture.
        this.setBackground(Color.GRAY);

        // Default Colors used to draw ONTO the picture.
        backgroundColor = Color.WHITE;
        brushColor = Color.BLACK;

        // createGraphics() - Creates a Graphics2D, which can be used to draw into this BufferedImage.
        // This new Graphics2D "belongs" to pic only!
        bBrush = picture.createGraphics();
        // Colors In Background of image!!!
        bBrush.fillRect(0,0,picWidth,picHeight);

        // MUST: call dispose() after using Graphics2D object you got from createGrphics() method.
        // This is needed to free up system resources space. Don't use this inside PaintComponent method!
        bBrush.dispose();
    } // END OF CONSTRUCTOR

    @Override
    // Chris Update: For painting in java Swing we overide the paintComponent method
    // We also cast Graphics g as Graphics2D object.
    // I learned this from textbook and online articles.
    public void paintComponent(Graphics g){
        super.paintComponent(g); // pass g to super constructor, so JPanel Paints the background!

        // cast g as Graphics2D object (Better, more methods)
        Graphics2D g2d = (Graphics2D)g;

        // draws Buffered Image Pic.
        g2d.drawImage(picture, 0, 0,null );

    }

    // sets brush properties (Color and Stroke)
    public void set( Graphics2D g2d)
    {

    }
}
