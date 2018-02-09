//Rachel Amin
//Exam 2 
//semester report

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//import java.util.Scanner;
import java.io.*;

public class Ex2_Semester_Report
{

                                          //Needed to read/write a file.
   public static void main(String[] args) throws IOException
   {
      String input, name_first, name_last, term, result;
      double gpa, credit_total;
      int classes;
      
       //Format for output.   formatter.format(variable)
      DecimalFormat formatter1 = new DecimalFormat("#0.0");
      DecimalFormat formatter2 = new DecimalFormat("#0.00");
      
      //askd and checks for first name
      input = JOptionPane.showInputDialog("What is your first name?");
      if(input.trim().equals(""))
      {
         input = JOptionPane.showInputDialog("Please enter your first name.");
      
      }
      
      name_first = input;  
      
      //asks and checks for first name.
      input = JOptionPane.showInputDialog("What is your last name?");
      if(input.trim().equals(""))
      {
         input = JOptionPane.showInputDialog("Please enter your last name.");
      
      }
      
      name_last = input; 
      
      //asks and check for school term.
      input = JOptionPane.showInputDialog("What is your term are you calculating?\n ex: Fall2016.");
      if(input.trim().equals(""))
      {
         input = JOptionPane.showInputDialog("Please enter your term. \n ex: Fall2016.");
      
      }
      
      term = input;   
  
      //asks and checks for blank,negitive or invalid number of classes.
      classes = classesCheck();
      
      //asks and checks the course names.
      String[] course = new String[classes];
      
      for ( int i = 0; i < course.length; i++)
         {
            input = JOptionPane.showInputDialog("What was the name of class number " + i+1 + "?");
            
            if(input.trim().equals(""))
            {
               input = JOptionPane.showInputDialog("That entry was blank. Pleases enter a course.");
            }
               course[i] = input;
               
         }
         
         //asks and checks the credits for each class.
         double[] credits = new double[classes];
         credits = creditsCheck(classes);
         
         //finds tatal amount of credits taken in the semester.
         credit_total = creditTotalCalculator(credits);                  
         
         //asks and checks grades for each class.
         double[] grades = new double[classes] ;
         grades = gradesCheck(classes);

         //calculates the gpa.
         gpa = gpaCalculator( grades, credits, credit_total, classes );
 
        //Checks the result of the gpa (adp, normal, deans list). 
         result = resultCheck(gpa);
         
         //write data into output file.
         PrintWriter outputFile = new PrintWriter("StudentReport.txt");
         outputFile.println("MONTGOMERY COUNTY COMMUNITY COLLAGE");
         outputFile.println("STUDENT SEMESTER REPORT FILE");
         outputFile.println(" ");
         outputFile.println("Student Name: " + name_last + "," + name_first);
         outputFile.println("Term/Year: " + term);
         outputFile.println(" ");
         outputFile.println("CLASS               CREDITS        GRADE");
         outputFile.println("=====================================================");
      
         for(int i = 0; i < classes; i++)
         {
            outputFile.println(course[i] + "             "  + formatter1.format(credits[i]) + "         " + formatter1.format(grades[i]));
         }
      
         outputFile.println("  ");
         outputFile.println("GPA: " + formatter2.format(gpa));
         outputFile.println("Status: " + result);
      
         outputFile.close();
         
         //output data in JOptionPane.
         JOptionPane.showMessageDialog(null,"Student name: " + name_last + "," + name_first + "\n Term: " + term + "\n Totla Credits "
                                             + formatter1.format(credit_total) + "\n GPA: " + formatter2.format(gpa)
                                             + "\n Student preformance status: " + result);
                                             
         System.exit(0);                                    
 
          

   }
   
   
   //Checks that the values entered classes are valid.
   public static int classesCheck()
   {
      String input;
      int classes;  
   
      input = JOptionPane.showInputDialog("How many classes are you taking?");
      if(input.trim().equals(""))
      {
         input = JOptionPane.showInputDialog("Please enter your number of classes.");
      
      }
      
      classes = Integer.parseInt(input); 
      
      if ( classes < 0 )
      {
        input = JOptionPane.showInputDialog("You cannot yake negitive classes. Please renter you number of classes.");
        
        if(input.trim().equals(""))
      {
         input = JOptionPane.showInputDialog("Please enter your number of classes.");
      
      }
         
        classes = Integer.parseInt(input);  
 
      }  
      
      return classes;
   
   }
   
   
   //Checks that the values entered for credits are valid.
   public static double[] creditsCheck( int classes )
   {
      String input;
      double[] credits = new double[classes];
      
      for ( int i = 0; i < credits.length; i++)
         {
            input = JOptionPane.showInputDialog("How many credits was class number " + i+1 + " worth?\n up to 1 decimal place ex: 3.5.");
            
            if(input.trim().equals(""))
            {
               input = JOptionPane.showInputDialog("That entry was blank. Pleases enter a credit value.\n up to 1 decimal place ex: 3.5.");
            }
            
            credits[i] = Double.parseDouble(input);
               
            if(credits[i] < 0 )
            {
             input = JOptionPane.showInputDialog("That entry was invalid. Pleases enter a credit value.\n up to 1 decimal place ex: 3.5.");
              
            if(input.trim().equals(""))
            {
               input = JOptionPane.showInputDialog("That entry was blank. Pleases enter a credit value.\n up to 1 decimal place ex: 3.5.");
            }
            
            credits[i] = Double.parseDouble(input);  
  
           }  
                          
         }
         
      return credits;
   }

