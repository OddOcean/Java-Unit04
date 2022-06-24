// Aidan Weygandt 10.5.21
// Purpose of Program: 
// take in length of three sides of triangle and output:
// if side lengths meet Triangle Inequality Theorem
// if triangle is isosceles, equilateral, or scalene
// if scalene triangle output if right angle or not
// isosceles 5 7 7
// equilateral 6 6 6
// scalene 5 7 8
// right scalene 3 4 5

import java.util.*;//imports entire utility function so i can use sorting features

class Lab04A_Weygandt{
  public static int side1 = 0;//three lengths for edges of the triangle
  public static int side2 = 0;
  public static int side3 = 0;  
  //main method is just a fact of the Java life
  public static void main(String[] args){
    enterData();
    System.out.print("\n");
    printTriangleType(side1, side2, side3);
  }

  //takes input of three integer variables that are the lengths of three sides of a triangle
  //will make sure that the three lengths meet the triangle inequality theorem 
  //will printout if the triangle is isosceles, equilateral, or scalene, and if it is scalene
  //it will output if it is a right triangle or not
  public static void printTriangleType(int s1, int s2, int s3){
      int [] sides = {s1, s2, s3};
      Arrays.sort(sides);
      
      if ((sides[0] + sides[1]) > sides[2] & (sides[0] + sides[2]) > sides[1] & (sides[1] + sides[2]) > sides[0]){//checks if sides make up a real triangle, else prints that it isnt a triangle
         if (sides[0] == sides[1] & sides[1] == sides[2]){//checks if all three sides are the same incase triangle is equilateral
            System.out.print("Your triangle is equilateral\n");
         }else if(sides[0] == sides[1] | sides[1] == sides[2]){//compares two sides are similar to see if triangle is iscoceles
            System.out.print("Your triangle is an icosceles\n");
         }else if (Math.sqrt((sides[0]*sides[0]) + (sides[1]*sides[1])) == sides[2]){//checks if triangle is right using the pythagorean theorum
            System.out.print("Your scalene triangle is right\n");
         }else{//if not right then is it a scalene triangle
            System.out.print("Your scalene triangle is not right\n");
         }
      }else{
         System.out.print("This cannot make a triangle\n");
      }
  }// endprintTriangleType

  //gets user input of three int variables that are assigned to three class int class variables
  //makes sure the user has input an int and will output an error message if incorrect input
  //and ask for correct input again and correct input entered
  public static void enterData(){
      Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 1st side: ");
      while (!input.hasNextInt()){ //makes sure an int was entered
         input.nextLine(); //clear the invalid input before prompting again
         System.out.print("Please enter the side as an int (1,2,3): ");
      }
		side1 = input.nextInt();
      
      System.out.print("\nEnter the 2nd side: ");
      while (!input.hasNextInt()){ //makessure an int was entered
         input.nextLine(); //clear the invalid input before prompting again
         System.out.print("Please enter the side as an int (1,2,3): ");
      }
		side2 = input.nextInt();
      
      System.out.print("\nEnter the 3rd side: ");
      while (!input.hasNextInt()){ //makes sure an int was entered
         input.nextLine(); //clear the invalid input before prompting again
         System.out.print("Please enter the side as an int (1,2,3): ");
      }
		side3 = input.nextInt();
  }//end enterData
}