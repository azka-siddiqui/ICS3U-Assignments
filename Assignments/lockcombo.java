/***********
 * @Author: A. Siddiqui      @Date: 3/20/2023
 * @Instructor: A. Carreiro
 * @Class: recap
 * @Description: This progrm will recap many things we have learned thus far
 * This program will generate a random combination for two types of locks
 */

 import java.util.Scanner;
 
class recap{
    public static void main(String [] args){
         
        Scanner uI = new Scanner(System.in);
 
        // Variable declaration and initialization
        String name = "";// name is a reference variable, not stored in a stack
        int choice = 0;// initialization for the loop sentinel variable
        int combo1 = -1, combo2 = -1, combo3 = -1;// primitive integer type
 
        // User input
        System.out.print("Please enter your name: ");
        name = uI.nextLine();// sets the contents of the scanner

        while (choice < 1 || choice > 2){// test

        System.out.println("What type of lock would you like a combo for? ");
        System.out.println("1. Master");
        System.out.println("2. Dudley");
        choice = uI.nextInt();// update

        }//end while
 
    // Program execution
    //The following statements will generate lock combinations

        if (choice == 1){//generate three random numbers
            combo1 = (int) (Math.random()*40);
            combo2 = (int) (Math.random()*40);
            combo3 = (int) (Math.random()*40);

        } else if (choice ==2){
            combo1 = (int) (Math.random()*60);
            combo2 = (int) (Math.random()*60);
            combo3 = (int) (Math.random()*60);

        }else{
            System.out.println("Invalid selection");
        }

         // Program output

        System.out.printf("Hi %s, your lock combination is %d-%d-%d.", name, combo1, combo2, combo3);
 
 
    }//ends the main ()
 
}//ends the Main (class starts with a capital letter)