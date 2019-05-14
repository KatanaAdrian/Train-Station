import java.awt.*;
import javax.swing.*;

public class Line {

    private int nrLines = 4;
    private int line;
    private boolean[] occupied = new boolean[nrLines];

    public Line(int line, boolean occupied)
    {
        this.line = line;
        this.occupied[line] = occupied;
        //setSize(1000, 1000);
        //setVisible(true);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void init()
    {
        for(int i = 1; i <= nrLines; i++)
        {
            occupied[i] = false;
            System.out.println(occupied[i]);
        }
    }

    public int getLine(int nrLines)
    {
        for(int line = 1; line <= nrLines; line++)
        {
            if(!occupied[line])
            {
                return line;
            }
        }
        return 0;
        //System.out.println("All lines are occupied");
    }
    
    /*public void paintLine(Graphics line, int start)
    {
    	//line.setColor(Color.black);
    	//Font f = new Font("TimesRoman", Font.BOLD, 24);
    	//line.setFont(f);
    	//line.drawString("asd", 50, 100);
    	line.drawLine(0,  start, 1000, start);
    	line.drawLine(0,  start + 1, 1000, start + 1);
    	line.drawLine(0,  start + 2, 1000, start + 2);
    }
    
    public void paint(Graphics line) {
    	int start = 150;
    	for(int nrLines = 1; nrLines <= 4; nrLines++)
    	{
    		paintLine(line, start);
    		start = start + 100;
    	}
    }*/
    
    /*public static void main(String[] args)
    {
        new Line(2, true).setVisible(true);
    }*/
    
     /*public int getLine(int lineNr)
     {
         if(lineNr < 1 || lineNr > nrLines) {
             lineNr = findFreeLine(nrLines);
             if(lineNr > 0)
             {
                 return lineNr;
             }
             else
             {
                 System.out.println("All lines are ocupied");
             }
		}
     }*/
}