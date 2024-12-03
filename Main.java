import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    private Listener mouse;
    public Main(){
        this.setTitle("mspaint2");
        this.setSize(1600, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mouse = new Listener();
        this.addMouseListener(mouse);

        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        System.out.println(mouse.isMousePressed());
        repaint();
    }

    public static void main(String[] args) {
        new Main();
    }
}
