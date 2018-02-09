//Rachel Amin
//lab 6 challange 1
//Sum of numbers

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class L6C1_Sum_Of_Numbers
{


   public static void main(String[] args)
   {


         String input;
         int num, sum = 0, count = 0;
        
        //aska and recive input, then convert from string to interger. 
         input = JOptionPane.showInputDialog("Please enter a positive whole number.");
            num  = Integer.parseInt(input);
            
         //While-loop that will run as long as the count is less then or equal to the number entered. 
          while ( count <= num)
          {
            sum = sum + count;
            count++;
          }  

         // Display of the sum.
         JOptionPane.showMessageDialog(null,"The total Sum is:" + sum);
         
         
         System.exit(0);
         
     }
   
}     
         