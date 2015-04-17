import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.awt.Graphics;

public class MainClass extends JPanel implements ActionListener
{
    JButton submit_button;
    JFrame frame;
    
    public MainClass() 
    {
        setLayout(null);

        JLabel title = new JLabel("Survey Title");

        JLabel question_1 = new JLabel("First Question");

        JRadioButton always_1 = new JRadioButton("Always");
        JRadioButton sometimes_1 = new JRadioButton("Sometimes");
        JRadioButton seldom_1 = new JRadioButton("Seldom");
        JRadioButton never_1 = new JRadioButton("Never");

        ButtonGroup group_1 = new ButtonGroup();

        JLabel question_2 = new JLabel("Second Question");

        JRadioButton always_2 = new JRadioButton("Always");
        JRadioButton sometimes_2 = new JRadioButton("Sometimes");
        JRadioButton seldom_2 = new JRadioButton("Seldom");
        JRadioButton never_2 = new JRadioButton("Never");

        ButtonGroup group_2 = new ButtonGroup();
        
        JLabel question_3 = new JLabel("Second Question");

        JRadioButton always_3 = new JRadioButton("Always");
        JRadioButton sometimes_3 = new JRadioButton("Sometimes");
        JRadioButton seldom_3 = new JRadioButton("Seldom");
        JRadioButton never_3 = new JRadioButton("Never");

        ButtonGroup group_3 = new ButtonGroup();
        
        JButton submit_button = new JButton("Submit");
        submit_button.addActionListener(this);

        group_1.add(always_1);
        group_1.add(sometimes_1);
        group_1.add(seldom_1);
        group_1.add(never_1);

        group_2.add(always_2);
        group_2.add(sometimes_2);
        group_2.add(seldom_2);
        group_2.add(never_2);
        
        group_3.add(always_3);
        group_3.add(sometimes_3);
        group_3.add(seldom_3);
        group_3.add(never_3);
        
        

        this.add(title).setBounds(50, 50, 200, 20);

        this.add(question_1).setBounds(50, 100, 200, 20);

        this.add(always_1).setBounds(50, 120, 200, 20);
        this.add(sometimes_1).setBounds(50, 140, 200, 20);
        this.add(seldom_1).setBounds(50, 160, 200, 20);
        this.add(never_1).setBounds(50, 180, 200, 20); 

        this.add(question_2).setBounds(50, 230, 200, 20);

        this.add(always_2).setBounds(50, 250, 200, 20);
        this.add(sometimes_2).setBounds(50, 270, 200, 20);
        this.add(seldom_2).setBounds(50, 290, 200, 20);
        this.add(never_2).setBounds(50, 310, 200, 20);
        
        this.add(question_3).setBounds(50, 360, 200, 20);

        this.add(always_3).setBounds(50, 380, 200, 20);
        this.add(sometimes_3).setBounds(50, 400, 200, 20);
        this.add(seldom_3).setBounds(50, 420, 200, 20);
        this.add(never_3).setBounds(50, 440, 200, 20);
        
        this.add(submit_button).setBounds(300,550,200,30);
    }
    
    public void actionPerformed (ActionEvent event)
    {
        JButton b = (JButton)event.getSource();
        if( b.equals(submit_button) )
            {
                submit_button.setBackground(Color.RED);
            }
    }
       

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new MainClass());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}