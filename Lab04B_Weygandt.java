// Aidan Weygandt 10.7.21
// Purpose of Program: 
// Create a palindrome class the determines if a word is 
// the same, or almost the same, forwards and backwards 
import java.util.Scanner;

class Lab04B_Weygandt{
  


  public static void main(String[] args){
    Lab04B_Palindrome_Weygandt Palindrome = new Lab04B_Palindrome_Weygandt();//creates object of palindrome class for checking strings
    Scanner input = new Scanner(System.in);
    boolean notFinished = false;
    do{// loops until user inputs anything other than a Y when asked to repeat
        System.out.print("Enter a string  ===>>  ");
        String str = input.nextLine();//user enters a string for this variable
        System.out.println();
        System.out.println("Entered String:     " + str);
        System.out.println("Palindrome:         " + Palindrome.isPal(str));
        System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));   
        System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
        String repeat = input.nextLine();
        notFinished = (repeat.equals("Y"));
        System.out.println();
    }
    while (notFinished);
  }
}