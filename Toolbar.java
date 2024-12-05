import java.awt.*;
import javax.swing.*;

public class Toolbar extends JPanel{
    public Toolbar(){
        this.setBackground(Color.ORANGE);
        this.add(new JButton("test button"));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); // pass g to super constructor.
    }
}
