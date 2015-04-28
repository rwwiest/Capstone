import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
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
import java.util.ArrayList;


public class Survey extends JPanel implements ActionListener
{
    JButton submit_button;
    JFrame frame;
    JTextField name_input;
    ArrayList <JRadioButton> passive_buttons = new ArrayList<JRadioButton>();
    ArrayList <JRadioButton> aggressive_buttons = new ArrayList <JRadioButton>();
    ArrayList <JRadioButton> assertive_buttons = new ArrayList<JRadioButton>();
    int passive;
    int aggressive;
    int assertive;
    JRadioButton assertive_6;
    public Survey() 
    {
        setLayout(null);

        JLabel title = new JLabel("Personality Quiz");

        JLabel question_1 = new JLabel("1. You are in a restaurant and order a steak medium-rare, but it is served to you well done.  You would:");
        JRadioButton passive_1 = new JRadioButton("a) Accept it since you sort of like it well done anyway.");
        JRadioButton aggressive_1 = new JRadioButton("b) Angrily refuse the steak and insist on seeing the manager to complain about the poor service.");
        JRadioButton assertive_1 = new JRadioButton("c) Call the waiter and indicate you ordered your steak medium-rare, then turn it back.");
        
        passive_buttons.add(passive_1);
        aggressive_buttons.add(aggressive_1);
        assertive_buttons.add(assertive_1);

        ButtonGroup group_1 = new ButtonGroup();
        group_1.add(passive_1);
        group_1.add(aggressive_1);
        group_1.add(assertive_1);

        JLabel question_2 = new JLabel("2. You are a customer waiting in line to be served.  Suddenly, someone steps in line ahead of you.  You would:");
        JRadioButton passive_2 = new JRadioButton("a) Let the person be ahead of you since he/she is already in line.");
        JRadioButton aggressive_2 = new JRadioButton("b) Pull the person out of line and make him/her go to the back.");
        JRadioButton assertive_2 = new JRadioButton("c) Indicate to the person that you are in line and point out where it begins.");
        passive_buttons.add(passive_2);
        aggressive_buttons.add(aggressive_2);
        assertive_buttons.add(assertive_2);
        
        ButtonGroup group_2 = new ButtonGroup();
        group_2.add(passive_2);
        group_2.add(aggressive_2);
        group_2.add(assertive_2);

        JLabel question_3 = new JLabel("3. After walking out of a store where you purchased some items you discover you were short-changed.  You would:");
        JRadioButton passive_3 = new JRadioButton("a) Let it go since you are already out of the store and have no proof you were short-changed.");
        JRadioButton aggressive_3 = new JRadioButton("b) Go to the manager and indicate how you were cheated by the clerk, then demand the proper change.");
        JRadioButton assertive_3 = new JRadioButton("c) Return to the clerk and inform him/her of the error.");
        
        passive_buttons.add(passive_3);
        aggressive_buttons.add(aggressive_3);
        assertive_buttons.add(assertive_3);
        
        ButtonGroup group_3 = new ButtonGroup();
        group_3.add(passive_3);
        group_3.add(aggressive_3);
        group_3.add(assertive_3);

        JLabel question_4 = new JLabel("4. You are in the middle of watching a very interesting television program when your spouse comes in and asks you for a favor.  You would:");
        JRadioButton passive_4 = new JRadioButton("a) Do the favor as quickly as possible, then return to the program to finish watching it.");
        JRadioButton aggressive_4 = new JRadioButton("b) Say 'no,' then finish watching your program.");
        JRadioButton assertive_4 = new JRadioButton("c) Ask if it can wait until the program is over and, if so, do it then.");
        
        passive_buttons.add(passive_4);
        aggressive_buttons.add(aggressive_4);
        assertive_buttons.add(assertive_4);
        
        ButtonGroup group_4 = new ButtonGroup();
        group_4.add(passive_4);
        group_4.add(aggressive_4);
        group_4.add(assertive_4);

        JLabel question_5 = new JLabel("5. A friend drops in to say hello, but stays too long, preventing you from finishing an important work project.  You would:");
        JRadioButton passive_5 = new JRadioButton("a) Let the person stay, then finish your work another time.");
        JRadioButton aggressive_5 = new JRadioButton("b) Tell the person to stop bothering you and to get out.");
        JRadioButton assertive_5 = new JRadioButton("c) Explain your need to finish your work and request he/she visit another time.");
        
        passive_buttons.add(passive_5);
        aggressive_buttons.add(aggressive_5);
        assertive_buttons.add(assertive_5);
        
        ButtonGroup group_5 = new ButtonGroup();
        group_5.add(passive_5);
        group_5.add(aggressive_5);
        group_5.add(assertive_5);

        JLabel question_6 = new JLabel("6. You ask a gas station attendant for five dollars worth of gas.  However, he fills up your tank by mistake and asks for twelve dollars.  You would:");
        JRadioButton passive_6 = new JRadioButton("a) Pay the twelve dollars since the gas is already in your tank and you will eventually need it anyway.");
        JRadioButton aggressive_6 = new JRadioButton("b) Demand to see the manager and protest being ripped off.");
        assertive_6 = new JRadioButton("c) Indicate you only requested five dollars worth of gas and give him only five dollars.");
        
        passive_buttons.add(passive_6);
        aggressive_buttons.add(aggressive_6);
        assertive_buttons.add(assertive_6);
        
        ButtonGroup group_6 = new ButtonGroup();
        group_6.add(passive_6);
        group_6.add(aggressive_6);
        group_6.add(assertive_6);
        
        submit_button = new JButton("Submit");         
        submit_button.addActionListener(this);
        
        JLabel name_label = new JLabel("Name:");         
        name_input = new JTextField("");    
        
        this.add(title).setBounds(50, 50, 201, 20);          
        this.add(name_label).setBounds(360,50,49,20);         
        this.add(name_input).setBounds(400,50,60,20);
        
        this.add(question_1).setBounds(50,100,816,20);
        
        this.add(passive_1).setBounds(50, 120, 600, 20);
        this.add(aggressive_1).setBounds(50, 140, 700, 20);
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
        

        this.add(submit_button).setBounds(750,900,200,30); 
    }

