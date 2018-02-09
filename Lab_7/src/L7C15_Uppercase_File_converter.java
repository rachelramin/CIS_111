//Rachel Amin
//Lab 7 challange 15
//Uppercase File Converter

import javax.swing.JOptionPane;
//import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class L7C15_Uppercase_File_converter
{

                                          //Needed for file reading and writing.
   public static void main(String[] args) throws IOException
   {
        String file_1, file_2;
        
        
        //Creates a scanner object for the keyboard, so the program will acknowlage the input.
        Scanner keyboard = new Scanner(System.in);
        
        //Get the name of the file with the data.
         System.out.println("Please enter the name of the file with the data. (file1.txt).");
            file_1 = keyboard.nextLine();
            
         //open the reading file.            
         File file = new File(file_1);
         Scanner inputFile = new Scanner(file); 
         
        //Get the name of the blank file.
         System.out.println("What is the name of the new file? (file2.txt).");
            file_2 = keyboard.nextLine();
            
        //Open the file for writing.
         PrintWriter outputFile = new PrintWriter(file_2);   
         
         //loop will run as long as the input file has another line of text.
         while ( inputFile.hasNext())
         {
            //read a line of the read file.
            String line = inputFile.nextLine();
            
            //Change what was rea to upper case
            String upper = line.toUpperCase();
            
            //Write the new line into write file.
            outputFile.println(upper);
         
         } 
      //Close both files.                     
      outputFile.close();
      inputFile.close();
      
      JOptionPane.showMessageDialog(null,"Program run complete. \nPlease check the files to ensure the program ran properly."); 
      
      System.exit(0);
   }
   
}                   

