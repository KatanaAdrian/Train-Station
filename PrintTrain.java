import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

public class PrintTrain {

  TrainInfoGUI trainInfo= new TrainInfoGUI();
  public PrintTrain(Train train1){
      JLabel abc=new JLabel();
      abc.setText(train1.getNumber());
      abc.setBounds(200,10,200,50);
      trainInfo.frame.add(abc);

      JLabel b= new JLabel();
      b.setText(train1.getSource());
      b.setBounds(200,10,200,100);
      trainInfo.frame.add(b);

      JLabel c= new JLabel();
      c.setText(train1.getDestination());
      c.setBounds(200,10,200,150);
      trainInfo.frame.add(c);

      JLabel d= new JLabel();
      d.setText(train1.getarrivalTime());
      d.setBounds(200,10,200,200);
      trainInfo.frame.add(d);

      JLabel g= new JLabel();
      g.setText(train1.getDepartTime());
      g.setBounds(200,10,200,250);
      trainInfo.frame.add(g);

      JLabel h= new JLabel();
      h.setText(String.valueOf(train1.getLineNr()));
      h.setBounds(200,10,200,300);
      trainInfo.frame.add(h);

      trainInfo.frame.setLayout(null);
      trainInfo.frame.setVisible(true);

  }
}
