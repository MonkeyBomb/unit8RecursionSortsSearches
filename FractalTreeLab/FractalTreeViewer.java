import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class FractalTreeViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractalTreeViewer extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
  
    private JPanel panel, tools;
    private JFrame frame;
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;
    /**
     * Default constructor for objects of class FractalTreeViewer
     */
    public FractalTreeViewer()
    {
        frame = new JFrame();
        frame.setTitle("Tree FRACTAL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        panel = new FractalTreePanel(15);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
    }

}
