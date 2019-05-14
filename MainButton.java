import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;


    public class MainButton extends JFrame {
    private JButton train1,train2,train3,train4;


    public MainButton() {
        CreateButton();

        train1ActionListener(null);
        train2ActionListener(null);
        train3ActionListener(null);
        train4ActionListener(null);
    }

    public void CreateButton() {

        JFrame f = new JFrame("Trains");

        JLabel label=new JLabel();
        label.setText("Choose a train");
        label.setBounds(230,10,200,100);

        label.setFont(new Font("Arial",Font.BOLD,16));
       // getContentPane().setLayout(null);
        train1 = new JButton(" Train1 ");
        train1.setBounds(30, 100, 100, 50);
        getContentPane().add(train1);

         train2 = new JButton(" Train2 ");
        train2.setBounds(150, 100, 100, 50);
        getContentPane().add(train2);
         train3 = new JButton(" Train3 ");
        train3.setBounds(270, 100, 100, 50);
        getContentPane().add(train3);
         train4 = new JButton(" Train4 ");
        train4.setBounds(390, 100, 100, 50);
        getContentPane().add(train4);

        f.add(train1);
        f.add(train2);
        f.add(train3);
        f.add(train4);
f.add(label);
f.setSize(600,250);
f.setLayout(null);
f.setVisible(true);
    }

    public void train1ActionListener(final ActionListener actionListener){
        train1.addActionListener(new ActionListener()
                {
        public void actionPerformed (ActionEvent e)
        {
TrainButton button= new TrainButton();
           button.ButtonTrain1(true);




            Train train1 = new Train(150, 1, 250, "AA38", "Baia Mare", "Cluj Napoca", 2, "13:43","13:45");
PrintTrain print= new PrintTrain(train1);
        }
        });
    }
    public void train2ActionListener(final ActionListener actionListener){
        train2.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                TrainButton button= new TrainButton();
                button.ButtonTrain1(true);

            }
        });
    }
    public void train3ActionListener(final ActionListener actionListener){
        train3.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                TrainButton button= new TrainButton();
                button.ButtonTrain1(true);

            }
        });
    }
    public void train4ActionListener(final ActionListener actionListener){
        train4.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                TrainButton button= new TrainButton();
                button.ButtonTrain1(true);

            }
        });
    }



   /* public void CreateButton() {
 Object[] options1 = {"Train1", "Train2", "Train3", "Train4"};
    JPanel panel = new JPanel();
        panel.add(new JLabel("Choose a train: "));

   int result = JOptionPane.showOptionDialog(null, panel, "Trains",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options1, null);
}*/
}



