import java.awt.event.*;

public class Listener implements MouseListener {
   
    private boolean isMouseClicked = false;

    @Override
    public void mousePressed(MouseEvent e)
    {
        this.isMouseClicked = true;
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        this.isMouseClicked = false;
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

    public boolean isMouseClicked(){
        return this.isMouseClicked;
    }
}