    public void actionPerformed (ActionEvent event)
    {

        JButton b = (JButton)event.getSource();
        String personality = "";
        int total=0;
        if (assertive_6.isSelected())
        {
            System.out.println("PRESSED");
        }
        if( b == submit_button )
        {
            for(int i= 0; i< passive_buttons.size()-1 ;i++)
            {
                   if(passive_buttons.get(i).isSelected())
                   {
                       passive++;
                       total ++;
                       System.out.println(total);
                   }
            }
            for(int i= 0; i< aggressive_buttons.size()-1 ;i++)
            {
                   if(aggressive_buttons.get(i).isSelected())
                   {
                       aggressive++;
                       total ++;
                       System.out.println(total);
                   }
            }
            for(int i= 0; i< assertive_buttons.size()-1 ;i++)
            {
                   if(assertive_buttons.get(i).isSelected())
                   {
                       assertive++;
                       total ++;
                       System.out.println(total);
                   }
            }
            System.out.println(passive_buttons.size() + " " + aggressive_buttons.size() + " " + assertive_buttons.size());
            if (!(passive + assertive + aggressive == 5))
            {
                personality = "make sure you answered ALL 6 questions. It seems that you may have \nmissed one. PLEASE ANSWER ALL THEN RE-SUBMIT.";
            }
            else if (passive>3) //|| (aggressive == 1 && assertive == 1))
            {
                personality = "you are a very passive person! This means you are very calm and composed in situations \nwhich is good but maybe you should asking for more things that you want done. Stick \nup for yourself!";
            }
            else if (aggressive>3)// || (passive == 1 && assertive == 1))
            {
                personality = "you are a very aggressive person! This means you are very confident \nand demanding in situations which can be good but maybe you should try being more \ncalm. People appreciate a much kinder approach although being aggressive is \nvery effective!";
            }
            else if (assertive>3)// || (aggressive == 1 && passive == 1))
            {
                personality = "you are a very assertive person! This is a very good quality to have. \nBeing assertive is the right mix between obtaining what you want but \nin a polite manner. Continue the great \npersonality habits! ";
            }
            else if (passive>1 && aggressive >1) //&& assertive <2)
            {
                personality = "you are sometimes passive and sometimes aggressive in situations. \nAlthough these two qualities are polar oppisites, it is important to know when to be \nserious and when to be calm. You should strive to be more assertive because that is \na very important trait."; 
            }
            else if (aggressive>1 && assertive >1)// && passive <2)
            {
                personality = "you are sometimes assertive and sometimes aggressive in situations. \nThis shows that you know how to get what you want whethere it is effectively\n or with brute force. Try not to forget to be nicer every once in \nawhile to keep others happy."; 
            }
            else 
            {
                personality = "you are sometimes passive and sometimes assertive in situations. \nThese are two good traits because you can show patience when necessary but you also know \nhow to effectively get things done. Do not be afraid to upset another person every once in awhile \nin order to get what you need."; 
            }
            JTextArea response = new JTextArea(name_input.getText() + " " + personality, 225,100);
            this.add(response).setBounds(650,80,550,70);
            response.setEditable(false);
            passive = 0;
            aggressive = 0;
            assertive = 0;
        }
        
        
    }
}