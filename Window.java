import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    private DrawCanvasPanel canvas;

    public Window(String title, int width, int height, boolean resizable){
        this.setTitle(title);
        this.setSize(width, height);
        this.setResizable(resizable);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // add components here
        canvas = new DrawCanvasPanel();
        this.add(canvas, BorderLayout.CENTER);
    }
}
