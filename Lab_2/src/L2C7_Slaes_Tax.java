//Rachel Amin, Program Lab 2:Challange 7
//Sales Tax

import java.util.Scanner;

public class L2C7_Slaes_Tax
{

   public static void main(String[] args)
   {
   
   
      double purchaseAmount;
      double stateTax;
      double countyTax;
      
      double totalTax;
      double totalSale;
      double totalPurchase;
      
      Scanner keyboard = new Scanner(System.in);
      
      
      System.out.println("Please enter the toatl amont of your purchase,then press enter. ");
      purchaseAmount = keyboard.nextDouble();
      
      countyTax = purchaseAmount * 0.02;
      stateTax = purchaseAmount * 0.04;
      totalTax = countyTax + stateTax;
      totalPurchase = purchaseAmount + totalTax;
      
      System.out.println("Recipt: " +
                        "\n\tPruchase : $"+purchaseAmount+
                        "\n\tState Sales Tax : $"+stateTax+
                        "\n\tCounty Sales Tax : $"+countyTax+
                        "\n\tTotal Slaes Tax : $"+totalTax+
                        "\n\tTotal of Sale : $"+totalPurchase);
      }
    
}
    
