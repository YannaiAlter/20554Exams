import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class Element here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Element extends JPanel
{
    private boolean isWhite;
    int width=0,height=0;
    public Element(int width,int height)
    {
        addMouseListener(new MouseHandler());
        isWhite=true;
        setSize(width,height);
        this.height = height;
        this.width = width;
    }
       public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(isWhite)
        g.setColor(Color.WHITE);
        else 
        g.setColor(Color.BLACK);
        g.fillRect(0,0,1000,1000);
        
        isWhite=!isWhite;
    }
    class MouseHandler extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            
            repaint();
        }
    }
}
