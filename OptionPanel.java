import javax.swing.*;
import java.awt.*;

public class OptionPanel extends JPanel{

    public OptionPanel(){
        this.setLayout(new GridLayout(5, 1, 5, 5));
        this.setBackground(Color.red);
        this.add(new JButton("test"), BorderLayout.CENTER);
        this.add(new JButton("test"), BorderLayout.CENTER);
    }
}
