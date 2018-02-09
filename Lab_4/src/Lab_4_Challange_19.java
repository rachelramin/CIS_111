/* Rachel Amin Lab 4 
Challange 19 with changes.
   ask for number of stock sold and sell price(per share),  
   Ask for # and price(per share) of stocks.
   Joptionpain (one output).
   shares can be whole
   shares # cannot be greater than # purchased.
   Show only 2 decimels,
   OUTPUT:
   Same as book
   add profit answer, if-then statments,(if + =good, else - = bad).
   display lefover stocks and there value(based of selling price)
   

*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab_4_Challange_19
{


   public static void main(String[] args)
   {
      DecimalFormat formatter = new DecimalFormat("#0.00"); 
      DecimalFormat formatter2 = new DecimalFormat("#0");
   
      String input;
      double shares_purchased , shares_sold , price_purchased , selling_price;
            
      //Input
      input = JOptionPane.showInputDialog("How many stocks were purchased?");
         shares_purchased = Double.parseDouble(input);

      input = JOptionPane.showInputDialog("How much was each share?");
         price_purchased = Double.parseDouble(input);
         
       input = JOptionPane.showInputDialog("How many stocks were sold?");
               shares_sold = Double.parseDouble(input);
      
            if(shares_sold > shares_purchased || shares_sold == 0)
            {
               JOptionPane.showMessageDialog(null,"I do not have time for your nonsence." + 
                                             "\n You cannot sell more then you own. " + 
                                             "\n When you are ready to take this seriously " +
                                             "restart the application.");
               System.exit(0);
            }                                
               
                
      
      input = JOptionPane.showInputDialog("How much was each share sold for?");
         selling_price = Double.parseDouble(input);
         
         
     //equations
     double commission = 0.2 , money_in , money_out , commis_paid_sold, commis_paid_bought, loss, gain;
     double remaining_shares , remaining_share_value;
     
      money_in = selling_price * shares_sold;
      
      money_out = price_purchased * shares_purchased;
      
      commis_paid_sold = money_in * commission;
      
      commis_paid_bought = money_out * commission;
      
      loss = money_out + commis_paid_bought;
      
      gain = money_in - commis_paid_sold;
      
      remaining_shares = shares_purchased - shares_sold;
      
      remaining_share_value = remaining_shares * selling_price; 
      
      double profit_value;
      
      profit_value = (money_in) - (commis_paid_bought)- (money_out) - (commis_paid_sold);
      
      //if-else for profit value
      String profit = " ";
      
      if(profit_value > 0)
      {
         profit = "Profitable";
      
      }
      
      else if(profit_value == 0)
      {
         profit = "Of no beifi of loss";
         
      }
      
      else
      {
         profit = "Unprofitable";
         
      }
      
      //Output
     String output;
     
     JOptionPane.showMessageDialog(null,"This transaction was " + profit +" for Joe. " +
                                         "\n Joe paid $" + formatter.format(price_purchased) + 
                                         " for " + formatter2.format(shares_purchased) + " shares of stock." + 
                                         "\n Joe paid his commisssioner $" + formatter.format(commis_paid_bought) +
                                         " of commission for the purchase." +
                                         "\n So Joe paid a total of $" + formatter.format(loss) + " for all his stocks." +
                                         "\n\n Joe then sold " + formatter2.format(shares_sold) +
                                         " of his shares at a value of $" + formatter.format(selling_price) + " per share." + 
                                         "\n Joe then had to pay his brooker $" + formatter.format(commis_paid_sold) + " of commission for " +
                                         " the sale. " +
                                         "\n Joe recived a total of $" + formatter.format(gain) + " from selling his stocks." +
                                         "\n\n Joes profit or loss form his shares sold is: $" + formatter.format(profit_value) +
                                         "\n Joe has " + formatter2.format(remaining_shares) + " remaining shares, " + 
                                         "with a total value of $" + formatter.format(remaining_share_value));
                                         
                                         
 System.exit(0);                                       
      
     }
      
}      