import javax.swing.JFrame;
import java.awt.Graphics;

public class Main extends JFrame{
    public Main(){
        setTitle("mspaint2");
        setSize(1600, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        g.drawOval(0, 0, 100, 100);
    }
    public static void main(String[] args) {
        new Main();
    }
}
