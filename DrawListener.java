import java.awt.event.*;

/*
*	CSCI 185 M01
*	Fall 2024
*
*	M10: Final Programming Project
*	Student Team Names: Christopher Rodriguez, Jack Lin, Matthew Pietrzak
*	Professor Name: Wenjia Li
*	Date: DEC. 12, 2024
*	Version: 2.0
*	
*	Class Name: DrawListener
*	Class’s Main Contributor: Christopher Rodriguez
*/


public class DrawListener implements MouseListener, MouseMotionListener {
   
    // Chris: These vars store mouse pointer's current and previous positions:
    // pos of mouse frame before
    private double prevMouseX;
    private double prevMouseY;
    // pos of mouse current frame
    private double currMouseX;
    private double currMouseY;


    // IDEA - Chris: pass reference of DrawCanvas Panel into here via constructor!
    // call drawing commands of canvas!
    final private DrawCanvasPanel canvas;

    // Chris: Constructor for this mouse Listener
    public DrawListener( DrawCanvasPanel canvas)
    {
        // passing by reference
        this.canvas = canvas;
    }

    // mousePressed event will occur and execute first, before mouse Dragging event can happen.
    @Override
    public void mousePressed(MouseEvent e)
    {

        prevMouseX = e.getX();
        prevMouseY = e.getY();

        currMouseX = e.getX();
        currMouseY = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

    }
    
    @Override
    public void mouseExited(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }
    
    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    


    // MouseMotion Listener events!
    @Override
    public void mouseDragged(MouseEvent e) {
        // gather current cursor position.
        currMouseX = e.getX();
        currMouseY = e.getY();
    
        // Drawing command happens here
        canvas.drawLine(prevMouseX, prevMouseY, currMouseX, currMouseY);

        // store as prev point.
        prevMouseX = currMouseX;
        prevMouseY = currMouseY;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
    }
}
