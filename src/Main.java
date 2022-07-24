import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    public void runn()
    {
        JFrame myFrame = new JFrame("Zero-day Airlines");

        JButton book_flight = new JButton("Book Flight");

        myFrame.add(book_flight);

        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(500, 200);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        book_flight.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == book_flight)
                {
                    Book.bookFlight();
                }

            }
        });
    }
    public static void main(String[] args)
    {

        Main airline = new Main();
        airline.runn();
    }
}