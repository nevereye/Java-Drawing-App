import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private DrawCanvasPanel canvas;
    private JPanel toolbar;

    private JPanel optionPanel;
    private JPanel colorPanel;

    // mouseListener and mouseMotionListener class
    private DrawListener drawControls;

    public Window(String title, int width, int height, boolean resizable){
        this.setTitle(title);
        this.setSize(width, height);
        this.setResizable(resizable);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create mouseListener object, controls for drawing with mouse cursor.
        drawControls = new DrawListener();

        // add components here
        canvas = new DrawCanvasPanel();
        // adding drawControls as Listener for Mouse Events. (MouseListener + MouseMotionListener)
            canvas.addMouseListener(drawControls);
            canvas.addMouseMotionListener(drawControls); 
        this.add(canvas, BorderLayout.CENTER);

        toolbar = new JPanel();

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.blue);
        colorPanel.add(new Button("test"), BorderLayout.CENTER);

        optionPanel = new JPanel();
        optionPanel.setBackground(Color.red);
        optionPanel.add(new Button("test"), BorderLayout.CENTER);


        toolbar.add(colorPanel, BorderLayout.NORTH);
        toolbar.add(optionPanel, BorderLayout.SOUTH);
        this.add(toolbar, BorderLayout.WEST);

        // set Jframe visible AFTER adding all components, or it may not render.
        this.setVisible(true);

    }
}
