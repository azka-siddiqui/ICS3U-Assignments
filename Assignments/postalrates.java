/**
 * @Author: Azka Siddiqui       @Date: March 23, 2023
 * @class: postalrates
 * @Description: This program will prompt the user to enter the amount of letters they would like to post internationally
 * and then gives the cost per letter (dependent on the number of letters) and calcuates the total cost.
 */

 import java.util.Scanner;
 
 class postalrates{//open class
     public static void main(String[]args){//open main
 
         Scanner uI = new Scanner(System.in);//Instantiate scanner object

         //Variable declaration and initialization
         int costperletter = 0;
         int letters = 0;
         int totalcost = 0;

         //User input
         System.out.print("Welcome to Canada Post International Letters!\n\n**From anywhere... to anyone**\n\nHow many letters would you like? ");
         letters = uI.nextInt();//sets the contents of the scanner 

         //Program execution and program output
         if (letters > 0 && letters < 10){//test for # of letters (between 1-9)
            costperletter = 5; totalcost = 5*letters;
         } else if (letters > 9 && letters < 20){//test for # of letters (between 10-19)
            costperletter = 3; totalcost = 3*letters;
         } else if (letters > 19 && letters < 40){//test for # of letters (between 20-39)
            costperletter = 2; totalcost = 2*letters;
         } else if (letters > 39){//test for # of letters (40 or greater)
            costperletter = 1; totalcost = 1*letters;
         } 
         System.out.printf("The cost per letter is $%d\nThe total cost is $%d", costperletter, totalcost);
     }// close main 
}//close class

