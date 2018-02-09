//Rachel Amin
//lab 5 challange 13
//Internet Service Provider

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class L5C13_Internet_Service_Provider
{


   public static void main(String[] args)
   {
      //Allows the program to format a number the way it is shown in ().   
      DecimalFormat formatter = new DecimalFormat("#0.00");

      String input, net_package;
      double hours, coast = 0, extra = 0;
      
      //ask and assign user intput for one of 3 options
      input = JOptionPane.showInputDialog("Do you have package A, B, or, C? " + "\n(Plesae use lower case)");
        net_package  = input;
        
        //If-Statement for the math needed for option C, as hours are not needed for this.
        if (net_package.equalsIgnoreCase("c"))
        {
            coast = 19.95; 
            
            JOptionPane.showMessageDialog(null,"Your internet bill for this month is: $" + coast);
           
           System.exit(0);
        }

      //Ask for hours used and convert value to a double.  
      input = JOptionPane.showInputDialog("How many hours did you use this month?");
        hours  = Double.parseDouble(input);
        
        //If-statement with nested If-else Statement for math required to claculate the price owed for plan A.
        if (net_package.equalsIgnoreCase("a"))
        {
            if ( hours <= 10 )
            {
               coast = 9.95;
               
               JOptionPane.showMessageDialog(null,"Your internet bill for this month is: $" + coast);

            }
            
            else
            {
               extra = hours - 10;
               coast = 9.95 + ( extra * 2);
               
               JOptionPane.showMessageDialog(null,"Your internet bill for this month is: $" + coast);

            }
            
        }
        
        //Else-if with nested If-Else to claculate the price owed for plan B.
        else if (net_package.equalsIgnoreCase("b"))
        {
            if ( hours <= 20 )
            {
               coast = 13.95;
               
               JOptionPane.showMessageDialog(null,"Your internet bill for this month is: $" + coast);

            }
            
            else
            {
               extra = hours - 20;
               coast = 13.95 + ( extra * 1);
               
               JOptionPane.showMessageDialog(null,"Your internet bill for this month is: $" + coast);

            }
            
        }
        
                
       System.exit(0);
       
    }
    
}        

        
       
  
        
        
