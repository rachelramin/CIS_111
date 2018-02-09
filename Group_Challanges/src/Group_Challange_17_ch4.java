//Rachel Amin,Bradley Sloane,Leah Day
//Group challange 17
//Random number guessing game

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Random;
import java.io.*;

public class Group_Challange_17_ch4
{


   public static void main(String[] args)
   {
         Random randomNumber = new Random();
         
         String result = " ", again, input = " ";
         int guess, counter = 0;
         
         //get random number
         //int number = randomNumber.nextInt(100)
         
         do
         {
            //This will give the random number/         
           int number = randomNumber.nextInt(100);  
           
            JOptionPane.showMessageDialog(null,"I have picked a number between 1 and 100. Please try and guess it." +
                                                "\n(If you can count that high)"); 
            
            do
            {
                //takes input.   
                 input = JOptionPane.showInputDialog("Please enter the best number you can think of. I promice to judge you.");
                   //input = input.trim();
           
               //Checks to ensure input was not left blank, and eliminates any spaces that may have been entered (trim.()).         
               while (input.trim().equalsIgnoreCase(""))
               {
               
                 JOptionPane.showMessageDialog(null," Thats not vaild.");
                 input = JOptionPane.showInputDialog("Please enter the best number you can think of. I promice to judge you.");
                 counter++;               
               }

                  
                  //converts input to interger.
                  guess = Integer.parseInt(input);
               
               // if the guess was less then the number.   
               if( guess < number )
               {
                  JOptionPane.showMessageDialog(null, " Your guess is too low. Must be simliar to your IQ");
                
                  result = "wrong";
                  counter++;
                
               }
               
               //If the guess was correct.   
               if( guess == number )
               {
                  JOptionPane.showMessageDialog(null, " Your guess is correct, I don't know how but whatever.");
                
                  result = "you actully got it";
                  counter++;
                
               } 
               
               //If the guess was greater than the number.
               if( guess > number )
               {
                  JOptionPane.showMessageDialog(null, " Your guess is too high. Like you were when you enterd this number.");
                
                  result = "wrong";
                  counter++;
                
               }   
               
                 
            } while ( result.equalsIgnoreCase("wrong"));
         
            //Will display onece correct answer is entered.         
            input =  JOptionPane.showInputDialog(" It took you " + counter + " trys to guess properly. Your mother must be proud." +
                                                   "\n Do you really want to do this to your self again?" + 
                                                   "\n please enter y to continue suffering.");
                                                   
                   again = input;                                
         
         
         } while(again.equalsIgnoreCase("y"));
     
     
  System.exit(0);       
   }
}      
      