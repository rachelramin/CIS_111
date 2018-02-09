/*Rachel Amin 10/12/2016
Exam 1

   Inputs:Done in JOptionPane
      Total input of US dollars, or Euros,
      Total contract amount(2 decimal),
      Check the curency type validity and if it is not display error message.
      
   Outputs:Done in one JOptionPane message box
      display total contract amount (2 decimal),
      Converted totlat contract amount (2 decimal),
      how thecoast is in relation to average US dollar amount,
      
info:
   0.74 Euros in $1 US dollar
   Average = $20,000
      contract range would be >= $19,000 and <= 21,000.         
 
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exam_1
{


   public static void main(String[] args)
   {
      DecimalFormat formatter = new DecimalFormat("#0.00");

//Declare variables
      String input, input_currency, converted_currency;
      double input_contract, converted_contract = 0;
      
//Ask and recive input for currency type.

      input = JOptionPane.showInputDialog("What currency will you be paying with today? (E for Euro, or D for US Dollar). ");
               input_currency = input;
               
              
//Check if curreny type is valaid              
              
       if ( !input_currency.equalsIgnoreCase("e") && !input_currency.equalsIgnoreCase("d") )    
       {
         JOptionPane.showMessageDialog(null,"Your did not enter a valid currency for this transaction." + 
                                             "\nRestart the program when you can pay with either Euros, or US Dollars.");
         System.exit(0);                                    
       }      

//input aomunt for contract.

      input = JOptionPane.showInputDialog("How much is your contract amount?");
            input_contract = Double.parseDouble(input);
            
//If - Statements for currency conversion.

      if ( input_currency.equalsIgnoreCase("e"))
         {
            converted_contract = input_contract * 1.351;
         }  
         
      else if ( input_currency.equalsIgnoreCase("d"))
         {
            converted_contract = input_contract * 0.74;
         }  

//If - Statements for Average calculation.


       if ( input_currency.equalsIgnoreCase("e"))
         {
            if ( converted_contract > 21000)
            {
               JOptionPane.showMessageDialog(null, " The contract amount is a premium, as it is above average at a total of $" +
                                                     formatter.format(converted_contract)+ " or " + 
                                                     "\n " + formatter.format(input_contract) + " Euros.");
               
               System.exit(0);                                         
             
            }
            
           else if ( converted_contract <= 21000 && converted_contract >= 19000)
            {
               JOptionPane.showMessageDialog(null, " The contract amount is average at a total of $" +
                                                     formatter.format(converted_contract)+ " or " + 
                                                     "\n " + formatter.format(input_contract) + " Euros.");
               
               System.exit(0);                                         
             
            }
            
            else if ( converted_contract <= 19000)
            {
               JOptionPane.showMessageDialog(null, " The contract amount is a bargin ,as it is below average at a total of $" +
                                                     formatter.format(converted_contract)+ " or " + 
                                                     "\n " + formatter.format(input_contract) + " Euros.");
               
               System.exit(0);                                         
             }


         }  
         
         
         if ( input_currency.equalsIgnoreCase("d"))
         {
            if ( input_contract > 21000)
            {
               JOptionPane.showMessageDialog(null, " The contract amount is a premium, as it is above average at a total of $" +
                                                     formatter.format(input_contract)+ " or " + 
                                                     "\n " + formatter.format(converted_contract) + " Euros.");
               
               System.exit(0);                                         
             
            }
            
           else if ( input_contract <= 21000 && input_contract >= 19000)
            {
               JOptionPane.showMessageDialog(null, " The contract amount is average at a total of $" +
                                                     formatter.format(input_contract)+ " or " + 
                                                     "\n " + formatter.format(converted_contract) + " Euros.");
               
               System.exit(0);                                         
             
            }
            
            else if ( input_contract <= 19000)
            {
               JOptionPane.showMessageDialog(null, " The contract amount is a bargin ,as it is below average at a total of $" +
                                                     formatter.format(input_contract)+ " or " + 
                                                     "\n " + formatter.format(converted_contract) + " Euros.");
               
               System.exit(0);                                         
             }


         }  
      
   
   System.exit(0);
      
    }
    
}                   