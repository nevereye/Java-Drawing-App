import javax.swing.*;
import java.awt.*;

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
        
        // add side bar
        sidebar = new SideBar(canvas);
        this.add(sidebar, BorderLayout.WEST);
        
        // set Jframe visible AFTER adding all components, or it may not render.
        this.setVisible(true);

    }
}
