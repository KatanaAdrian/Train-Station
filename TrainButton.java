import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class TrainButton extends JFrame{

    private JButton comet1,leavet1,comet2,leavet2,comet3,leavet3,comet4,leavet4;

    public TrainButton(){
ButtonTrain1(false);
        ButtonTrain2(false);
        ButtonTrain3(false);
        ButtonTrain4(false);
    }

public void ButtonTrain1(boolean b){

        JFrame train1= new JFrame("Train 1");
        JLabel label=new JLabel();
        label.setText("Choose the action");
        label.setBounds(230,10,200,100);
        label.setFont(new Font("Arial",Font.BOLD,16));

        comet1 = new JButton(" Train 1 comes ");
        comet1.setBounds(350, 100, 200, 50);
        getContentPane().add(comet1);

        leavet1 = new JButton(" Train 1 leaves ");
        leavet1.setBounds(50, 100, 200, 50);
        getContentPane().add(leavet1);

        train1.add(comet1);
        train1.add(leavet1);

        train1.add(label);
        train1.setSize(600,250);
        train1.setLayout(null);
        train1.setVisible(b);

    }
    public void ButtonTrain2(boolean b){

        JFrame train1= new JFrame("Train 2");
        JLabel label=new JLabel();
        label.setText("Choose the action");
        label.setBounds(230,10,200,100);
        label.setFont(new Font("Arial",Font.BOLD,16));

        comet2 = new JButton(" Train 2 comes ");
        comet2.setBounds(350, 100, 200, 50);
        getContentPane().add(comet2);

        leavet2 = new JButton(" Train 2 leaves ");
        leavet2.setBounds(50, 100, 200, 50);
        getContentPane().add(leavet2);

        train1.add(comet2);
        train1.add(leavet2);

        train1.add(label);
        train1.setSize(600,250);
        train1.setLayout(null);
        train1.setVisible(false);

    }
    public void ButtonTrain3(boolean b){

        JFrame train1= new JFrame("Train 3");
        JLabel label=new JLabel();
        label.setText("Choose the action");
        label.setBounds(230,10,200,100);
        label.setFont(new Font("Arial",Font.BOLD,16));

        comet3 = new JButton(" Train 3 comes ");
        comet3.setBounds(350, 100, 200, 50);
        getContentPane().add(comet3);

        leavet3 = new JButton(" Train 3 leaves ");
        leavet3.setBounds(50, 100, 200, 50);
        getContentPane().add(leavet3);

        train1.add(comet3);
        train1.add(leavet3);

        train1.add(label);
        train1.setSize(600,250);
        train1.setLayout(null);
        train1.setVisible(false);

    }
    public void ButtonTrain4(boolean b){

        JFrame train1= new JFrame("Train 4");
        JLabel label=new JLabel();
        label.setText("Choose the action");
        label.setBounds(230,10,200,100);
        label.setFont(new Font("Arial",Font.BOLD,16));

        comet4 = new JButton(" Train 4 comes ");
        comet4.setBounds(350, 100, 200, 50);
        getContentPane().add(comet4);

        leavet4 = new JButton(" Train 4 leaves ");
        leavet4.setBounds(50, 100, 200, 50);
        getContentPane().add(leavet4);

        train1.add(comet4);
        train1.add(leavet4);

        train1.add(label);
        train1.setSize(600,250);
        train1.setLayout(null);
        train1.setVisible(false);

    }

    public void leaveTrain1ActionListener(final ActionListener actionListener){
        leavet1.addActionListener(actionListener);
    }
    public void leaveTrain2ActionListener(final ActionListener actionListener){
        leavet2.addActionListener(actionListener);
    }
    public void leaveTrain3ActionListener(final ActionListener actionListener){
        leavet3.addActionListener(actionListener);
    }
    public void leaveTrain4ActionListener(final ActionListener actionListener){
        leavet4.addActionListener(actionListener);
    }
    public void comeTrain1ActionListener(final ActionListener actionListener){
        comet1.addActionListener(actionListener);
    }
    public void comeTrain2ActionListener(final ActionListener actionListener){
        comet2.addActionListener(actionListener);
    }
    public void comeTrain3ActionListener(final ActionListener actionListener){
        comet3.addActionListener(actionListener);
    }
    public void comeTrain4ActionListener(final ActionListener actionListener){
        comet4.addActionListener(actionListener);
    }

}