   //Calculate total amount of credits taken.
   public static double creditTotalCalculator( double[] credits )
   {
      double credit_total = 0;
      
      for( int i = 0; i < credits.length; i++)
      {
         credit_total = credit_total + credits[i];
      }
      
      return credit_total;  
   }
   
   
   //Checks that th values entered for grades are valid.
   public static double[] gradesCheck( int classes )
   {
      String input;
      double[] grades = new double[classes];
      
      for ( int i = 0; i < grades.length; i++)
         {
            input = JOptionPane.showInputDialog("What was your grade in class number " + i+1 + "?\n up to 1 decimal place ex: 87.6.");
            
            if(input.trim().equals(""))
            {
               input = JOptionPane.showInputDialog("That entry was blank. Pleases enter a grade.\n up to 1 decimal place ex: 87.6.");
            }
            
            grades[i] = Double.parseDouble(input);
               
            if(grades[i] < 0 )
            {
             input = JOptionPane.showInputDialog("That entry was invalid. Pleases enter a grade.\n up to 1 decimal place ex: 87.6.");
              
            if(input.trim().equals(""))
            {
               input = JOptionPane.showInputDialog("That entry was blank. Pleases enter a grade.\n up to 1 decimal place ex: 87.6.");
            }
            
            grades[i] = Double.parseDouble(input);  
  
           }     
                          
         }
      
      return grades;  
   }
   
   
   // calculates gpa based off grades and credits.
   public static double gpaCalculator ( double[] grades, double[] credits, double credit_total, int classes )
   {
      double gpa;
      double[] quality_points = new double[classes];
      double product, summ = 0;
             
     for(int i = 0; i < grades.length ; i++)
     {
         if( grades[i] >= 89.5 )
         {
            quality_points[i] = 4.0;
         }  
     
         else if( 89.5 >= grades[i] && grades[i] >= 79.5 )
         {
            quality_points[i] = 3.0;
         } 
         
         else if( 69.5 <= grades[i] && grades[i] <= 79.0 )
         {
            quality_points[i] = 2.0;
         }  
 
         else if( 59.5 <= grades[i] && grades[i] <= 69.0 )
         {
            quality_points[i] = 1.0;
         }  

         else
         {
            quality_points[i] = 0.0;
         }
           
         product = quality_points[i] * credits[i];
         
         summ = product + summ;
         
     }
      
    gpa = summ / credit_total;  
      
    return gpa;  
   }
   
   //Check what the result of the students gpa is. 
   public static String resultCheck ( double gpa )
   {
      String result = "";
      
      if( gpa < 1.75 )
      {
         result = "Acidemic Probation";
      }
      
      else if ( gpa < 3.65 && gpa >= 1.75 )
      {
         result = "Normal Standing";
      }
      
      else if ( gpa >= 3.65 )
      {
         result = "Deans List";
      }
      
      return result;
   }
   
         
}   
   
   
   
   