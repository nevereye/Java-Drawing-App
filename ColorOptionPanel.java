
// For Matthew

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorOptionPanel extends JPanel  {

    // instance variables:
    private DrawCanvasPanel canvas; // store object reference in here.

    // RadioButtons:
    private JRadioButton blackButton, redButton, blueButton, greenButton, yellowButton, orangeButton, purpleButton;

    // JLabel:
    private JLabel titleLabel;

    // Button Group:
    private ButtonGroup Group;

    // Constructor
    public ColorOptionPanel( DrawCanvasPanel canvas){

        // pass reference:
        this.canvas = canvas;

        // set panel background color.
        this.setBackground(Color.WHITE);

        // Layout
        this.setLayout(new GridLayout(5,1,10,10));

        // JLabel:
        titleLabel = new JLabel("Brush Colors:");

        // create buttons:
        blackButton = new JRadioButton("Black");
        redButton = new JRadioButton("Red");
        blueButton = new JRadioButton("Blue");
        greenButton = new JRadioButton("Green");
        yellowButton = new JRadioButton("Yellow");
        orangeButton = new JRadioButton("Orange");
        purpleButton = new JRadioButton("Purple");

        // create group:
        Group = new ButtonGroup();

        // button background colors.
        blackButton.setBackground(Color.GRAY);
        redButton.setBackground(Color.red);
        blueButton.setBackground(Color.blue);
        greenButton.setBackground(Color.green);
        yellowButton.setBackground(Color.yellow);
        orangeButton.setBackground(Color.orange);
        purpleButton.setBackground(Color.magenta);

        // button font colors.
        blackButton.setForeground(Color.white);
        redButton.setForeground(Color.white);
        blueButton.setForeground(Color.white);
        greenButton.setForeground(Color.white);
        yellowButton.setForeground(Color.white);
        orangeButton.setForeground(Color.white);
        purpleButton.setForeground(Color.white);

        // Adding buttons in group
        Group.add(blackButton);
        Group.add(redButton);
        Group.add(blueButton);
        Group.add(greenButton);
        Group.add(yellowButton);
        Group.add(orangeButton);
        Group.add(purpleButton);

        // Action Listeners
        blackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	canvas.setBrushColor(Color.black);
            }
        }); 

        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	canvas.setBrushColor(Color.red);
            }
        }); 

        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	canvas.setBrushColor(Color.blue);
            }
        }); 

        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	canvas.setBrushColor(Color.green);
            }
        }); 

        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	canvas.setBrushColor(Color.yellow);
            }
        }); 

        orangeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	canvas.setBrushColor(Color.orange);
            }
        }); 

        purpleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	canvas.setBrushColor(Color.magenta);
            }
        }); 

        // Adding components:
        this.add(titleLabel);

        // adding button:
        this.add(blackButton);
        this.add(redButton);
        this.add(blueButton);
        this.add(greenButton);
        this.add(yellowButton);
        this.add(orangeButton);
        this.add(purpleButton);

    }
}
