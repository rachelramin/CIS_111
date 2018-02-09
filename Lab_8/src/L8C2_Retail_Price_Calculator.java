//Rachel Amin
//Lab 8 Challange 2
//Retail Price Calculator

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//import java.util.Random;
//import java.io.*;

public class L8C2_Retail_Price_Calculator
{
       
       
     public static void main(String[] args)
   {  
      //Format for output.
      DecimalFormat formatter = new DecimalFormat("#0.00");

      String input;
      double price, coast, mark_percent;
      
      input = JOptionPane.showInputDialog("What is the coast of he object?");
         coast = Double.parseDouble(input);
         
       input = JOptionPane.showInputDialog("What was the markup-precentage?");
         mark_percent = Double.parseDouble(input);
         
         
       price = calculateRetail(coast, mark_percent);
       
       
       JOptionPane.showMessageDialog(null,"The retail price of the object is $" + formatter.format(price));
       
       System.exit(0);
       
    }
       
       
       public static double calculateRetail( double coast, double mark_percent)
       {
         double price, converted_percent;
         
         converted_percent = 0.01 * mark_percent;
         
         price = coast * converted_percent;
         
         price = coast + price;
       
         return price;
       
       }     
      
      }
      
 