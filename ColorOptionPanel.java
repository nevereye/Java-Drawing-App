// AWT & Swing Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorOptionPanel extends JPanel  {

    // Instance Variables:
    private DrawCanvasPanel canvas;                                     // Store object reference in here
    private JRadioButton                                                // JRadioButtons
        blackButton, redButton, blueButton,  greenButton, yellowButton, orangeButton, purpleButton, lGrayButton, dGrayButton;    
    private JLabel titleLabel;                                          // JLabel
    private ButtonGroup Group;                                          // Button Group

    // Constructor:
    public ColorOptionPanel( DrawCanvasPanel canvas){

        // Canvas Set-Up:
        this.canvas = canvas;                                           // Pass reference 
        this.setBackground(Color.WHITE);                                // Set panel background color
        this.setLayout(new GridLayout(5,1,10,10));  // Layout

        // Section 1 - Title:
        titleLabel = new JLabel("Brush Colors:");


        // Section 2 - JRadioButtons (Color Picker):
        // Create buttons
        blackButton = new JRadioButton("Black");
        redButton = new JRadioButton("Red");
        blueButton = new JRadioButton("Blue");
        greenButton = new JRadioButton("Green");
        yellowButton = new JRadioButton("Yellow");
        orangeButton = new JRadioButton("Orange");
        purpleButton = new JRadioButton("Purple");
        lGrayButton = new JRadioButton("L. Gray");
        dGrayButton = new JRadioButton("D. Gray");

        // Create group & add JRadioButtons to group
        Group = new ButtonGroup();
        Group.add(blackButton);
        Group.add(redButton);
        Group.add(blueButton);
        Group.add(greenButton);
        Group.add(yellowButton);
        Group.add(orangeButton);
        Group.add(purpleButton);
        Group.add(lGrayButton);
        Group.add(dGrayButton);

        // Background Colors for JRadioButtons
        blackButton.setBackground(Color.black);
        redButton.setBackground(Color.red);
        blueButton.setBackground(Color.blue);
        greenButton.setBackground(Color.green);
        yellowButton.setBackground(Color.yellow);
        orangeButton.setBackground(Color.orange);
        purpleButton.setBackground(Color.magenta);
        lGrayButton.setBackground(Color.lightGray);
        dGrayButton.setBackground(Color.darkGray);

        // Font Colors for JRadioButtons
        blackButton.setForeground(Color.white);
        redButton.setForeground(Color.white);
        blueButton.setForeground(Color.white);
        greenButton.setForeground(Color.white);
        yellowButton.setForeground(Color.white);
        orangeButton.setForeground(Color.white);
        purpleButton.setForeground(Color.white);
        lGrayButton.setForeground(Color.white);
        dGrayButton.setForeground(Color.white);


        // Section 3 - ActionListeners for Buttons:
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

        lGrayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	canvas.setBrushColor(Color.lightGray);
            }
        }); 

        dGrayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	canvas.setBrushColor(Color.darkGray);
            }
        }); 

        // Section 4 - Adding components to JPanel:
        this.add(titleLabel);
        this.add(blackButton);
        this.add(redButton);
        this.add(orangeButton);
        this.add(yellowButton);
        this.add(greenButton);
        this.add(blueButton);
        this.add(purpleButton);
        this.add(lGrayButton);
        this.add(dGrayButton);
    }
}
