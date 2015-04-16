import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

public class MainClass extends JPanel {

  public MainClass() {
    //JRadioButton radMarriedYes = new JRadioButton("Yes?", true);
    //JRadioButton radMarriedNo = new JRadioButton("No?", false);
    //JRadioButton radGolfYes = new JRadioButton("Yes?", false);
    //JRadioButton radGolfNo = new JRadioButton("No?", true);

    //ButtonGroup radioGroup1 = new ButtonGroup();
    //ButtonGroup radioGroup2 = new ButtonGroup();

    setLayout(null);

    //add(radMarriedYes);
    //add(radMarriedNo);
    //add(radGolfYes);
    //add(radGolfNo);

    //radioGroup1.add(radMarriedYes);
    //radioGroup1.add(radMarriedNo);
    //radioGroup2.add(radGolfYes);
    //radioGroup2.add(radGolfNo);

    //radMarriedYes.setBounds(30, 50, 50, 20);
    //radMarriedNo.setBounds(30, 280, 50, 20);

    //radGolfYes.setBounds(150, 50, 50, 20);
    //radGolfNo.setBounds(150, 80, 50, 20);
    

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
    


  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new MainClass());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 1000);
    frame.setVisible(true);
  }
}