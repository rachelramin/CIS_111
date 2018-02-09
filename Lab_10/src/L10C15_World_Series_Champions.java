//Rachel Amin
//Lab 10 challange 15
//world series champions

import javax.swing.JOptionPane;
//import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class L10C15_World_Series_Champions
{

                                          //Needed to read a file.
   public static void main(String[] args) throws IOException
   {
   
         
         String input, winner;
         int year;
         
         input = JOptionPane.showInputDialog("What year are you looking up?");
                  year = Integer.parseInt(input);

         if ( year == 1904 || year == 1994 )
         {
            JOptionPane.showMessageDialog(null,"No World Series was played that year.");
            
            System.exit(0);
         }
         
         winner = readfile(year);
         
         JOptionPane.showMessageDialog(null," The winner for " + year + " was the " + winner + ".");
         
         System.exit(0); 
         
   }
   
   
   
   public static String readfile ( int year ) throws IOException
   {
         //counter for loop, and counter to store array.
         int i = 1903, index = 0;
       
         String[] champs = new String[104];  
         String winner = "";
          
        //JOptionPane.showMessageDialog(null,year);
          
            
         //Creates a scanner object for the keyboard, so the program will acknowlage the input.
        // Scanner keyboard = new Scanner(System.in);

         //Asks for the filename and assigns it to its pre-inisilzed varible.   
         //System.out.println("Enter the filename:(WorldSeriesWinners.txt) ");
        //String filename = keyboard.nextLine();  
      
         //Opens the file.                     
         File file = new File("WorldSeriesWinners.txt");
         Scanner inputFile = new Scanner(file);   

         while ( inputFile.hasNext() )
         {
            champs[index] = inputFile.nextLine();
            index++;
         
         }
         
         //JOptionPane.showMessageDialog(null,);
         
         
         
         
         
         
         
        
         inputFile.close();
         return winner;
   
   }      
   
   
}   
