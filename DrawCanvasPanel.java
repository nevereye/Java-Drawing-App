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
    // we edit pixel date (draw) of the picture using picBrush Graphics2D.
    // Then we draw (render) the picture onto the JPanel in paintComponent method using the JPanel's own Graphics object.
    private BufferedImage picture;
    private Graphics2D picBrush; // DONT GIVE ACCESSOR METHOD!

    // Upadate: Added int variable for brush's size. Will be put into "new BasicStroke( size )". 
    // BasicStroke only affects draw methods in Graphics classes (outline and lines NOT fill methods).
    private int brushSize;

    // color of Picture's background.
    Color backgroundColor;
    // color picBrush is using to draw onto pic. It's the pen we use to draw on our canvas!
    Color brushColor;

    // width and height of picture.
    int picHeight;
    int picWidth;

    // constructor - creates image, sets Default values.
    public DrawCanvasPanel()
    {
        // Define Image Width and Height:
        picHeight = 400;
        picWidth = 400;
        brushSize = 2;

        // Creates BufferedImage object. (our REAL drawing canvas).
        // Note: BufferedImage Object's pixels appear to be all colored black by defualt on creation.
		picture = new BufferedImage(picWidth, picHeight, BufferedImage.TYPE_INT_RGB);

        // PANEL PROPERTIES
        // Background color of JPanel component, NOT the picture.
        this.setBackground(Color.GRAY);
        // gives spacing around border.
        this.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10,Color.DARK_GRAY));
        

        // BRUSH PROPERTIES
        // Default Colors used to draw ONTO the picture.
        backgroundColor = Color.WHITE;
        brushColor = Color.BLACK;

        // DRAWING BLANK ONTO PICTURE.
        // createGraphics() - Creates a Graphics2D, which can be used to draw into this BufferedImage.
        // This new Graphics2D "belongs" to pic only!
        picBrush = picture.createGraphics();
        // Colors In Background of image!!!
        picBrush.fillRect(0,0,picWidth,picHeight);

        // MUST: call dispose() after using Graphics2D object you got from createGrphics() method.
        // This is needed to free up system resources space. Don't use this inside PaintComponent method!
        picBrush.dispose();
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

    // UPDATED:
    // sets properties of brush (Graphics 2D) to current (Color and Stroke (size of brush) (maybe))
    // passing by reference.
    // NOTE: USE THIS IN DrawListener Class! (???)
    public void updateBrush( Graphics2D g2d)
    {
        g2d.setColor(brushColor); // sets to brush color.
        g2d.setStroke( new BasicStroke(brushSize)); // sets size of brush. 
    }

    // Setter and getter methods:

    public Color getBrushColor()
    {
        Color copy = brushColor;
        return copy;
    }

    // Note: Is Color Object immutable??? is this shallow copy???
    public Color getBackgroundColor()
    {
        Color copy = backgroundColor;
        return copy;
    }

    // set brush and background colors
    public void setBrushColor(Color newColor)
    {
        brushColor = newColor;
    }


    // DRAWING METHODS

    // Draws line using BasicStroke and given color.
    public void drawLine( double startX, double startY, double endX, double endY)
    {
        picBrush = picture.createGraphics();
        updateBrush(picBrush); // give new graphics object brush properties.

        // need to cast doubles as integers for this method.
        picBrush.drawLine((int)startX, (int)startY, (int)endX, (int)endY);

        // dispose after drawing
        picBrush.dispose();

        // recalls paintComponent method to display update
        repaint();
    }


}
