// JInternalFrame Example
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Fnf{
    static Box createBox(String[] sa) {
        Box b = new Box(BoxLayout.PAGE_AXIS);
        for(int i=0;i<sa.length;++i) 
            b.add(new JLabel(sa[i]));
        return b;
    }

    public static void main(String[] args) {

        // new BackgroundImage(); 
        Box b1 = createBox(new String[]{"Chicken Fajita","Spicy Sicillian","Chicken Tikka","Chicken Supreme"});
        JInternalFrame internalFrame1 = new JInternalFrame( "PIZZA Type", true, false, false, false);
        internalFrame1.setBounds(5,5,788,200) ;              
        internalFrame1.setContentPane(b1);
        //jif1.pack();
        internalFrame1.setVisible(true);
        internalFrame1.setBackground(Color.RED);
        JPanel panel1=new JPanel();
        panel1.setBackground(Color.red);
        panel1.setForeground(Color.BLACK);
        panel1.setLayout(null);
        //panel1.setLayout(new GridLayout(1,1));
        panel1.add(internalFrame1);

        // JToolBar toolbar = new JToolBar();
        // Create a vertical toolbar

        JRadioButton r=new JRadioButton("");
        JRadioButton r1=new JRadioButton("");

        //internalFrame.add("r",SwingConstants.WEST);
        internalFrame1.add(new JRadioButton());
        internalFrame1.add(r,BorderLayout.EAST);
        internalFrame1.add(r1,BorderLayout.SOUTH);

     
      
        Box b2 = createBox(new String[]{"ICE*CREAMS","Chocolate","Mango","Straberry","Vanilla"});
        JInternalFrame internalFrame2 = new JInternalFrame( "ICE*CREAMS", true, false, false, false);
        internalFrame2.setBounds(5,210,450,200) ;       
        internalFrame2.setContentPane(b2);
        //internalFrame2.pack();
        internalFrame2.setVisible(true);
        internalFrame2.setBackground(Color.RED);
        JPanel panel2=new JPanel();
        panel2.setBackground(Color.red);
        panel2.setLayout(null);
        panel2.add(internalFrame2);

      
      
        Box b3 = createBox(new String[]{"Drinks","IceCream Shake","Strawberry","Mango",
                    "Juices","PineApple","Orange","Floats"
                ,"old_Coffee","Pina_Colado"});
        JInternalFrame internalFrame3 = new JInternalFrame( "Drinks & Deserts", true, false, false, false);
        internalFrame3.setBounds(460,210,335,200) ;       
        internalFrame3.setContentPane(b3);
        //internalFrame2.pack();
        internalFrame3.setVisible(true);
        internalFrame3.setBackground(Color.RED);
        JPanel panel3=new JPanel();
        panel3.setBackground(Color.RED);
        panel3.setLayout(null);
        panel3.add(internalFrame3);

      
      
        Box b4 = createBox(new String[]{"Sweet Corn and Chicken Soup","Mexican Tomato Bean Soup","Chicken Caesar Salad","Salad Bar"});
        JInternalFrame internalFrame4 = new JInternalFrame( "Soups & Salad", true, false, false, false);
        internalFrame4.setBounds(5,415,450,300) ;       
        internalFrame4.setContentPane(b4);
        //internalFrame2.pack();
        internalFrame4.setVisible(true);
        internalFrame4.setBackground(Color.RED);
        JPanel panel4=new JPanel();
        panel4.setBackground(Color.red);
        panel4.setLayout(null);
        panel4.add(internalFrame4);

      
      
        Box b5 = createBox(new String[]{"Chicken Wings","Spicy Wedges","BBQ Chicken Spin Rolls","Cheese Stuffers","Kebab Stuffers","Bruschetta","Flaming Wings ","Behari Chicken Spin Rolls"});
        JInternalFrame internalFrame5 = new JInternalFrame( "Starters", true, false, false, false);
        internalFrame5.setBounds(460,415,338,300) ;       
        internalFrame5.setContentPane(b5);
        //internalFrame2.pack();
        internalFrame5.setVisible(true);
        internalFrame5.setBackground(Color.RED);
        JPanel panel5=new JPanel();
        panel5.setBackground(Color.red);
        panel5.setLayout(null);
        panel5.add(internalFrame5);

      
      
        JPanel panel=new JPanel();
        panel.setBackground(Color.red);
        panel.setLayout(null);
        panel.add(internalFrame1);
        panel.add(internalFrame2);
        panel.add(internalFrame3);
        panel.add(internalFrame4);
        panel.add(internalFrame5);
        panel.add(r);
        // panel.add(internalFrame);
        // panel.add(field6);

      
      
        JDesktopPane dtp = new JDesktopPane();
        dtp.setBackground(Color.LIGHT_GRAY);
        dtp.add(internalFrame1);
        dtp.add(internalFrame2);
        dtp.add(internalFrame3);
        dtp.add(internalFrame4);
        dtp.add(internalFrame5);
        //dtp.add(r);
        JFrame f = new JFrame("DesktopPane");
        //JPanel p=new JPanel();
        //p.getContentpane().add(dtp);
        f.getContentPane().add(dtp);
        f.setSize(1200,900);
        // f.setLocation(250,100);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

      
      
      
    }

}