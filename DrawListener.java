import java.awt.event.*;

public class DrawListener implements MouseListener {
   
    private boolean isMousePressed = false;

    // Chris: These vars store mouse pointer's current and previous positions:
    private double prevMouseX;
    private double prevMouseY;
    private double currMouseX;
    private double currMouseY;


    // IDEA - Chris: pass reference of DrawCanvas Panel into here via constructor!
    // call drawing commands of canvas!
    private DrawCanvasPanel canvas;

    @Override
    public void mousePressed(MouseEvent e)
    {
        this.isMousePressed = true;
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        this.isMousePressed = false;
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

    public boolean isMousePressed(){
        return this.isMousePressed;
    }
}
