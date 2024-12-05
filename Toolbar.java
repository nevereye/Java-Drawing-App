import java.awt.*;
import javax.swing.*;

public class Toolbar extends JPanel{
    public Toolbar(){
        this.setBackground(Color.red);
        this.setSize(new Dimension(200, 200));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); // pass g to super constructor.
    }
}
