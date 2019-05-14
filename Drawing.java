import java.awt.*;
import javax.swing.*;

public class Drawing extends JFrame {


    public Drawing() {
        setSize(1000, 600);
        setVisible(true);



    }


    public void paintLine(Graphics line, int start) {
        //line.setColor(Color.black);
        //Font f = new Font("TimesRoman", Font.BOLD, 24);
        //line.setFont(f);
        //line.drawString("asd", 50, 100);
        line.drawLine(0, start, 1000, start);
        line.drawLine(0, start + 1, 1000, start + 1);
        line.drawLine(0, start + 2, 1000, start + 2);

    }

    public void paintTrain(Graphics train, int up) {
        train.setColor(Color.blue);
        train.drawRect(200, up, 600, 79);
        train.fillRect(200, up, 600, 79);


    }

  /*  public void CreateButtons() {
        JButton leaveTrain1 = new JButton();
        leaveTrain1.setText("Leave train 1");
        leaveTrain1.setBounds(100, 100, 50, 25);
        //getContentPane().add(leaveTrain1);
        add(leaveTrain1);

        JButton leaveTrain2 = new JButton();
        leaveTrain1.setText("Leave train 2");
        leaveTrain1.setBounds(200, 200, 50, 25);
        //getContentPane().add(leaveTrain1);
        add(leaveTrain2);

        JButton leaveTrain3 = new JButton();
        leaveTrain1.setText("Leave train 3");
        leaveTrain1.setBounds(300, 300, 200, 200);
        //getContentPane().add(leaveTrain1);
        add(leaveTrain3);
    }
*/
    public void paint(Graphics line) {
        int start = 150;
        int up = 70;
        for (int nrLines = 1; nrLines <= 4; nrLines++) {
            paintTrain(line, up);
            up = up + 100;
            line.setColor(Color.black);
            paintLine(line, start);
            start = start + 100;
        }

    }

}