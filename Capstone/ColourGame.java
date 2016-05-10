
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ColourGame extends JFrame {
    static int Pick;    //The color the player picked
    
    public ColourGame( )
    {
        JFrame frame = new JFrame("ColourGamePicker");

        ArrayList<Integer> Computer = new ArrayList<Integer>();
        ArrayList<Integer> Player = new ArrayList<Integer>();
        int CompPick;   //The color the computer picks

        Random gen = new Random();

        //      Set up the Jframe

        frame.setSize(206, 232);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        //      Set up the four colored buttons

        final JButton BlueButton = new JButton();
        BlueButton.setBounds(0, 0, 100, 100);
        BlueButton.setBackground(Color.blue);
        JButton RedButton = new JButton();
        RedButton.setBounds(100, 0, 100, 100);
        RedButton.setBackground(Color.red);


        final JButton YellowButton = new JButton();
        YellowButton.setBounds(100, 100, 100, 100);
        YellowButton.setBackground(Color.yellow);


        final JButton GreenButton = new JButton();
        GreenButton.setBounds(0, 100, 100, 100);
        GreenButton.setBackground(Color.green);


        //      Add the buttons and make the frame visable
        frame.add(BlueButton);
        frame.add(RedButton);
        frame.add(YellowButton);
        frame.add(GreenButton);
        frame.setVisible(true);



        do {
            CompPick = gen.nextInt(4);  //Pick a random number(color)
            Computer.add(CompPick); //Add the color to the computer's arraylist

            //      Search through the arraylist and find what colors were pushed

            for (int i = 0; i < Computer.size(); i++) {
                if (Computer.get(i) == 0) { //Blue Button
                    //Make the blue button look like it was clicked
                    BlueButton.doClick(1000);
                    //Pause the execution for one second (if the arraylist has more
                    //than one item it needs to pause in between each color lighting up)

                    try {
                        Thread.currentThread().sleep(1000);
                    }

                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if(Computer.get(i) == 1) { //Red Button
                    RedButton.doClick(1000);
                    try {
                        Thread.currentThread().sleep(1000);
                    }

                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (Computer.get(i) == 2) {  //Yellow Button
                    YellowButton.doClick(1000); 
                    try {
                        Thread.currentThread().sleep(1000);
                    }

                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (Computer.get(i) == 3) {  //Green Button
                    GreenButton.doClick(1000);
                    try {
                        Thread.currentThread().sleep(1000);
                    }

                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            //      Add an action listener to each button. If the button is pushed,
            //       set Pick to the number that corresponds to the color of the button
            BlueButton.addActionListener(new ActionListener()
            {
                    public void actionPerformed(ActionEvent e)
                    {
                        Pick = 0;
                    }
                });

            RedButton.addActionListener(new ActionListener() 
            {
                    public void actionPerformed(ActionEvent e)
                    {
                       Pick = 1;
                    }
                });

            YellowButton.addActionListener(new ActionListener() 
            {
              public void actionPerformed(ActionEvent e)
               {
                      Pick = 2;
               }
               });

            GreenButton.addActionListener(new ActionListener()
            {


                    public void actionPerformed(ActionEvent e)

                    {

                        Pick = 3;

                    }

                });



            Player.add(Pick);   //Add the button that was pushed to the player's arraylist


            //      Search through the two arraylists to make sure the player pushed the right button

            for (int j = 0; j < Computer.size(); j++) {

                if (Computer.get(j) != Player.get(j)) {

                    JOptionPane.showMessageDialog(null, "You Lose");

                }

            }

        } while (Pick == CompPick);

    }
    
}
