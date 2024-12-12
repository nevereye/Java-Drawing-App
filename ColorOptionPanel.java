
// For Matthew

import java.awt.*;
import javax.swing.*;

public class ColorOptionPanel extends JPanel  {

    // instance variables:
    private DrawCanvasPanel canvas; // store object reference in here.

    // RadioButtons:
    private JRadioButton blackButton, redButton, blueButton;

    // JLabel:
    private JLabel titleLabel;

    // Constructor
    public ColorOptionPanel( DrawCanvasPanel canvas){

        // pass reference:
        this.canvas = canvas;

        // set panel background color.
        this.setBackground(Color.WHITE);

        // Layout
        this.setLayout( new GridLayout(5,1,10,10));

        // JLabel:
        titleLabel = new JLabel("Brush Colors:");

        // create buttons:
        blackButton = new JRadioButton("Black");
        redButton = new JRadioButton("Red");
        blueButton = new JRadioButton("Blue");

        // button background colors.
        blackButton.setBackground(Color.GRAY);
        redButton.setBackground(Color.red);
        blueButton.setBackground(Color.blue);

        // button font colors.
        blackButton.setForeground(Color.white);
        redButton.setForeground(Color.white);
        blueButton.setForeground(Color.white);


        // Adding components:
        this.add(titleLabel);
        // adding button:
        this.add(blackButton);
        this.add(redButton);
        this.add(blueButton);
    }
}
