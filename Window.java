import javax.swing.*;
import java.awt.*;

/*
*	CSCI 185 M01
*	Fall 2024
*
*	M10: Final Programming Project
*	Student Team Names: Christopher Rodriguez, Jack Lin, Matthew Pietrzak
*	Professor Name: Wenjia Li
*	Date: DEC. 12, 2024
*	Version: 2.0
*	
*	Class Name: Window
*	Class’s Main Contributor: Jack Lin
*/


public class Window extends JFrame{
    private DrawCanvasPanel canvas;
    private SideBar sidebar;

    // mouseListener and mouseMotionListener class
    private DrawListener drawControls;

    public Window(String title, int width, int height, boolean resizable){
        this.setTitle(title);
        this.setSize(width, height);
        this.setResizable(resizable);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create canvas panel.
        canvas = new DrawCanvasPanel();
        // create mouseListener object, controls for drawing with mouse cursor.
        // takes reference to canvas so it can command it:
        drawControls = new DrawListener(canvas);

        // adding drawControls as Listener for Mouse Events. (MouseListener + MouseMotionListener)
            canvas.addMouseListener(drawControls);
            canvas.addMouseMotionListener(drawControls); 

        // adding canvas to JFrame.
        this.add(canvas, BorderLayout.CENTER);
        
        // constructor and add side bar
        sidebar = new SideBar( canvas); // pass reference of canvas object into constructor.
        this.add(sidebar, BorderLayout.WEST);
        
        // set Jframe visible AFTER adding all components, or it may not render.
        this.setVisible(true);
        
    }
}
