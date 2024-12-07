import javax.swing.*;
import java.awt.*;

public class SideBar extends JPanel{
    private ColorOptionPanel colorPanel;
    private OptionPanel optionPanel;
    public SideBar(){
        this.setLayout(new GridLayout(2, 1, 5, 5));
        this.setBackground(Color.green);
        
        // add color panel
        colorPanel = new ColorOptionPanel();
        this.add(colorPanel);

        // add option panel
        optionPanel = new OptionPanel();
        this.add(optionPanel);
    }
}
