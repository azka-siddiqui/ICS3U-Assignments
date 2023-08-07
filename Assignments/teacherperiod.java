/***********
 * @Author: A. Siddiqui      @Date: 3/21/2023
 * @Instructor: A. Carreiro
 * @Class: march21
 * @Description: This program will find what class you have in a given period
 */

import java.util.Scanner;
 
class march21 {
    public static void main(String [] args){
         
        Scanner uI = new Scanner(System.in);
        // variable decalaration and initialization
        int selection = 0;// declaration

        do { 
            System.out.println("Please select a period: ");
            System.out.println("1. Period 1");
            System.out.println("2. Period 2");
            System.out.println("3. Period 3");
            System.out.println("4. Period 4");
            selection = uI.nextInt();// update
            // print a message if the wrong selection is made
            if (selection < 1 || selection > 4){
                System.out.print("Invalid selection. ");// part of the ergonomics of the program, needs to be readable by the user
            }

        } while (selection < 1 || selection > 4); //test

        if (selection > 0 && selection < 5){
            if (selection == 1){
            System.out.println("Your teacher for period 1 is Mr. Carreiro.");
            } else if (selection == 2){
            System.out.println("Your teacher for period 2 is Mrs. Rawn-Kane.");
            } else if (selection == 3){
            System.out.println("Your teacher for period 3 is Ms. Neal.");
            } else {
            System.out.println("Your teacher for period 4 is Mr. Penkul.");
            }

        }
    }
}