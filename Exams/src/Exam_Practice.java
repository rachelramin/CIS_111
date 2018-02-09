/*Rachel Amin 10/10/2016
Exam Practice

   Inputs:Done in JOptionPane
      Gender(M or F)(Check with if statments),
      height(inches),
      
   Outputs:Done in one JOptionPane message box
      inputted height(2 dec places),
      convertaed hight (centi) (2 dec places),
      above or below average for gender.
      
info:
   2.54cm in 1 in.
   Average height of MALE = 5'6" (66 inches).
   Average height of FEMALE = 5'2" (62 inches).         
 
*/


import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exam_Practice
{


   public static void main(String[] args)
   {
      DecimalFormat formatter = new DecimalFormat("#0.00");
      
      String input, gender;
      double height_inches, height_cm = 0 ;
      
      
//input and check gender
      input = JOptionPane.showInputDialog("What is your Gender?" + "\n(m for male, f for female)" + 
                                          "\n And Pizza is not a gender Rob. >:(");
             gender = input; 
       if ( !gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f") )    
       {
         JOptionPane.showMessageDialog(null,"Your did not enter a valid Gender." + 
                                             "\nRestart the program when you are ready to be serious.");
         System.exit(0);                                    
       }      
             
//input height         
      input = JOptionPane.showInputDialog("What is your height in inches");
             height_inches = Double.parseDouble(input); 

//convert height

      height_cm = height_inches * 2.54;     
      
//if statments with output.

      if (gender.equalsIgnoreCase("m"))
      {
         if ( height_inches > 66 )
         {
            JOptionPane.showMessageDialog(null,"The student is above average height for a Male, " + 
                                                "at " + formatter.format(height_inches) + " inches." +
                                                "\n\t or " + formatter.format(height_cm) + " centimeters.");
            System.exit(0);                                    
         }
         
         else if ( height_inches == 66)
         {
            JOptionPane.showMessageDialog(null,"The student is average height for a Male, " + 
                                                "at " + formatter.format(height_inches) + " inches." +
                                                "\n\t or " + formatter.format(height_cm) + " centimeters.");
            System.exit(0);                                    

         }
         
         else
         {
            JOptionPane.showMessageDialog(null,"The student is bellow average height for a Male, " + 
                                                "at " + formatter.format(height_inches) + " inches." +
                                                "\n\t or " + formatter.format(height_cm) + " centimeters.");
            System.exit(0);                                    

         }
      
      }
      
      else if (gender.equalsIgnoreCase("f"))
      {
         if ( height_inches > 62 )
         {
            JOptionPane.showMessageDialog(null,"The student is above average height for a Female, " + 
                                                "at " + formatter.format(height_inches) + " inches." +
                                                "\n\t or " + formatter.format(height_cm) + " centimeters.");
            System.exit(0);                                    
         }
         
         else if ( height_inches == 62)
         {
            JOptionPane.showMessageDialog(null,"The student is average height for a Female, " + 
                                                "at " + formatter.format(height_inches) + " inches." +
                                                "\n\t or " + formatter.format(height_cm) + " centimeters.");
            System.exit(0);                                    

         }
         
         else
         {
            JOptionPane.showMessageDialog(null,"The student is bellow average height for a Female, " + 
                                                "at " + formatter.format(height_inches) + " inches." +
                                                "\n\t or " + formatter.format(height_cm) + " centimeters.");
            System.exit(0);                                    

         }
      
      }

      
            
   System.exit(0);   
      
   }  

}