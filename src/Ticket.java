import javax.swing.*;
import java.awt.*;

public class Ticket
{
    public static void ticket()
    {
        JFrame myFrame = new JFrame("Zero-day Airlines");

        try
        {
            int[] your_ticket = new int[Search.nOfSeats];
            Search.seatNum = Search.seatNum + 1;


            JLabel output = new JLabel("Your Ticket Has Been Booked");
            JLabel yourTicket = new JLabel(" from " + RoundTrip.location + " Seat Number" + Search.seatNum);


            myFrame.add(output);
            myFrame.add(yourTicket);
        } catch (Exception e)
        {
            JLabel output2 = new JLabel("Unable to book ticket");
            myFrame.add(output2);
        }

            myFrame.setLayout(new GridLayout(4, 2));
            myFrame.setSize(500, 200);
            myFrame.setVisible(true);
            myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }
}
