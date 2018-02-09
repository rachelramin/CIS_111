//Rachel Amin, Brad Sloane, Leah Day - Challenge 17
//Ingredient Adujuster
//only use JOptionpain, and whole numbers

import javax.swing.JOptionPane;

public class Group_Challange_17 
{
      public static void main(String[] args)
      {
      
         //1.5 cup of suger + 1 cup of butter + 2.75 cups of flour = 48 cookies
         
         double cup_of_suger = 1.5 / 48;
         double cup_of_butter = 1.0 / 48;
         double cup_of_flour = 2.75 / 48;
         //This will set the ingredients equal to 1 cookie.
         
        String input_cookies;
        int num_cookies;
        
        //varible for cookies
        
        input_cookies = JOptionPane.showInputDialog("How many cookies do you want to make"+ 
                                                   "\n\t(Whole numbers only)");
            num_cookies = Integer.parseInt(input_cookies);
            
        //input of cookies and the change from string to int.
            
        cup_of_suger = cup_of_suger * num_cookies;
        cup_of_butter = cup_of_butter * num_cookies;
        cup_of_flour = cup_of_flour * num_cookies;
        
        //math for how much of your ingredients you need for how many cookies you make
        
         JOptionPane.showMessageDialog(null,  "To make " + num_cookies + " You require: " + 
                                    "\n\t" + cup_of_suger +" - cups of suger." +
                                    "\n\t" + cup_of_butter + " - cups of butter" +
                                    "\n\t" + cup_of_flour + " - cups of flour" );
        //output. 
                                    
       System.exit(0);
       
       }
       
}       



