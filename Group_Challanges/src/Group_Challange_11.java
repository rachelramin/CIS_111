//Rachel Amin, Bradley Sloane, Leah Day
//Group challange 11
//3 racer names, their time in min, their average speed, How long was the race(miles), 

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Group_Challange_11
{


   public static void main(String[] args)
   {
      DecimalFormat formatter = new DecimalFormat("#0.00");
      
      String input, name_1, name_2, name_3;
      double time_1, time_2, time_3, race_length;
      
      //ask for name
      input = JOptionPane.showInputDialog("What is the name of racer 1?");
             name_1 = input; 
             
      input = JOptionPane.showInputDialog("What is the name of racer 2?");
             name_2 = input; 
             
      input = JOptionPane.showInputDialog("What is the name of racer 3?");
             name_3 = input; 
             
       //ask for race length
        input = JOptionPane.showInputDialog("What was the distance of the race in miles?");
             race_length = Double.parseDouble(input); 
      
             
      //ask for runners times
       input = JOptionPane.showInputDialog(name_1 + " What was your time in minutes?");
             time_1 = Double.parseDouble(input); 

       input = JOptionPane.showInputDialog(name_2 + " What was your time in minutes?");
             time_2 = Double.parseDouble(input); 
        
       input = JOptionPane.showInputDialog(name_3 + " What was your time in minutes?");
             time_3 = Double.parseDouble(input); 
             
           
        //calculate average
        double average;
        
        average = (time_1 + time_2 + time_3) / 3;
        
        if(time_1 < time_2 )
        {
            if(time_1 < time_3)
            {
               if(time_2 < time_3)
               {
                  JOptionPane.showMessageDialog(null, "First place: " + name_1 + " " + time_1 + " minutes" +
                                               "\n Second place: " + name_2 + " " + time_2 + " minutes" +
                                               "\n Third place: " + name_3 + " " + time_3 + " minutes" +
                                               "\n\n Average time: " + average + " minutes" + 
                                               "\n Race distance: " + race_length + " miles");
                   System.exit(0);
            
               }
           
               if(time_3 < time_2)
               {
                  JOptionPane.showMessageDialog(null, "First place: " + name_1 + " " + time_1 + " minutes" +
                                               "\n Second place: " + name_3 + " " + time_3 + " minutes" +
                                               "\n Third place: " + name_2 + " " + time_2 + " minutes" +
                                               "\n\n Average time: " + average + " minutes" + 
                                               "\n Race distance: " + race_length + " miles");
                  System.exit(0);                             
               }
                                         
             }
             
            if(time_1 > time_3)
            {
               JOptionPane.showMessageDialog(null, "First place: " + name_3 + " " + time_3 + " minutes" +
                                               "\n Second place: " + name_1 + " " + time_1 + " minutes" +
                                               "\n Third place: " + name_2 + " " + time_2 + " minutes" +
                                               "\n\n Average time: " + average + "minutes" +
                                                "\n Race distance: " + race_length + " miles");
                  System.exit(0);                             

            }  
          }
         
         
        if(time_2 < time_1 )
        {
            if(time_2 < time_3)
            {
               if(time_1 < time_3)
               {
                  JOptionPane.showMessageDialog(null, "First place: " + name_2 + " " + time_2 + " minutes" +
                                               "\n Second place: " + name_1 + " " + time_1 + " minutes" +
                                               "\n Third place: " + name_3 + " " + time_3 + " minutes" +
                                               "\n\n Average time: " + average + " minutes" + 
                                               "\n Race distance: " + race_length + " miles");
                   System.exit(0);
            
               }
           
               if(time_3 < time_1)
               {
                  JOptionPane.showMessageDialog(null, "First place: " + name_2 + " " + time_2 + " minutes" +
                                               "\n Second place: " + name_3 + " " + time_3 + " minutes" +
                                               "\n Third place: " + name_1 + " " + time_1 + " minutes" +
                                               "\n\n Average time: " + average + " minutes" + 
                                               "\n Race distance: " + race_length + " miles");
                  System.exit(0);                             
               }
                                         
             }
             
            if(time_2 > time_3)
            {
               JOptionPane.showMessageDialog(null, "First place: " + name_3 + " " + time_3 + " minutes" +
                                               "\n Second place: " + name_2 + " " + time_2 + " minutes" +
                                               "\n Third place: " + name_1 + " " + time_1 + " minutes" +
                                               "\n\n Average time: " + average + " minutes" + 
                                               "\n Race distance: " + race_length + " miles");
                  System.exit(0);                             

            }  
          }
 
        if(time_3 < time_1 )
        {
            if(time_3 < time_2)
            {
               if(time_1 < time_2)
               {
                  JOptionPane.showMessageDialog(null, "First place: " + name_3 + " " + time_3 + " minutes" +
                                               "\n Second place: " + name_1 + " " + time_1 + " minutes" +
                                               "\n Third place: " + name_2 + " " + time_2 + " minutes" +
                                               "\n\n Average time: " + average + " minutes" + 
                                               "\n race distance: " + race_length + " miles");
                   System.exit(0);
            
               }
           
               if(time_2 < time_1)
               {
                  JOptionPane.showMessageDialog(null, "First place: " + name_3 + " " + time_3 + " minutes" +
                                               "\n Second place: " + name_2 + " " + time_2 + " minutes" +
                                               "\n Third place: " + name_1 + " " + time_1 + " minutes" +
                                               "\n\n Average time: " + average + " minutes"+
                                               "\n Race distance: " + race_length + " miles");
                  System.exit(0);                             
               }
                                         
             }
             
            if(time_3 > time_2)
            {
               JOptionPane.showMessageDialog(null, " First place: " + name_2 + " " + time_2 + " minutes" +
                                               "\n  Second place: " + name_3 + " " + time_3 + " minutes" +
                                               "\n  Third place: " + name_1 + " " + time_1 + " minutes" +
                                               "\n\n Average time: " + average + " minutes" + 
                                               "\n Race distance: " + race_length + " miles");
                  System.exit(0);                             

            }  
          }
  
        
        
        
        
        
        
        
        
                
     }
     
   }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   