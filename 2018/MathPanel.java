


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*Made By Yannai Alter*/
public class MathPanel extends JPanel implements ActionListener
{
    private int firstNum,secondNum,thirdNum;
    private JButton[][] btn;
    int success;
    public MathPanel()
    {
        success=0;
        firstNum=-1;
        secondNum=-1;
        thirdNum=-1;
        btn = new JButton[5][5];
        setLayout(new GridLayout(5,5));
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                btn[i][j] = new JButton(Integer.toString((j+1)+5*i));
                btn[i][j].addActionListener(this);
                add(btn[i][j]);
            }
        }
      
    }
    public void actionPerformed(ActionEvent x)
    {
        if(firstNum==-1)firstNum = Integer.parseInt(((JButton)x.getSource()).getText());
        else if(secondNum==-1)secondNum = Integer.parseInt(((JButton)x.getSource()).getText());
        else
        {
            thirdNum = Integer.parseInt(((JButton)x.getSource()).getText());
            if((firstNum+secondNum)==thirdNum) 
            {
                success++;
                btn[(firstNum-1)/5][(firstNum-1)%5].setText("");
                btn[(secondNum-1)/5][(secondNum-1)%5].setText("");
                btn[(thirdNum-1)/5][(thirdNum-1)%5].setText("");
                
                firstNum=-1;
                secondNum=-1;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error");
                firstNum=-1;
                secondNum=-1;
            }
        }
    }
    public static void main(String [] args)
    {
        JFrame f = new JFrame();
        MathPanel d = new MathPanel();
        f.setLayout(new GridLayout(2,1));
        f.add(d);
        f.setSize(500,500);
        JButton finish = new JButton("finish");
        finish.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent x)
            {
                JOptionPane.showMessageDialog(null,d.success);
            }
        }
        );
        f.add(finish);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}