import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
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
    JTextField name_input;
    JRadioButton passive_1;
    int passive;
    int aggressive;
    int assertive;
    ButtonGroup group_1;
    ButtonGroup group_2;
    ButtonGroup group_3;
    ButtonGroup group_4;
    ButtonGroup group_5;
    ButtonGroup group_6;
    
    public Survey() 
    {
        setLayout(null);

        JLabel title = new JLabel("Personality Quiz");

        JLabel question_1 = new JLabel("1. You are in a restaurant and order a steak medium-rare, but it is served to you well done.  You would:");
        passive_1 = new JRadioButton("a) Accept it since you sort of like it well done anyway.");
        JRadioButton aggressive_1 = new JRadioButton("b) Angrily refuse the steak and insist on seeing the manager to complain about the poor service.");
        JRadioButton assertive_1 = new JRadioButton("c) Call the waiter and indicate you ordered your steak medium-rare, then turn it back.");

        group_1 = new ButtonGroup();

        JLabel question_2 = new JLabel("2. You are a customer waiting in line to be served.  Suddenly, someone steps in line ahead of you.  You would:");
        JRadioButton passive_2 = new JRadioButton("a) Let the person be ahead of you since he/she is already in line.");
        JRadioButton aggressive_2 = new JRadioButton("b) Pull the person out of line and make him/her go to the back.");
        JRadioButton assertive_2 = new JRadioButton("c) Indicate to the person that you are in line and point out where it begins.");
        
        group_2 = new ButtonGroup();

        JLabel question_3 = new JLabel("3. After walking out of a store where you purchased some items you discover you were short-changed.  You would:");
        JRadioButton passive_3 = new JRadioButton("a) Let it go since you are already out of the store and have no proof you were short-changed.");
        JRadioButton aggressive_3 = new JRadioButton("b) Go to the manager and indicate how you were cheated by the clerk, then demand the proper change.");
        JRadioButton assertive_3 = new JRadioButton("c) Return to the clerk and inform him/her of the error.");

        group_3 = new ButtonGroup();

        JLabel question_4 = new JLabel("4. You are in the middle of watching a very interesting television program when your spouse comes in and asks you for a favor.  You would:");
        JRadioButton passive_4 = new JRadioButton("a) Do the favor as quickly as possible, then return to the program to finish watching it.");
        JRadioButton aggressive_4 = new JRadioButton("b) Say 'no,' then finish watching your program.");
        JRadioButton assertive_4 = new JRadioButton("c) Ask if it can wait until the program is over and, if so, do it then.");

        group_4 = new ButtonGroup();

        JLabel question_5 = new JLabel("5. A friend drops in to say hello, but stays too long, preventing you from finishing an important work project.  You would:");
        JRadioButton passive_5 = new JRadioButton("a) Let the person stay, then finish your work another time.");
        JRadioButton aggressive_5 = new JRadioButton("b) Tell the person to stop bothering you and to get out.");
        JRadioButton assertive_5 = new JRadioButton("c) Explain your need to finish your work and request he/she visit another time.");

        group_5 = new ButtonGroup();

        JLabel question_6 = new JLabel("6. You ask a gas station attendant for five dollars worth of gas.  However, he fills up your tank by mistake and asks for twelve dollars.  You would:");
        JRadioButton passive_6 = new JRadioButton("a) Pay the twelve dollars since the gas is already in your tank and you will eventually need it anyway.");
        JRadioButton aggressive_6 = new JRadioButton("b) Demand to see the manager and protest being ripped off.");
        JRadioButton assertive_6 = new JRadioButton("c) Indicate you only requested five dollars worth of gas and give him only five dollars.");

        group_6 = new ButtonGroup();

        submit_button = new JButton("Submit");
        submit_button.addActionListener(this);

        JLabel name_label = new JLabel("Name:");
        name_input = new JTextField("");

        group_1.add(passive_1);
        group_1.add(aggressive_1);
        group_1.add(assertive_1);

        group_2.add(passive_2);
        group_2.add(aggressive_2);
        group_2.add(assertive_2);

        group_3.add(passive_3);
        group_3.add(aggressive_3);
        group_3.add(assertive_3);

        group_4.add(passive_4);
        group_4.add(aggressive_4);
        group_4.add(assertive_4);

        group_5.add(passive_5);
        group_5.add(aggressive_5);
        group_5.add(assertive_5);

        group_6.add(passive_6);
        group_6.add(aggressive_6);
        group_6.add(assertive_6);

        this.add(title).setBounds(50, 50, 201, 20);

        this.add(name_label).setBounds(360,50,49,20);
        this.add(name_input).setBounds(400,50,60,20);

        this.add(question_1).setBounds(50, 100, 816, 20);
        this.add(passive_1).setBounds(50, 120, 816, 20);
        this.add(aggressive_1).setBounds(50, 140, 816, 20);
        this.add(assertive_1).setBounds(50, 160, 816, 20);

        this.add(question_2).setBounds(50, 230, 816, 20);

        this.add(passive_2).setBounds(50, 250, 816, 20);
        this.add(aggressive_2).setBounds(50, 270, 816, 20);
        this.add(assertive_2).setBounds(50, 290, 816, 20);

        this.add(question_3).setBounds(50, 360, 816, 20);

        this.add(passive_3).setBounds(50, 380, 816, 20);
        this.add(aggressive_3).setBounds(50, 400, 816, 20);
        this.add(assertive_3).setBounds(50, 420, 816, 20);

        this.add(question_4).setBounds(50, 490, 816, 20);

        this.add(passive_4).setBounds(50, 510, 816, 20);
        this.add(aggressive_4).setBounds(50, 530, 816, 20);
        this.add(assertive_4).setBounds(50, 550, 816, 20);

        this.add(question_5).setBounds(50, 620, 816, 20);

        this.add(passive_5).setBounds(50, 640, 816, 20);
        this.add(aggressive_5).setBounds(50, 660, 816, 20);
        this.add(assertive_5).setBounds(50, 680, 816, 20);

        this.add(question_6).setBounds(50, 750, 816, 20);

        this.add(passive_6).setBounds(50, 770, 816, 20);
        this.add(aggressive_6).setBounds(50, 790,816 , 20);
        this.add(assertive_6).setBounds(50, 810, 816, 20);

        this.add(submit_button).setBounds(650,900,200,30);
    }

    public void actionPerformed (ActionEvent event)
    {

        JButton b = (JButton)event.getSource();
        //ButtonGroup big_group[] = new ButtonGroup[group_1,group_2,group_3,group_4,group_5,group_6];
        if( b == submit_button )
        {
            System.out.println("yes");
//             for(int i= 0; i< big_group.length-1;i++)
//             {
//                 for (int j=0; j < big_group[i].length-1; j++)
//                 {
//                    if(g.isSelected())
//                    {
//                        //RIGHT HEREEEEEEEEEEEEEEEEE CONTINUE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//                    }
//                 }
//             }
            
//             JTextField response = new JTextField(name_input.getText() + " you are very " + personality, 20);
//             this.add(response).setBounds(850,100,500,40);
//             response.setEditable(false);
        }
        
        
    }
}