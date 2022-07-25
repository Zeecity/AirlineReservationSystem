import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search
{
    public static void search()
    {

        String [] States  = {"Abuja", "Lagos", "Benin"};

        String [] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        String [] time = {"6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30",
                "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30",
                "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30",};

        JFrame myFrame = new JFrame("Zero-day Airlines");

        if(RoundTrip.location == "Abuja" && RoundTrip.location2 == "Lagos")
        {
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + " Leaving:"
                    + RoundTrip.dayOfWeek + " " +  time[0] + " to " + time[2]);
            myFrame.add(output);
            JButton bookTicket = new JButton("Boot Ticket");
            myFrame.add(bookTicket);
        }

        else if(RoundTrip.location == "Lagos" && RoundTrip.location2 == "Abuja")
        {
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " +  time[0] + " to " + time[2]);
            myFrame.add(output);
            JButton bookTicket = new JButton("Boot Ticket");
            myFrame.add(bookTicket);
        }

        else if(RoundTrip.location == "Abuja" && RoundTrip.location2 == "Benin")
        {
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " +  time[0] + " to " + time[2]);
            myFrame.add(output);
            JButton bookTicket = new JButton("Boot Ticket");
            myFrame.add(bookTicket);
        }

        else if(RoundTrip.location == "Lagos" && RoundTrip.location2 == "Benin")
        {
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " +  time[0] + " to " + time[2]);
            myFrame.add(output);
            JButton bookTicket = new JButton("Boot Ticket");
            myFrame.add(bookTicket);
        }

        else if(RoundTrip.location == "Benin" && RoundTrip.location2 == "Lagos")
        {
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " +  time[0] + " to " + time[2]);
            myFrame.add(output);
            JButton bookTicket = new JButton("Boot Ticket");
            myFrame.add(bookTicket);
        }

        else if(RoundTrip.location == "Benin" && RoundTrip.location2 == "Abuja")
        {
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " +  time[0] + " to " + time[2]);
            myFrame.add(output);
            JButton bookTicket = new JButton("Boot Ticket");
            myFrame.add(bookTicket);
        }
        else if(RoundTrip.location == RoundTrip.location2)
        {
            JLabel output = new JLabel("Cannot go to State");
            myFrame.add(output);
        }




        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(500, 200);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);



    }
}