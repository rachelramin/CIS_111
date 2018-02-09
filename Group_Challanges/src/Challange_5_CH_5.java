//Rachel Amin,Bradley Sloane,Leah Day
//Challange_5_CH_5
//Falling Distance.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//import java.util.Random;
//import java.io.*;

public class Challange_5_CH_5
{


    public static void main(String[] args)
    {  //Format for output.
        DecimalFormat formatter = new DecimalFormat("#0.00");

        String output = "";
        double distance;

        //for-loop that uses i to count to 10 seconds from 1.
        for ( int i = 1; i <= 10; i++ )
        {
            //the call to the other method, and the assignment of its return-value to a new varible placement.
            distance = fallingDistance(i);

            //concatinating the output within the loop, so the final output can be in one output dialog box.
            output = output + " The Distance at " + i + " seconds is " + formatter.format(distance) + " meters \n\n" ;

        }

        //output display.
        JOptionPane.showMessageDialog(null, output );

        System.exit(0);

    }

    //Second method for calculating the falling ditance.
    public static double fallingDistance( int i )
    {
        //vaiable for the method.
        double distance;

        //math
        distance = (0.5) * (9.8) * ( Math.pow(i,2) );

        //return the value to the main method.
        return distance;

    }


}


