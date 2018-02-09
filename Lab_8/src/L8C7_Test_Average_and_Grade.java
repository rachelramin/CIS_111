//Rachel Amin
//Lab 8 Challange 7
//Test average and grade

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//import java.util.Random;
//import java.io.*;

public class L8C7_Test_Average_and_Grade
{
       
       
     public static void main(String[] args)
     {  
     
         String output = "", input, grade;
         double score1,score2, score3, score4, score5, average = 0;
          
         input = JOptionPane.showInputDialog("What was the score for test 1?");
               score1 = Double.parseDouble(input);
               
         input = JOptionPane.showInputDialog("What was the score for test 2?");
               score2 = Double.parseDouble(input);
      
         input = JOptionPane.showInputDialog("What was the score for test 3?");
               score3 = Double.parseDouble(input);

         input = JOptionPane.showInputDialog("What was the score for test 4?");
               score4 = Double.parseDouble(input);

         input = JOptionPane.showInputDialog("What was the score for test 5?");
               score5 = Double.parseDouble(input);

         

        average = calcAverage(score1, score2, score3, score4, score5);
        
        
       
         //1            
         grade = determineGrade(score1); 
              
         output = output + " Your grade for test 1 is an " + grade + "\n\n"; 
         
         //2
         grade = determineGrade(score2); 
              
         output = output + " Your grade for test 2 is an " + grade + "\n\n"; 
         
         //3
         grade = determineGrade(score3); 
              
         output = output + " Your grade for test 3 is an " + grade + "\n\n"; 
         
         //4
         grade = determineGrade(score4); 
              
         output = output + " Your grade for test 4 is an " + grade + "\n\n"; 
         
         //5
         grade = determineGrade(score5); 
              
         output = output + " Your grade for test 5 is an " + grade + "\n\n"; 
         
         

        JOptionPane.showMessageDialog(null,output + "The average is " + average); 
       
       System.exit(0);  
         
      }

       public static double calcAverage ( double score1, double score2, double score3, double score4, double score5 )
       {
         double average, summ;
         
         
            summ = score1 + score2 + score3 + score4 + score5;
         
            average = summ / 5;
       
         return average;
         
       }



       public static String determineGrade ( double score)
       {
         String grade;
         
         if( score >= 90 && score <= 100)
         {
            grade = "A";
         }
         
         else if ( score >= 80 && score <= 89)
         {
            grade = "B";
         } 
       
         else if ( score >= 70 && score <= 79)
         {
            grade = "C";
         }
         
         else if ( score >= 60 && score <= 69)
         {
            grade = "D";
         }
         
         else if (score > 100 )
         {
            grade = "N/A";
         }
         
         else 
         {
            grade = "F";
         }

         return grade;

       }
       
       
}       