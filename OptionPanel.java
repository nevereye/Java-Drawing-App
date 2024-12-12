import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class OptionPanel extends JPanel{
    JPanel panel1;
    JPanel panel2;
    JCheckBox eraser; // toggle "eraser mode" for DrawCanvasPanel on and off.
    JButton clearButton; // clear drawing canvas into a fresh blank sheet.
    JSlider slider;
    public OptionPanel(DrawCanvasPanel canvas){
        this.setLayout(new GridLayout(2, 1, 5, 5));
        this.setBackground(Color.red);
        
        // panel one adds jlabel for toolbar as well as th clear button in a grid layout
        panel1 = new JPanel();
        panel1.setBackground(Color.green);
        panel1.setLayout(new GridLayout(1, 2, 5, 5));
        panel1.add(new JLabel("Tool Bar: ")); // add jlabel
        clearButton = new JButton("clear"); 
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
        panel2.setLayout(new GridLayout(2, 1, 5, 5));
        panel2.setBackground(Color.green);
        eraser = new JCheckBox("eraser");
        eraser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                canvas.setEraserMode(eraser.isSelected());
            }
        });
        panel2.add(eraser); // add eraser
        slider = new JSlider(1, 20);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(5);        
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
