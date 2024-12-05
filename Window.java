import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private DrawCanvasPanel canvas;
    private Toolbar toolbar;

    public Window(String title, int width, int height, boolean resizable){
        this.setTitle(title);
        this.setSize(width, height);
        this.setResizable(resizable);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add components here
        canvas = new DrawCanvasPanel();
        this.add(canvas, BorderLayout.CENTER);

        toolbar = new Toolbar();
        this.add(toolbar, BorderLayout.WEST);

        // set Jframe visible AFTER adding all components, or it may not render.
        this.setVisible(true);

    }
}
