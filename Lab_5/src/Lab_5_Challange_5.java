//Rachel Amin
//lab 5 challange 5
//Mass and weight

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab_5_Challange_5
{


   public static void main(String[] args)
   {
      DecimalFormat formatter = new DecimalFormat("#0.00");
      
      String input;
      double mass, weight;
      
      input = JOptionPane.showInputDialog("What is the mass of the object(in Newtons)?");
             mass = Double.parseDouble(input); 
             
      weight = mass * 9.8;
      
      if ( weight > 1000)
      {
      
         JOptionPane.showMessageDialog(null," The object is too heavy, take it away!");       
      }
      
      else if ( weight < 10)
      {
         JOptionPane.showMessageDialog(null," The object is too light, let it float away.");
         
      }
      
      else
      {
      
         JOptionPane.showMessageDialog(null," The weight of the object is: " + formatter.format(weight) + " Newtons.");
         
      }
      
    
    System.exit(0);  
    }
     
}           