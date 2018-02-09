//Rachel Amin
//Lab 8 Challange 3
//Charge account and validaition

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//import java.util.Random;
//import java.io.*;

public class L9C3_Charge_Account_Validation
{
       
       
     public static void main(String[] args)
     {  
         String input;
         int element, account_num;
         
         input = JOptionPane.showInputDialog("What is your account number?");
                  account_num = Integer.parseInt(input);
         
         element = validation ( account_num );
         
         if (element == -1)
         {
            JOptionPane.showMessageDialog(null,"That is not a valid account number.\n Nice try.");
            
            System.exit(0);
         }
         
         else 
         {
            JOptionPane.showMessageDialog(null,"Welcome back to I don't care bank user " + account_num);
            
            System.exit(0);
         
         }
            
      }
         
      public static int validation ( int account_num )
      {
      
           int[] valids = {5658845, 8080125, 1005231, 4520125, 4562555, 6545231, 7895122, 5552012, 3852085, 8777541, 
                              5050552, 7576651, 8451277, 7825877, 7881200, 1302850, 1250255, 4581002};
                               
           // is the true false statement, it will start as a false, so the loop will run.                   
           boolean found = false; 
           
           //i is the loop control,it is set to 0 as that is the first element that will be tested in the array. 
           //and element is the element of the value found, it is set to seart at -1 so the loop will run it will return, 
           //a -1, if the element was not found.).
           int i = 0, element = -1;
           
           // While not found(found = false), and i is less then the array length.                   
           while (!found && i < valids.length)
           {
           
            // if the string of the array matches the given.
            if ( valids[i] == account_num )
            {
               found = true;
               element = i;
            }
           
            i++;
           }
                
         return element;
      }   


}