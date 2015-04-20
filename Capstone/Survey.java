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
import javax.swing.JScrollPane;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.awt.Graphics;

public class Survey extends JPanel implements ActionListener
{
    JButton submit_button;
    JFrame frame;
    public Survey() 
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
        
        
        JLabel question_4 = new JLabel("Fourth Question");

        JRadioButton always_4 = new JRadioButton("Always");
        JRadioButton sometimes_4 = new JRadioButton("Sometimes");
        JRadioButton seldom_4 = new JRadioButton("Seldom");
        JRadioButton never_4 = new JRadioButton("Never");

        ButtonGroup group_4 = new ButtonGroup();
        
        
        JLabel question_5 = new JLabel("Fifth Question");

        JRadioButton always_5 = new JRadioButton("Always");
        JRadioButton sometimes_5 = new JRadioButton("Sometimes");
        JRadioButton seldom_5 = new JRadioButton("Seldom");
        JRadioButton never_5 = new JRadioButton("Never");

        ButtonGroup group_5 = new ButtonGroup();
  
        
        JLabel question_6 = new JLabel("Sixth Question");

        JRadioButton always_6 = new JRadioButton("Always");
        JRadioButton sometimes_6 = new JRadioButton("Sometimes");
        JRadioButton seldom_6 = new JRadioButton("Seldom");
        JRadioButton never_6 = new JRadioButton("Never");

        ButtonGroup group_6 = new ButtonGroup();

        
        submit_button = new JButton("Submit");
        submit_button.addActionListener(this);
        
        
        
//         JScrollPane scrollBar = new JScrollPane(this,
//         JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//         JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//         frame.add(scrollBar);

        
        
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
        
        group_4.add(always_4);
        group_4.add(sometimes_4);
        group_4.add(seldom_4);
        group_4.add(never_4);
        
        group_5.add(always_5);
        group_5.add(sometimes_5);
        group_5.add(seldom_5);
        group_5.add(never_5);
        
        group_6.add(always_6);
        group_6.add(sometimes_6);
        group_6.add(seldom_6);
        group_6.add(never_6);

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
        
        this.add(question_4).setBounds(50, 490, 200, 20);

        this.add(always_4).setBounds(50, 510, 200, 20);
        this.add(sometimes_4).setBounds(50, 530, 200, 20);
        this.add(seldom_4).setBounds(50, 550, 200, 20);
        this.add(never_4).setBounds(50, 570, 200, 20);
        
        this.add(question_5).setBounds(50, 620, 200, 20);

        this.add(always_5).setBounds(50, 640, 200, 20);
        this.add(sometimes_5).setBounds(50, 660, 200, 20);
        this.add(seldom_5).setBounds(50, 680, 200, 20);
        this.add(never_5).setBounds(50, 700, 200, 20);
        
        this.add(question_6).setBounds(50, 750, 200, 20);

        this.add(always_6).setBounds(50, 770, 200, 20);
        this.add(sometimes_6).setBounds(50, 790, 200, 20);
        this.add(seldom_6).setBounds(50, 810, 200, 20);
        this.add(never_6).setBounds(50, 830, 200, 20);
        

        this.add(submit_button).setBounds(650,900,200,30);

        }

    public void actionPerformed (ActionEvent event)
    {
        
        JButton b = (JButton)event.getSource();
        if( b == submit_button )
        {
            System.out.println("yes");
        }
    }

}