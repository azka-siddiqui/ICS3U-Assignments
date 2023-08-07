/****
 * @Name: Azka Siddiqui                     @Date: April 18, 2023
 * @Description: This program will display three menu items
 * One menu item will generate a random number, the other will ask the user for their name, and the last will display the number and the name
 */ 

import java.util.Scanner;
class Task1switch {
    public static void main (String [] args){

        Scanner uI = new Scanner(System.in);
 
         //Variable declaration and initialization
         String userchoice = "";
         String name = "";
         int random = 0;
         String again = "";

        do {
            userchoice = uI.nextLine();//dumps scanner
            do {
             System.out.println("------------- MENU: PLEASE SELECT ONE -----------------\n1. Generate a random number\n2. Input name\n3. Display number and name");
             userchoice = uI.nextLine();
             userchoice = userchoice.toLowerCase();

             switch (userchoice){
                case "generate a random number":
                    random = (int)(Math.random()*11+1);
                    System.out.println("Your random number has been generated!");
                    break;
                case "input name":
                    System.out.print("Please enter your name: ");
                    name = uI.nextLine();
                    System.out.println("Thank you for entering your name!");
                    break;
                case "display number and name":
                    if ((name.equalsIgnoreCase(""))|| random==0) {
                    System.out.println("Please enter a name and number by choosing options 1 and 2 first.");
                    } else {
                    System.out.printf("Your number is %d and your name is %s.\n", random, name);
                    }
                    break;
                default:
                    System.out.println("Invalid input entered.");
                    break;
                }
            } while (!(userchoice.equals("generate a random number")||userchoice.equals("input name")||userchoice.equals("display number and name")));
        
          System.out.println("\nWould you like to choose again? \"Yes\" or \"No\""); 
          again = uI.next();

         if((again.equalsIgnoreCase("No"))||(!(again.equals("yes")))){
         System.out.println("Goodbye!"); 
        }

    } while ((again.equalsIgnoreCase("yes")));

}
}