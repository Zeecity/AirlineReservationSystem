import javax.swing.*;
import java.awt.*;

public class Ticket
{
    public static void ticket()
    {
        JFrame myFrame = new JFrame("Zero-day Airlines");

        JLabel output = new JLabel("Your Ticket Has Been Booked");

        myFrame.add(output);

        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(500, 200);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
