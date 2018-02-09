//Rachel Amin
//lab 5 challange 12
//speed of sound

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab_5_Challange_12
{


   public static void main(String[] args)
   {
      DecimalFormat formatter = new DecimalFormat("#0.00");
      
      String input, element;
      double distance, time = 0;
      
      input = JOptionPane.showInputDialog("air, water, or, steel?");
         element = input;
         
      input = JOptionPane.showInputDialog("How far will the soundwave travel in feet?");
         distance = Double.parseDouble(input);
         
       
       if (element.equals("air"))
       {
         time = distance / 1100;
                       
       }
       
       else if (element.equals("water"))
       {
         time = distance / 4900; 
                     
       }     
       
       else if (element.equals("steel"))
       {
         time = distance / 16400;
         
       }
       
       else
       {
         JOptionPane.showMessageDialog(null,"Please renter your element.");
         
         System.exit(0);
       }
       
       JOptionPane.showMessageDialog(null,"It takes " + formatter.format(time) + " seonds for the sound wave to travel through " +
                                          element);

                                          
                                          
                                          
  System.exit(0);
  
    }
    
}                                          