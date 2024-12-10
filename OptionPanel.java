import javax.swing.*;
import java.awt.*;

public class OptionPanel extends JPanel{
    JPanel panel1;
    JPanel panel2;
    JCheckBox eraser; // toggle "eraser mode" for DrawCanvasPanel on and off.
    JButton clearButton; // clear drawing canvas into a fresh blank sheet.

    DrawCanvasPanel canvas; // call methods on and operate on DrawCanvasPanel Object.

    public OptionPanel(DrawCanvasPanel canvas){

        // store reference to DrawCanvasPanel object.
        this.canvas = canvas;
        
        this.setLayout(new GridLayout(2, 1, 5, 5));
        this.setBackground(Color.red);
        
        panel1 = new JPanel();
        panel1.setBackground(Color.green);
        panel1.setLayout(new GridLayout(1, 1, 5, 5));
        clearButton = new JButton("clear");
        panel1.add(clearButton, BorderLayout.CENTER);
        this.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 2, 5, 5));
        panel2.setBackground(Color.green);
        panel2.add(new JLabel("eraser"));
        eraser = new JCheckBox();
        panel2.add(eraser);
        panel2.add(new JLabel("brush size"));
        panel2.add(new JButton("+"));
        panel2.add(new JLabel("brush size"));
        panel2.add(new JButton("-"));
        this.add(panel2);
    }
}
