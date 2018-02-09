//Rachel Amin Lab 3 Challenge 10
//Average Test socres


import javax.swing.JOptionPane;

public class L3C10_Average_Test_Scores
{

   public static void main(String[] args)
   {
   
         double test_Score_1 , test_Score_2 , test_Score_3 , sum , average;
         String input_test_1 , input_test_2 , input_test_3;
         
            input_test_1 = JOptionPane.showInputDialog("What was the first test score?");
         test_Score_1 = Double.parseDouble(input_test_1);
         
            input_test_2 = JOptionPane.showInputDialog("What was the second test score?");
         test_Score_2 = Double.parseDouble(input_test_2);

            input_test_3 = JOptionPane.showInputDialog("What was the third test score?");
         test_Score_3 = Double.parseDouble(input_test_3);
         
         sum = test_Score_1 + test_Score_2 + test_Score_3;
         average = sum / 3;
                  
         JOptionPane.showMessageDialog(null, "Your test scores were: " + 
                                             "\n\t" + test_Score_1 +
                                             "\n\t" + test_Score_2 + 
                                             "\n\t" + test_Score_3 +
                                             "\n\tYour average is: " + average);
         System.exit(0);
                                    
                                             
     }
     
}                                        
                                             
                                    





