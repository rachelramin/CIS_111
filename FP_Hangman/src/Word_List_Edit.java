//Rachel Amin
//
//Word_list_edit

import javax.swing.JOptionPane;
//import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Word_List_Edit
{

                                          //Needed to read a file.
   public static void main(String[] args) throws IOException
   {
      String options = JOptionPane.showInputDialog("If you would like add a word to the list press A " +
                                                      "\nIf you would like to delete a word from the list press D");
         
         if( options.trim().equalsIgnoreCase("a") )
         {
         //opens the file and allows the user to append it, without ruining everything.
          PrintWriter outputFile = new PrintWriter( new PrintWriter(new BufferedWriter(new FileWriter("WordList2.txt", true))));
          String newWord = JOptionPane.showInputDialog("What word word you like to add?");
          outputFile.println(newWord);
          
          outputFile.close();
          
          System.exit(0);
            
         } 
         
         else if( options.trim().equalsIgnoreCase("d") )
         {
            String words = "";
         
            //Opens the file.                     
            File file = new File("WordList2.txt");
            Scanner inputFile = new Scanner(file);   

         //Read the file up to 5 lines.
         while (inputFile.hasNext())
         {
                           
               words = words + inputFile.nextLine() + "\n";         
            
         }
         
         String eliminatedWord = JOptionPane.showInputDialog( words + "\nPlease enter the word you wan to delete." );
         
         //close file.
         inputFile.close();
         
         //reopens file, and creates a new file.        
         File inputFile2 = new File("WordList2.txt");
         File tempFile = new File("TempWordlist.txt");

         //insilizes a reader and writer for the parent file and new file.
         BufferedReader reader = new BufferedReader(new FileReader(inputFile2));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

         String line;

         //While loop that reads each line fo the text file into the temp file
         //but does not read in the string that the user wants deleted.
         while((line = reader.readLine()) != null)
         {
            String trimmedLine = line.trim();
            if(trimmedLine.equals(eliminatedWord)) continue;
            writer.write(line);
            writer.newLine();
          }
 
         //all readers, file and writers are closed, and the temp file is 
         //renamed after its parent file after the parent file is deleted.
         reader.close();
         writer.close();
         inputFile2.delete();
         tempFile.renameTo(inputFile2);
         }          
      
   
   }
    
}         