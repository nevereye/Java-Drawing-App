import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;



// Chris Note:
// The User will draw on this JComponent.
// It will be stored in the main JFrame in the Main class.
public class DrawCanvasPanel extends JPanel {
    
    private MouseListener mouse;

    // stores background color.
    Color backgroundColor;
    // stores user's brush color.
    Color brushColor;

    // INSERT variable for Brush size

    // constructor
    public DrawCanvasPanel()
    {
        mouse = new Listener();
        this.addMouseListener(new Listener());

        // default colors for background and brush color:
        backgroundColor = Color.white;
        brushColor = Color.BLACK;
    }


}
