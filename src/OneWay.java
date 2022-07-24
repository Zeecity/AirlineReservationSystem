import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OneWay
{
    public static void oneway()
    {
        String [] States  = {"Abuja", "Lagos", "Benin"};
        String [] classes  = {"Economy", "Firstclass", "Business"};

        JFrame myFrame = new JFrame("Zero-day Airlines");

        JLabel from = new JLabel("From: ");
        JComboBox opt1 = new JComboBox<>();

        JLabel to = new JLabel("To: ");
        JComboBox opt2 = new JComboBox<>();

        JLabel leaving = new JLabel("Leaving: ");

        JButton search = new JButton("Search");

        for( int i = 0; i < States.length; i ++)
        {
            opt1.addItem(States[i]);
            opt2.addItem(States[i]);
        }

        JLabel caClass = new JLabel("Cabin Class: ");
        JComboBox caClass1 = new JComboBox<>();

        for( int i = 0; i < classes.length; i ++)
        {
            caClass1.addItem(classes[i]);
        }


        myFrame.add(from);
        myFrame.add(opt1);

        myFrame.add(to);
        myFrame.add(opt2);

        myFrame.add(caClass);
        myFrame.add(caClass1);

        //myFrame.add(leaving);
        myFrame.add(search);

        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(500, 200);
        myFrame.setVisible(true);

        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == search) {
                    Search.search();
                }

            }

        });

    }
}
