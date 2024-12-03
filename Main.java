import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public Main(){
        this.setTitle("mspaint2");
        this.setSize(1600, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JPanel panel = new JPanel();
        add(panel);
    }

    @Override
    public void paint(Graphics g){
        g.drawOval(0, 0, 100, 100);
    }
    public static void main(String[] args) {
        new Main();
    }
}
