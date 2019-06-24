import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class MyFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyFrame extends JFrame
{
    private Element[][] e;
    public MyFrame(int x,int y)
    {
        super("title");
        setSize(500,500);
        setLayout(new GridLayout(x,y));
        e = new Element[x][y];
        for(int i=0; i<x;i++)
            for(int j=0;j<y;j++){
            e[i][j]=new Element(500/x,500/y);
            add(e[i][j]);
        }
        setVisible(true);
    }
 
    public static void main(String []args)
    {
        MyFrame f = new MyFrame(5,5);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
