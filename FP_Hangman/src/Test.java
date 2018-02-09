public class Test
{
   public static void main(String[] args)
   {
      String [] word=new String[5];
      word[0]="h";     
      word[1]="e";
      word[2]="l";
      word[3]="l";
      word[4]="o";
      String typed="o";
      boolean ifused;
      ifused=usedletter(word,typed);
      
      if(ifused == true)
      {
         System.out.println("True");
         //strike out
         //add to hangman
      }


   }
   
   public static boolean usedletter(String []currentarray,String letter)
   
   {
      for(int i=0;i<currentarray.length;i++)
      {
         
         if(currentarray[i].equalsIgnoreCase(letter))
         {
            return true;
         }
      }
      return false;
   }


}
