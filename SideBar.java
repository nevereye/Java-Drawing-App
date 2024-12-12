import javax.swing.*;
import java.awt.*;

public class SideBar extends JPanel{
    private ColorOptionPanel colorPanel;
    private OptionPanel optionPanel;
    private DrawCanvasPanel canvas;

    
    public SideBar( DrawCanvasPanel canvas){

        // pass and store the reference of a DrawCanvasPanel object.
        this.canvas = canvas;

        this.setLayout(new GridLayout(2, 1, 10, 10));
        this.setBackground(Color.green);

        // set preferred size, height does nothing to change panel's size when added to borderLayout. But width widens it.
        this.setPreferredSize(new Dimension(200,0));

        // Chris: this adds a "Border" around SideBar, basically adds empty space around component. Helps to visually seperate components.
        int spacing = 10;
        this.setBorder(BorderFactory.createMatteBorder(spacing, spacing, spacing, spacing, Color.ORANGE));
        
        // add color panel
        colorPanel = new ColorOptionPanel( canvas );
        this.add(colorPanel);

        // add option panel, pass reference into constructor.
        optionPanel = new OptionPanel( canvas );
        this.add(optionPanel);
    }
}
