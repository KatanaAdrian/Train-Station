import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
public class TimeTable extends JFrame {

	/*public TimeTable()
	{
		setSize(1000, 600);
        setVisible(true);
	}*/

  /*  public static void main(String[] args) throws Exception {
        TimeTable trains = new TimeTable();
        trains.start();
       /* File file = new File("doi.txt");
        Scanner scanner = new Scanner(file);*/

 /*   }

    private void start() throws Exception
        {
            //new TimeTable().setVisible(true);
            Train train1 = new Train(150, 1, 250, "AA38", "Baia Mare", "Cluj Napoca", 2, 13, 43, 13, 45);
            print(train1);
            //PrintStream timeTable = new PrintStream(new FileOutputStream("timeTable.txt"));
            // System.setOut(timeTable);
            // System.setErr(timeTable);
            //draw(train);
            new Drawing().setVisible(true);
            //Line line = new Line(2, true);
            //line.setVisible(true);
            ///System.out.println()
            //System.out.println("Train1 starts moving");
            //StartToMove(train1);
            PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

            out.print(train1.getDestination());
            out.print("     ");
            out.print(train1.getNumber());
            out.close();


        }

        public void print (Train train){
            //JOptionPane.showMessageDialog(null, train.getNumber());
            System.out.print(train.getNumber());
            System.out.print(" ");
            System.out.print(train.getSource());
            System.out.print(" ");
            System.out.print(train.getDestination());
            System.out.print(" ");
            System.out.print(train.getArrivalHour());
            System.out.print(":");
            System.out.print(train.getArrivalMin());
            System.out.print(" ");
            System.out.print(train.getDepartHour());
            System.out.print(":");
            System.out.print(train.getDepartMin());
        }

	/*public void draw(Graphics train)
	{
		//Train newTrain = new Train();
		Train train1=new Train(150, 1, 250, "AA38", "Baia Mare", "Cluj Napoca", 2, 13, 43, 13, 45);
		train.drawString(train1.getNumber(), 1, 10);
	}*/

	/*public static void StartToMove(Train x)
	{
	    System.out.println("Speeding step is" + x.getAcceleration());
	    for(int i=0;i<8;i++){
	        System.out.println("accelerating" + x.accelerate());
	    }
	    for(int i=0;i<3;i++){
	        System.out.println("decelerating" + x.decelerate());
	}
	System.out.println("Final speed:" + x.getSpeed());
	}
*/
    }

