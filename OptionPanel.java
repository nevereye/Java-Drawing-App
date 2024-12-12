import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class OptionPanel extends JPanel{
    JPanel panel1;
    JPanel panel2;
    JLabel toolbarLabel;
    JCheckBox eraser; // toggle "eraser mode" for DrawCanvasPanel on and off.
    JButton clearButton; // clear drawing canvas into a fresh blank sheet.
    JSlider slider;
    public OptionPanel(DrawCanvasPanel canvas){
        this.setLayout(new GridLayout(2, 1, 0, 0));
        this.setBackground(Color.white);
        
        // panel one adds jlabel for toolbar as well as th clear button in a grid layout
        panel1 = new JPanel();
        panel1.setBackground(Color.white);
        panel1.setLayout(new GridLayout(1, 2, 0, 0));
        toolbarLabel = new JLabel("Tool Bar: ");
        toolbarLabel.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        panel1.add(toolbarLabel); // add jlabel
        clearButton = new JButton("clear"); 
        clearButton.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                canvas.clearCanvas();
            }
        });
        panel1.add(clearButton); // add clear button
        this.add(panel1);

        // panel two adds eraser and slider in a grid layout
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 1, 0, 0));
        panel2.setBackground(Color.white);
        eraser = new JCheckBox("eraser");
        eraser.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        eraser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                canvas.setEraserMode(eraser.isSelected());
            }
        });
        panel2.add(eraser); // add eraser

        // Creates and adds a JSlider.
        // JSlider changes the BrushSize stored in Canvas Object.
        slider = new JSlider(1, 20);
        slider.setBorder(BorderFactory.createLineBorder(Color.black, 5, false));
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(2);
        slider.setPaintTicks(true);        
        slider.setPaintLabels(true);
        canvas.setBrushSize(slider.getValue());
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e){
                canvas.setBrushSize(slider.getValue());
            }
        });
        panel2.add(slider); // add slider
        this.add(panel2);
    }
}
