import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;


public class RadioButton  extends JFrame
{
    public RadioButton()
    {   
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
        
        group_1.add(always_1);
        group_1.add(sometimes_1);
        group_1.add(seldom_1);
        group_1.add(never_1);
        
        group_2.add(always_2);
        group_2.add(sometimes_2);
        group_2.add(seldom_2);
        group_2.add(never_2);

        this.setSize(1000,1000);
        this.setLayout(new GridLayout(10,10));
        
        this.add(title);
        
        this.add(question_1);
        
        this.add(always_1);
        this.add(sometimes_1);
        this.add(seldom_1);
        this.add(never_1);
        
        this.add(question_2);
        
        this.add(always_2);
        this.add(sometimes_2);
        this.add(seldom_2);
        this.add(never_2);
        
        //this.setHgap(2);
        
        this.setVisible(true);

    }
    public static void main(String args[]){
        RadioButton button = new RadioButton();
    }
}