import javax.swing.*;
import java.awt.*;

public class SideBar extends JPanel{
    private ColorOptionPanel colorPanel;
    private OptionPanel optionPanel;

    private DrawCanvasPanel SideBarcanvas; // Chris: pass reference of canvas so buttons inside sidebar can modify it???

    public SideBar(DrawCanvasPanel canvas){

        this.SideBarcanvas = canvas; // pass reference to ColorOptionPanel Constructor and OptionPanel Constructor?

        this.setLayout(new GridLayout(2, 1, 5, 5));
        this.setBackground(Color.green);

        // set preferred size, height does nothing to change panel's size when added to borderLayout. But width widens it.
        this.setPreferredSize(new Dimension(200,0));

        // Chris: this adds a "Border" around SideBar, basically adds empty space around component. Helps to visually seperate components.
        int spacing = 10;
        this.setBorder(BorderFactory.createMatteBorder(spacing, spacing, spacing, spacing, Color.ORANGE));
        
        // add color panel
        colorPanel = new ColorOptionPanel();
        this.add(colorPanel);

        // add option panel
        optionPanel = new OptionPanel();
        this.add(optionPanel);
    }
}
