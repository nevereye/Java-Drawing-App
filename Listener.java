import java.awt.event.*;

public class Listener implements MouseListener {
   
    private boolean isMousePressed = false;

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
