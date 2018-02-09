//Rachel Amin Lab 3 Challenge 15
//Stock Commission

import javax.swing.JOptionPane;

public class Lab_3_Challange_15
{

   public static void main(String[] args)
   {

      double stock, commission, total;
      
      stock = 21.77 * 600;
      commission = stock * 0.2;
      total = stock + commission;
      
      JOptionPane.showMessageDialog(null, " Total Stock price: $" + stock +
                                          "\n\t Total Commission price: $" + commission +
                                          "\n\t Total price paid: $" + total);
                                          
   System.exit(0);
   
   }
   
}                                          