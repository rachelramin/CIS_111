//Rachel Amin
//Lab 8 Challange 1
//Rainfall

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//import java.util.Random;
//import java.io.*;

public class L9C1_Rainfall
{
       
       
     public static void main(String[] args)
     {  
     
         double[] rainfall = new double[12];
         double total_rain, average_rain, highest, lowest;
         String input;
         
         for ( int i = 0; i < rainfall.length; i++)
         {
            input = JOptionPane.showInputDialog("What was the rain fall for month " + ( i +1 ) + " in inches?");
               rainfall[i] = Double.parseDouble(input);

         }
         
         total_rain = totalRainfall( rainfall );
         
         average_rain = averageRainfall ( rainfall ); 
         
         highest = highestRainfall ( rainfall );
         
         lowest = lowestRainfall ( rainfall );
      
      
         JOptionPane.showMessageDialog(null,"The total rainfall for the year is " + total_rain + " inches." +
                                             "\nThe average rainfall for the year is " + average_rain + " inches." +
                                             "\nThe month with the highest rainfall was month " + highest + "." +
                                             "\nThe month with the lowest rainfall was month " + lowest + "." );
         System.exit(0);                                    
      
      }
      
      public static double totalRainfall ( double[] rainfall )
      {
         double total = 0;
         
         for (int i = 0; i < rainfall.length; i++)
         {
            total += rainfall[i];
         }
         
      return total;
      
      }
      
      
      public static double averageRainfall ( double[] rainfall )
      {
         double total = 0, average = 0;
         
         for(int i = 0; i < rainfall.length; i++)
         {
            total += rainfall[i];
            average = total / rainfall.length;
         }
      
      return average;
      
      }
      
      public static double highestRainfall ( double[] rainfall )
      {
         double highest = rainfall[0];
         
         for( int i = 1; i < rainfall.length; i++)
         {
            if (rainfall[i] > highest)
            {
               highest = rainfall[i];
            }
         }
      
      return highest;
      
      }
      
      public static double lowestRainfall ( double[] rainfall )
      {
         double lowest = rainfall[0];
         
         for( int i = 1; i < rainfall.length; i++)
         {
            if (rainfall[i] < lowest)
            {
               lowest = rainfall[i];
            }
         }
      
      return lowest;
      }
      
      
}     



          