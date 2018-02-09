//Rachel Amin,Leah Day, Bradley Sloane, Patrick M. Hennessey
//Final Project
//Hangman

import javax.swing.JOptionPane;//needed to use JOptionPane
import java.text.DecimalFormat;//
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class FP_Hangman
{
 //remember to close after program is done.      
       
     public static void main(String[] args) throws IOException
   {//main method open
    
     //local varibles for main method
      String mode, input, replay = "", word = "", change, result = "False",  done = "no";
      String guess;
      String output;
                  
      change = JOptionPane.showInputDialog("Would you like to edit the text file? Please enter Y for yes or enter to move on.");
      
      if ( change.trim().equalsIgnoreCase("y") )
      {//if statement 1 open
                  
          done = wordEdit();
      
      }//if statement 1 close 
      
      //do-while loop that will allow the user to replay the game once they finish their previous game.
      do 
      {//do-while 1 open.
      
        
        //do-while loop that will force the user to pick a mode.       
        do 
        {//do-while 2 open.
        
        
         mode = JOptionPane.showInputDialog(" How would you like to play?\n Easy or Hard mode?");
         
         //Easy mode
   if ( mode.trim().equalsIgnoreCase("easy") )
   {//if statment 2 open.
         
            // Calls to the word sclection method, which will return the string "Word".
            word = wordSelect();
           
            //Call to the word length method, which will return the integer "Word_length".
            int word_length = wordLengthTest( word );
            
            String[] display = new String[word_length];

            
            //while loop that will allow us to adujust the number of letters unguessed, and change the display to match. 
            do
            {//do-while loop 3 open
          
              output = displayTest( word_length );
              
              display = displayReturn ( word_length );
              
              //input = JOptionPane.showInputDialog( output + "\n Please enter a letter.");
              JOptionPane.showMessageDialog(null,word);
              
              int strikeCounter = 0; //sets the strike counter to zero
             
               while (strikeCounter < 6 )
               {//while loop 2 open.
               
               do
               {//do-while loop 3.
               
                  String[] letters = new String[26];
                  int i = 0;
                  String guesses = "";
                  
                        
                  guess = JOptionPane.showInputDialog( output + "\n" + " Guesses: " + guesses  + "\n Please enter a letter. ");
                  
                  for(int count = 0; count < i; count++)
                  {
                     guesses = guesses + "," + letters[i] + " ";
                  }

                                    
                  letters[i] = guess;
                  
                  JOptionPane.showMessageDialog(null, letters[i] );

                  
                  i++;
                  
                  //for loop that checks entered guess against previously entered guesses.
                  for( int counter = 0; counter < i; counter++ )
                  {
                     if( guess.trim().equalsIgnoreCase(letters[i]) )
                     {
                       JOptionPane.showMessageDialog(null,"You already enterd that letter");
                       
                       strikeCounter++; 
                     }
                                       
                  }

      
                  if( word.toLowerCase().contains(guess.toLowerCase()) ) //sets all the letters of both the letter and the word to lowercase to compare them
                  {//if statment 3 open.
         
                   output = revealLetter( display, word, guess );

                               
                  }//if statment 3 close
            
                  else if( !output.contains(guess) )
                  {//else statment 1 open
            
                     JOptionPane.showMessageDialog(null,"That letter is not in the word.");
                              
                     strikeCounter++; //adds 1 to the strike counter
            
                  }//else statment 1 close          
         
                  JOptionPane.showMessageDialog(null, output + "\nYou have " + (6 - strikeCounter) + " guesses left.\nPlease try again.");          
                           
               
               }while( output.contains("*") );//do-while loop 3 close.
               
               }//while loop 2 close
               
               //replay = JOptionPane.showInputDialog("You have run out of tries.\n your word was " + word 
                                                     //+ "\n Would you like to play again?\n Yes or No.");
               result = "true";
              
              }while( result.equalsIgnoreCase("false") );//do-while loop 3 close
             
   }//if statement 2 close.
               
               //end of easy mode.
   
   
                  
         //insert copy of easy mode where strike counter is set for 3 for hard mode.

               
               //replay question.
               JOptionPane.showMessageDialog(null,"You have run out of tries.");
               
               replay = JOptionPane.showInputDialog("Would you like to tries.\nYour word was " + word + " and play again?\n Yes or No.");
               
               //call to exit program at end of main method.
               if(replay.trim().equalsIgnoreCase("no") )
               {//if statement 4 open.
               
                 JOptionPane.showMessageDialog(null,"Thank you for playing.");
                 
                 System.exit(0);
                   
               }//if statment 4 close.
               
         
         //Error Trap, for if the user enters nothing, or the wrong word.
   else if ( !mode.trim().equalsIgnoreCase("easy") && !mode.trim().equalsIgnoreCase("hard") )
   {// else statment ( to go with first input ) open.
         
            JOptionPane.showMessageDialog(null,"That is not a vaild mode.");
         
            mode = JOptionPane.showInputDialog(" How would you like to play?\n Easy or Hard mode?");
            
   }//else statment close.  
             
                
       
      }while( mode.trim().equalsIgnoreCase("") );//do-while 2 close.
      
      }while ( replay.equalsIgnoreCase("yes") );//do-while 1 close.
      
   }//main method close. 
        
        
       
        public static String wordSelect() throws IOException //Loops are executing.
        // reads words from txt into an array and select a random one( with random #) to send back to main. -Rachel 
        {
         //return value
         String word;
         
         //counter 1.
         int index = 0;
         
         //counter 2.
         int counter = 0; 
                  
         //sets up random number generator.
         Random randomNumber = new Random();
         
         //opens file
         File file = new File("WordList.txt");
         Scanner inputFile = new Scanner(file);   
         //Scanner inputFile = new Scanner(file);
         
         //counts the lines the file has. 
         while (inputFile.hasNext())
         {     
               String trash = inputFile.nextLine();       
               counter++; 
               
         }
         

         inputFile.close(); 
         
         
         
         //array to store the words from the list.
         String[] words = new String[counter];
   
         //opens file
         File file2 = new File("WordList.txt");
         Scanner inputFile2 = new Scanner(file); 
                            
         //while the txt file has lines, he loop will continue to read the lines into the string array.
         while ( inputFile2.hasNext() && index < counter )
         {
            words[index] = inputFile2.nextLine();
            index++;
         
         }
         
         
         //slects the random number from array range.
         int number = randomNumber.nextInt(index);
         
         //stores the word stored in the random aray adress into a string. 
         word = words[number];
         
         //close file
         inputFile.close();
         
         //send word back to main method.
         return word;
                  
        }
        
        
        public static String wordEdit() throws IOException
         // allows user to edit words in txt file. - Leah
        {
            String input = "", Y = "", N = "", done = "";
     
         //an array for the list of words 
         String[] HangmanWords = new String[10];
              HangmanWords[0] = "dog";
              HangmanWords[1] = "cat";
              HangmanWords[2] = "frog";
              HangmanWords[3] = "toad";
              HangmanWords[4] = "tiger";
              HangmanWords[5] = "hyena";
              HangmanWords[6] = "coyote";
              HangmanWords[7] = "gorilla";
              HangmanWords[8] = "spider";
              HangmanWords[9] = "giraffe";
      
      //print out the list of words
      System.out.println(HangmanWords[0] + "\n" + HangmanWords[1] + "\n" + HangmanWords[2] + "\n" + 
                         HangmanWords[3] + "\n" + HangmanWords[4] + "\n" + HangmanWords[5] + "\n" +
                         HangmanWords[6] + "\n" + HangmanWords[7] + "\n" + HangmanWords[8] + "\n" +
                         HangmanWords[9]);
          //ask the user if they would like to add a different word 
          input = JOptionPane.showInputDialog( "Would you like to add a word? Enter Y for Yes, N for No");
                     //Y = Input;
                     //N = Input;
            
            

            //if the user enters Y(yes)
            if ( input.equalsIgnoreCase("Y") )
               {
                  input = JOptionPane.showInputDialog( "Enter a different word");
                        //Y=Input;
                             
               }
               
            //if the user enters N(no)   
           else if ( input.equalsIgnoreCase("N") )
               {
                  
                  done = JOptionPane.showInputDialog("Continue to game?\n Yes or No.");
                  
                  if( done.trim().equalsIgnoreCase("yes") )
                  {
                     return done;
                  }
                  
                  else if ( done.trim().equalsIgnoreCase("no") )
                  {
                        
                     System.exit(0);
                  
                  }
               }
                  
                
            //ask the user if they would like to delete a word
            input = JOptionPane.showInputDialog( "Would you like to delete a word? Enter Y for Yes, N for No");
                     //Y = Input;
                     //N = Input;

       
            //if the user enters Y(yes)
            if (input.equalsIgnoreCase("Y"))
               {
                 input = JOptionPane.showInputDialog( "Enter the word you would like to delete");
                        //Y=Input;
                       
                     
               }
            //if the user enters N(no)   
            if (input.equalsIgnoreCase("N"))
               {
                  done = JOptionPane.showInputDialog("Continue to game?\n Yes or No.");
                  
                  if( done.trim().equalsIgnoreCase("yes") )
                  {
                     return done;
                  }
                  
                  else
                  {
                        
                     System.exit(0);
                  
                  }

               
               }         
         return done; 
        }//end wordEdit();
        

        public static int wordLengthTest( String word )
        // ditermines the number of characters within the String that was randomly slected. - Pat
        {
         int word_length;
         
         word_length = word.trim().length();
         
         return word_length;
            
        
        }
        
        public static String displayTest ( int word_length )//method works.
        //ditermine the number of * to put in display, and cancatinate the out put to display all of them.
        {
            //word_length = word_length + 1;        
          String output = "";
          String[] display = new String[word_length];
          int i = 0;

          while ( i < word_length )
          {
            display[i] = "*";
            
            output = output + display[i] + " ";
            
            
            i++;  
          }
          
          return output;
        
        
        }
        
        public static String[] displayReturn ( int word_length )//method works.
        //ditermine the number of * to put in display, and cancatinate the out put to display all of them.
        {
            //word_length = word_length + 1;        
          String output = "";
          String[] display = new String[word_length];
          int i = 0;

          while ( i < word_length )
          {
            display[i] = "*";
            
            output = output + display[i] + " ";
            
            
            i++;  
          }
          
          return display;
        
        }

        
        public static String revealLetter(String[] display, String word, String guess)//reveals letter stored in the string.
        {
        
        String output = "";
        int numOfLetters = 0; //how many times a letter will appear in the word
        
        
        for (int i = 0; i < word.length(); i++) //compare letter of Word at i with letter 
        {
           if ( word.charAt(i) == guess.charAt(0) ) //changes asterisk to letter

           {
               numOfLetters = i;
               
               
               
                
           }//end if
            
        }//end for loop
        
        display[numOfLetters] = guess;
        
        JOptionPane.showMessageDialog(null,display[numOfLetters]);
        
                
        return display [numOfLetters];
       }

              
        
        
     




}//close class.        