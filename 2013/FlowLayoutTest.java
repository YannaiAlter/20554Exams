import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class FlowLayoutTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlowLayoutTest extends JFrame
{
    // instance variables - replace the example below with your own
    public FlowLayoutTest()
    {
        JButton x = new JButton("ok");
        JTextField y = new JTextField(10);
        setLayout(new FlowLayout());
        add(y);
        add(x);
        setSize(300,300);
        setVisible(true);
        
        
    }
    public static void main(String[]args){
        FlowLayoutTest s = new FlowLayoutTest();
    }
}
