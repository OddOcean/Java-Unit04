// Aidan Weygandt 10.7.21
// Purpose of Program: 
// Create a palindrome class the determines if a word is 
// the same, or almost the same, forwards and backwards 
class Lab04B_Palindrome_Weygandt
{
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
    * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
	 */
   public void Lab04B_Palindrome_Weygandt(){
   }
   
	public static boolean isPal(String s){// returns boolean depending on if string passed into it is a palindrome
      String palindrome = "";
      for (int i = s.length() - 1; i >= 0; i--){//creates palindrome of string by counting through it backwords
         palindrome = palindrome + s.charAt(i);
      }
      if (palindrome.equals(s)){//compares palindrome with original string, returns true if they match, else it returns false
         return true;
      }
      return false;
	}
   
   /*
	 * Precondition:  s is a String of one character.
	 * Postcondition: The value of true is returned if s is a letter and false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
   private static boolean isLetter(char letter)//checks if input is a letter and returns boolean
   {
      boolean isChar = java.lang.Character.isLetter(letter);//if letter is a letter isChar is true, else false
      return isChar;//returns isChar
   }
   
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	private static String purge(char s){// is used by almostpal to replace non letters with empty space
      if (isLetter(s)){
         return String.valueOf(s);
      }else{
         return "";
	   }
   }
   
   /*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: After purging all non-letter characters from s,
	 *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	public static boolean almostPal(String s){//if only the letters in the string create a palindrome then this method returns true, else false
      String palindrome = "";
      String purged = "";
      for (int i = s.length() - 1; i >= 0; i--){//creates purged palindrome of string by adding only letters in reverse order to a new string
         palindrome = palindrome + purge(s.charAt(i));
      }
      
      for (int i = 0; i < s.length(); i++){//creates purged version of string for comparing
         purged = purged + purge(s.charAt(i));
      }
      
      if (palindrome.equals(purged)){//if purged string and purged palindrome match then return true, else false
         return true;
      }
      return false;
	}
}