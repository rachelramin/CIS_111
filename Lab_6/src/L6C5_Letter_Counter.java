//Rachel Amin
//lab 6 challange 5
//Letter counter

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class L6C5_Letter_Counter
{


   public static void main(String[] args)
   {


         String input, new_string, character;
         int string_length, counter = 0, counter_2 = 0;
         
         //Asks and takes a string inupt from the user.
         input = JOptionPane.showInputDialog("Please enter a string statment of word.");
            new_string = input;
         
         //counts and returns the number of cahracters in a string.   
         string_length = new_string.length();
        
        //asks user for a character 
         input = JOptionPane.showInputDialog("Please enter a character.");
            character = input;

         //While-loop that will only stop, when the counter is no longer less than the string length.
         while( counter < string_length)
         {
            //If the chatacter in this position matches the character the user input, add to char count and loop counter.
            if(character.charAt(0) == (new_string.charAt(counter)))
            {
                counter_2++;
                counter++;  
            }
            
            // If the above condition is not met, add to loop counter.
            else
            {
               counter++;
            }
         
         }   
         
         //display.
         JOptionPane.showMessageDialog(null,"The Character " + character + " appers " + counter_2 + " times, in the String " + 
                                             "'" + new_string + "'");
         
         

      System.exit(0);
      
         
      }
      
}      