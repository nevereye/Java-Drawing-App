import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public Main(){
        this.setTitle("mspaint2");
        this.setSize(1600, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        add(panel);

        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        for(int i = 0; i < 100; i++){
            g.drawLine(0, 0, i, i);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
