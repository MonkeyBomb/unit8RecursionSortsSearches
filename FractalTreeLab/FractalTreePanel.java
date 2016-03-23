import java.awt.*;
import javax.swing.JPanel;
public class FractalTreePanel extends JPanel
{
    private final int PANEL_WIDTH = 1000;
    private final int PANEL_HEIGHT = 1000;
    private final double ANGLE = Math.sqrt(3.0) / 6;
    private int current;
    /**
     * Default constructor for objects of class FractalTreePanel
     */
    public FractalTreePanel(int currentOrder)
    {
        current = currentOrder;
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    public void drawFractal(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0)
        {
            return;
        }
        else
        {

            int x2 = x1 - (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
            int y2 = y1 - (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
            g.drawLine(x1, y1, x2, y2);
            //drawFractal(g, x2, y2, angle - 20, depth - 1);
            //drawFractal(g, x2, y2, angle + 20, depth - 1);
            if (depth >= 2)
            {
             g.setColor(Color.RED);
            }
            else
            {
             g.setColor(Color.GREEN);
            }
            drawFractal(g, x2, y2, angle - 30, depth - 1);
            drawFractal(g, x2, y2, angle + 20, depth - 1);
        }
    }

    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);

        g.setColor(Color.GREEN);

        drawFractal(g, 500, 800, 0 , 12);
    }
}

