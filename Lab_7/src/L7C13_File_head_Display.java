//Rachel Amin
//Lab 7 challange 13
//File Head Display

//import javax.swing.JOptionPane;
//import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class L7C13_File_head_Display
{

                                          //Needed to read a file.
   public static void main(String[] args) throws IOException
   {
   
         //String filename;
         int counter = 0;
         
         //Creates a scanner object for the keyboard, so the program will acknowlage the input.
         Scanner keyboard = new Scanner(System.in);

         //Asks for the filename and assigns it to its pre-inisilzed varible.   
         System.out.println("Enter the filename:(friends.txt) ");
         String filename = keyboard.nextLine();  
      
         //Opens the file.                     
         File file = new File(filename);
         Scanner inputFile = new Scanner(file);   

         //Read the file up to 5 lines.
         while (inputFile.hasNext())
         {
            if ( counter < 5 )
            {
               String friend_name = inputFile.nextLine();
               
               System.out.println(friend_name);
               
               counter++;
            }
         
         }
         
         //close file.
         inputFile.close();
         
         System.exit(0);
    }
    
}         