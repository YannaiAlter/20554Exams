import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener
{
    private JTextField name;
    private JTextField id;
    private JButton sbmt;
    private JComboBox type;
    private String names[]={"Telephone","Stereo","Food","ETC"};
    public GUI()
    {
        setLayout(new GridLayout(4,1));
        name = new JTextField();
        id = new JTextField();
        sbmt = new JButton("Submit");
        type = new JComboBox(names);
        add(name);
        add(id);
        add(type);
        add(sbmt);
        setSize(500,500);
        setVisible(true);
        sbmt.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent x)
    {
        Invitation invite = new Invitation(name.getText(),id.getText(),type.getSelectedItem().toString());
        System.out.println(invite);
        //... needs to be continued
    }
    public static void main(String [] args)
    {
        GUI A = new GUI();
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
