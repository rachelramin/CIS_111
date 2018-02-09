//Rachel Amin, Brad Sloane, Leah Day Challenge 9
//Miles-Per Gallon
//only use JOptionpain, and disply the result in Klm per gallon. 

import javax.swing.JOptionPane;

public class Group_Challange_9
{

   public static void main(String[] args)
   {
   
      double milesDriven;
      String inputMiles;
      double gallonsUsed;
      String inputGallons;
      double milPerGallon;
      double kilPerGallon;
      double kilDriven;
      
      inputMiles = JOptionPane.showInputDialog("How many miles did you drive?");
         milesDriven = Double.parseDouble(inputMiles);
      
      inputGallons = JOptionPane.showInputDialog("How many gallons of gas did you use?");
         gallonsUsed = Double.parseDouble(inputGallons);
         
       milPerGallon = milesDriven / gallonsUsed; 
       
       kilDriven = milesDriven * 1.6;
       
       kilPerGallon = kilDriven / gallonsUsed;

      JOptionPane.showMessageDialog(null, "Your gas mileage is "+milPerGallon+" MPG"+
                                    "\n\tIn Kilometers it was "+kilPerGallon+" KPG.");
                                  
      System.exit(0);
      
      }
      
}                                     