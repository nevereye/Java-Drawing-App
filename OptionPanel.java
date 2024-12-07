import javax.swing.*;
import java.awt.*;

public class OptionPanel extends JPanel{
    JButton button;
    public OptionPanel(){
        this.setLayout(new GridLayout(5, 1, 5, 5));
        this.setBackground(Color.red);

        button = new JButton("test");
        button.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 50, Color.red));
        this.add(button);
    }
}
