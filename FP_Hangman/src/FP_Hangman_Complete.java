/*
Rachel Amin,Leah Day, Bradley Sloane, Patrick M. Hennessey
Final Project Hangman

*/
import javax.swing.JOptionPane;//needed to use JOptionPane
import java.util.Random;//need to slect a random number to pick the word.
import java.util.Scanner;//needed to accept the input for text file
import java.io.*;//need for text file.
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class FP_Hangman_Complete
{ //remember to close after program is done.      
       
	//varibles that will work throughout the code, rguardless of the method it is called in.
   //boolean that checks in the main while loop of the code.
	private static boolean exit = false;
   //incrmenter that determins what stage of the code you are on.
	private static int stage = 0;
	
   //Tracks your amoutn of tries you have left.
	private static int tries = 0;
   //The number of tries you get in each mode.
	private static int triesEasyAmount = 6;
	private static int triesHardAmount = 3;
	
   //Strings that save the result of your game.
	private static String gameResult = "";
   //String for if you win or loose the game.
	private static String gameWin = "You won..Congrats!";
	private static String gameLose = "You have run out of tries.  The word was:  ";
	
   //String that saves the slected word.
	private static String word = "";
   //The character that hides the letters in the word form the user.
	private static String maskCharacter = "*";
   //The booean array that trigers the switch from maskCharacter to letter.
	private static boolean[] wordMask;
   
   //Int that will store if the number of wins and losses to be stored in txt file.
   private static int win = 0;
	private static int loose = 0;
   
   //String to save guesses.
	private static String guesses = "";
   
   //allows the edit text file to run in a loop as long as the user wants to.
   private static boolean done = false;
	  
    public static void main(String[] args) throws IOException
	{	//main method open
      //While exit is not true ( exit == false )	
		while(!exit)
		{
         // Update List/Starting Stage
			if(stage <= 0) 
			{
            //calls to list edit method.
				ListEdit();
            //incraments stage.
				stage++;
			}
         //mode select stage.
			else if (stage <= 1)
			{
            //calls to SetMode method.
				SetMode();
			}
         //word slect stage.
			else if (stage <= 2)
			{
				// Calls to the word sclection method, which will return the string "Word".
				WordSelect();
            //incrments stage.
				stage++;
			}
         //actual game play stage.
			else if (stage <= 3)
			{
            //calls to the play game method.
				PlayGame();
			}
         //replay stage.
			else if (stage <= 4)
			{
            //class to the replay game method.
				ReplayGame();
			}
		}
   
		System.exit(0);      
   }//main method close. 
        
        public static void ListEdit()
		{
			String change = JOptionPane.showInputDialog("Would you like to edit the text file? Please enter Y for yes or" +
                                                      " enter to move on.");
      
			if ( change.trim().equalsIgnoreCase("y") )
			{//if statement 1 open
            
            try
            {                                               
            WordEdit();
            }catch (IOException ioe)
            {
            
            }   
      
				      
			}//if statement 1 close 
		}
		
		public static void SetMode()
      //Asks the user how they would like to play, and incraments the stage after the selection.
		{
			String mode = JOptionPane.showInputDialog(" How would you like to play?\n Easy or Hard mode?");

			if ( mode.trim().equalsIgnoreCase("easy") )
			{
            //sets the tries equal to the predetermined amount for the mode.
				tries = triesEasyAmount;
				stage++;
			}
         
			else if ( mode.trim().equalsIgnoreCase("hard") )
			{
            //sets the tries equal to the predetermined amount for the mode.
				tries = triesHardAmount;
				stage++;
			}
			
			 //Error Trap, for if the user enters nothing, or the wrong word.
			else if ( !mode.trim().equalsIgnoreCase("easy") && !mode.trim().equalsIgnoreCase("hard") )
			{
         
				JOptionPane.showMessageDialog(null,"That is not a vaild mode.");            
			}  
		}
		
		public static void PlayGame()
      //game play coe that calls to the displayword method to dispay output, asks user fora guess, and tests the guess.
		{  
         //Calls to displayWord, and saves the returned string from displayWord into a string for output.    
			String display = DisplayWord();
         //Ask user for guess while displaying the masked word and previous guesses.
			String input = JOptionPane.showInputDialog( display + "\n" + " Guesses: " + guesses  + "\nYou have " + tries +
                                                      " left." + "\n Please enter a letter. ");
         //calls to testguess while passing the input to test the inputed guess.
			TestGuess(input);
		}
	
		
		public static void ReplayGame()
      //Asks the user if they want to play he game. 
		{
         //display the result of the game.
			JOptionPane.showMessageDialog(null, gameResult);

         //Ask the user if they want to replay.
			String replay = JOptionPane.showInputDialog("Would you like to play again?\n Yes or No.");

			//call to exit program at end of main method.
			if(replay.trim().equalsIgnoreCase("no") )
			{

				JOptionPane.showMessageDialog(null,"Thank you for playing." + 
                                                "\nYour win and loose numbers are stored in the text file WinLoose.txt");
                                                
            //try-catch block used to handle exception that comes with creating, writing and closeing a text file in method.                                    
            try
            {                                               
            StoreWinLooses();
            }catch (IOException ioe)
            {
            
            }   
            
				exit = true;

			}
         
         //resets stage to 0 and restst saved guesses to blank
			else
			{
				stage = 0;
				guesses = "";
			}
			
		}
		
        public static void WordSelect() throws IOException 
        // reads words from txt into an array and select a random one( with random #) to send back to main. -Rachel 
        {         
			//counter 1.
			int index = 0;

			//counter 2.
			int counter = 0; 

			//sets up random number generator.
			Random randomNumber = new Random();

			//opens file
			File file = new File("WordList.txt");
			Scanner inputFile = new Scanner(file);   

			//counts the lines the file has. 
			while (inputFile.hasNext())
			{     
			String trash = inputFile.nextLine();       
			counter++; 

			}

			inputFile.close(); 

			//array to store the words from the list.
			String[] words = new String[counter];

			//opens file2
			File file2 = new File("WordList.txt");
			Scanner inputFile2 = new Scanner(file2); 
				
			//while the txt file has lines, he loop will continue to read the lines into the string array.
			while ( inputFile2.hasNext() && index < counter )
			{
				words[index] = inputFile2.nextLine();
				index++;
			}

			//slects the random number from array range.
			int number = randomNumber.nextInt(counter);

			//stores the word stored in the random aray adress into a string. 
			word = words[number];

			wordMask = new boolean[word.trim().length()];
			
			//close file2
			inputFile2.close();                  
        }
        
		public static String DisplayWord()
      //method determins if the display needs an asterick or a letter.
		{
         //char array that gets rewritten everytime the method is run. 
			char[] trash = new char[word.trim().length()]; 
			
         //for loop that runs for as long as the word is.
			for(int i = 0; i < word.trim().length(); i++)
			{
            // if boolean [] worMask at i is not true
				if(!wordMask[i])
				{
               //replace the character at i with the maskCharacter.(charAt(0), is used to ensure no syntax error as charMask
               //is a String).
					trash[i] = maskCharacter.charAt(0);
					
				}
            		
				else 
				{
               //replae the character at i with the letter at that place in the word. 
					trash[i] = word.charAt(i);   
					
				}	 
			}
         
         //turns char array into String ( String == char[] ) and returns it to playGame method.
         return new String(trash);
		}
		
		public static void TestGuess(String guess)
      //Method tests the input ( guess ) against previous guesses and the win/loose conditions.
		{
         //creates a character sequence to store the passed guess.    
  			CharSequence trash = guess.trim();
         
         //if the String guesses contains the char trash, gives error message and deducts a try.
			if(guesses.contains(trash))
			{
				JOptionPane.showMessageDialog(null,"You already enterd that letter");
				
				tries--;
			}
         
         //else the guesses does not contain the char trash
			else
			{
            //concatinates that guess onto guesses string.
				guesses = guesses + guess;
            //a boolean to check win/loose.
				boolean check = false;
		
				for(int i = 0; i < word.trim().length(); i++)
				{
               //if the char at i is the same as the guess the * will be replaced with the letter. Changes check to true. 
					if(word.charAt(i) == guess.charAt(0))
					{
						wordMask[i] = true;
						
						check = true;
					}
					
				}	
				
            //The guess was wrong, - 1 try.
				if(check == false)
				{
					tries--;
					
				}
			}
	      //Call to check if the word is complete.
			TestWinCondition();
         //Calls to check if the user ran out of tries.
			TestLoseCondition();
		}
		      
		public static boolean TestWinCondition()
      //Method tests to see if user completed the word and beat the game.
		{
			for(int i = 0; i < word.trim().length(); i++)
			{
            //If the boolean arry contains any falses, the user did not complete the word.
				if(wordMask[i] == false)
				{
					return false;
				}
				
			}
         //There is no falses in the array, therefore the word must have been completed 
			gameResult = gameWin;
         //inrament wins.
         win++;
         //inrament stage.
			stage++;
			return true;
		}
		
		public static boolean TestLoseCondition()
      //Method that test to see if user ran out of tries.
		{
         //If user runs out of tries, game result is a loos and the word is displayed.
			if (tries == 0)
			{
				gameResult = gameLose + word;
            loose++;
				stage++;
				return true;
			}
			
			return false;
			
		}
        
      public static void StoreWinLooses() throws IOException
      //Method that creates and writes win loss numbers into text file. 
      {
        //writes data into outout file.        
        PrintWriter outputFile = new PrintWriter("WinLoose.txt");
        outputFile.println("WINS    LOSSES");
        outputFile.println(win + "      " + loose);
        
        outputFile.close();
                
       
       
      } 
          
      public static void WordEdit() throws IOException
      // allows user to edit words in txt file.
      {
      
         while(!done)
         {
         String options = JOptionPane.showInputDialog("If you would like add a word to the list press A " +
                                                      "\nIf you would like to delete a word from the list press D"
                                                      + "\nIf you would like to return to the game type DONE");
                                                      
         if( options.trim().equalsIgnoreCase("done") )
         {
            done = true;
         }                                             
         
         else if( options.trim().equalsIgnoreCase("a") )
         {
          //opens the file and allows the user to append it, without ruining the text file.
          PrintWriter outputFile = new PrintWriter( new PrintWriter(new BufferedWriter(new FileWriter("WordList.txt", true))));
          String newWord = JOptionPane.showInputDialog("What word word you like to add?");
          outputFile.println(newWord);
          
          outputFile.close();

            
         } 
         else if ( options.trim().equalsIgnoreCase("d") )
         {//else if 2
            String words = "";
         
            //Opens the file.                     
            File file = new File("WordList.txt");
            Scanner inputFile = new Scanner(file);   

            //Read the file up to 5 lines.
            while (inputFile.hasNext())
            {
                           
               words = words + inputFile.nextLine() + "\n";         
            
            }
         
            //get input on the word user wants to delete.
            String eliminatedWord = JOptionPane.showInputDialog( words + "\nPlease enter the word you wan to delete." );
         
            //close file.
            inputFile.close();
            
            //reopens file, and creates a new file.        
            File inputFile2 = new File("WordList.txt");
            File tempFile = new File("TempWordlist.txt");
   
            //insilizes a reader and writer for the parent file and new file.
            BufferedReader reader = new BufferedReader(new FileReader(inputFile2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
   
            String line;
   
            //While loop that reads each line fo the text file into the temp file
            //but does not read in the string that the user wants deleted.
            while((line = reader.readLine()) != null)
            {
               String trimmedLine = line.trim();
               if(trimmedLine.equals(eliminatedWord)) continue;
               writer.write(line);
               writer.newLine();
               
               
             }
    
            //all readers, file and writers are closed, and the temp file is 
            //renamed after its parent file after the parent file is deleted.
            reader.close();
            writer.close();
            inputFile2.delete();
            tempFile.renameTo(inputFile2);
         
         } 
         
         else
         //error trap.
         {
            JOptionPane.showMessageDialog(null,"That is not a valid option.");
         
         }                                           

              
        }   
      }     
           
           
           
           
}//close class.        