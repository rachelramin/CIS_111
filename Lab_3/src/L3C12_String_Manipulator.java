//Rachel Amin Lab 3 Challenge 12
//String Minipulator


import javax.swing.JOptionPane;

public class Lab_3_Challange_12
{

   public static void main(String[] args)
   {
      String city;
      
         city = JOptionPane.showInputDialog("What is your favorite city?");
         
            String upper = city.toUpperCase();
            String lower = city.toLowerCase();
            char letter = city.charAt(0);
            int string_Size = city.length();
            
            JOptionPane.showMessageDialog(null, string_Size +
                                          "\n\t" + upper +
                                          "\n\t" + lower +
                                          "\n\t" + letter);
                                          
        System.exit(0);
        
    }
    
}        
