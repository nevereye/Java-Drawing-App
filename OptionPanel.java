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
        
        panel1 = new JPanel();
        panel1.setBackground(Color.green);
        panel1.setLayout(new GridLayout(3, 1, 5, 5));
        this.add(panel1);

        panel1.add(new JLabel("Tool Bar: "));

        clearButton = new JButton("clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                canvas.clearCanvas();
            }
        });
        panel1.add(clearButton, BorderLayout.CENTER);

        eraser = new JCheckBox("eraser");
        eraser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                canvas.setEraserMode(eraser.isSelected());
            }
        });
        panel1.add(eraser);
        
        slider = new JSlider();
        canvas.setBrushSize(slider.getValue());
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e){
                canvas.setBrushSize(slider.getValue());
            }
        });
        panel1.add(slider);


        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 2, 5, 5));
        panel2.setBackground(Color.green);
        panel2.add(new JLabel("brush size"));
        panel2.add(new JButton("+"));
        panel2.add(new JLabel("brush size"));
        panel2.add(new JButton("-"));
        this.add(panel2);
    }
}
