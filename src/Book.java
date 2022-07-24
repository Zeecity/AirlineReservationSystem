import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Book
{
    public static void bookFlight()
    {
        JFrame myFrame = new JFrame("Zero-day Airlines");

        JButton round_trip = new JButton("Round Trip");
        JButton one_way = new JButton("One Way");

        myFrame.add(round_trip);
        myFrame.add(one_way);

        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(500, 200);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        round_trip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == round_trip) {
                    RoundTrip.roundtrip();
                }

            }

        });

        one_way.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == one_way) {
                    OneWay.oneway();
                }

            }

        });

    }
}
