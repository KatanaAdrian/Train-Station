import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

public class TrainInfoGUI {

    JFrame frame = new JFrame("Train information");

    public TrainInfoGUI() {

        frame.setSize(600,250);
        JLabel number = new JLabel();
        number.setText("Train number:");
        number.setFont(new Font("Arial", Font.BOLD, 16));
        number.setBounds(10, 10, 200, 50);
        frame.add(number);

        JLabel source = new JLabel();
        source.setText("Source:");
        source.setFont(new Font("Arial", Font.BOLD, 16));
        source.setBounds(10, 10, 100, 100);
        frame.add(source);


        JLabel destination = new JLabel();
        destination.setText("Destination:");
        destination.setFont(new Font("Arial", Font.BOLD, 16));
        destination.setBounds(10, 10, 100, 150);
        frame.add(destination);


        JLabel arrival = new JLabel();
        arrival.setText("Arrival time:");
        arrival.setFont(new Font("Arial", Font.BOLD, 16));
        arrival.setBounds(10, 10, 200, 200);
        frame.add(arrival);


        JLabel depart = new JLabel();
        depart.setText("Depart time:");
        depart.setFont(new Font("Arial", Font.BOLD, 16));
        depart.setBounds(10, 10, 200, 250);
        frame.add(depart);

        JLabel line = new JLabel();
        line.setText("Line number:");
        line.setFont(new Font("Arial", Font.BOLD, 16));
        line.setBounds(10, 10, 200, 300);
        frame.add(line);

    }
}