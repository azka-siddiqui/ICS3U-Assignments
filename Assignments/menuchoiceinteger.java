/**
 * @Author: Azka Siddiqui       @Date: March 21, 2023
 * @class: whileassignment
 * @Description: This program will give the user a menu and prompt the user for input, where they 
 * can choose one of four options, enter their choice by integer, and will get a corresponding message.
 */

 import java.util.Scanner;
 
 class menuchoiceinteger{
     public static void main(String[]args) {
  
         Scanner uI = new Scanner(System.in);
  
         //Variable declaration and initialization
         int userchoice = 0;
         String filename = "";
  
         do {
             System.out.println("------------- MENU: PLEASE SELECT ONE -----------------");
             System.out.println("1. Load/Open a file");
             System.out.println("2. Save a file to disk");
             System.out.println("3. Sort names alphabetically");
             System.out.println("4. Exit program");
             userchoice = uI.nextInt();
  
             if (userchoice == 1){
                 System.out.println("Sorting data...\n");
  
             } if (userchoice == 2){
                 System.out.println("Good-bye");
                     break;
             }
  
             while (userchoice == 1){
                     System.out.print("Please enter a file name: ");
                     filename = uI.next();
                     if (filename.length() > 10){
                         System.out.printf("The file name exceeded the character count of 10 characters. Please try again.\n");
                     }else{
                         System.out.printf("Opening file %s..\n", filename);
                         break;
                     }
             }
 
             while (userchoice ==2){
                     System.out.print("Please enter a file name: ");
                     filename = uI.next();
                     if (filename.length() > 10) {
                          System.out.println("File name exceeded the character count of 10 characters. Try again.");
                     }else{
                         System.out.printf("Saving file %s..\n", filename);
                             break;
  
                     }
  
             } 
  
         }while (userchoice > 0 && userchoice < 5);
   }
 }
 