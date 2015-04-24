import javax.swing.JFrame;
public class SurveyViewer
{
    public static void main(String[] args)
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        frame.getContentPane().add(new Survey());
        
        frame.setSize(1350, 1000);
        frame.setTitle("Personality Survey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
