/*********************************************************
 * @Author: Azka Siddiqui       @Date: March 7, 2023
 * GuessingGame.java
 * This program will give the user a menu with both food options and the option to play a guessing game. 
 * If the user chooses to play the guessing game, they will have to guess a number from 1-10 
 * The user will be given hints until they guess the correct number, and will have unlimited tries
 */////////////////////////////////////////////////////////

import java.util.Scanner;
import java.lang.Math;

class GuessingGameFinal {
    public static void main(String [] args){

        Scanner uI = new Scanner(System.in);

        int userguess = 0;
        int optionChosen = 0;
        int randnum = 0;

        System.out.print("Please choose a menu option: \n 1. Fries \n 2. Burger  \n 3. Hotdog \n 4. Pizza \n 5. Number guessing game \n");
        optionChosen = uI.nextInt();

        if (optionChosen == 1) {
           System.out.println("Thank you for your order. Your fries are on the way.");
        }
        else if (optionChosen == 2){
           System.out.println("Thank you for your order. Your burger is on the way.");
        }
        else if (optionChosen == 3){
           System.out.println("Thank you for your order. Your hotdog is on the way.");
        }
        else if (optionChosen == 4){
           System.out.println("Thank you for your order. Your pizza is on the way.");
        }
        else if (optionChosen<1 || optionChosen>5){
                System.out.println("Invalid option entered.");
        } 
        else if (optionChosen == 5){
            randnum = (int)(Math.random()*10+1);
            while (userguess != randnum) {
                
                System.out.print("Guess a number between 1 and 10: ");
                userguess = uI.nextInt();

                if (userguess == randnum){

                System.out.println("Your guess is correct. Congratulations!");

                } else if (userguess < randnum){

                System.out.println("Your guess is smaller than the secret number.");
                
                } else {

                System.out.println("Your guess is greater than the secret number.");

               }

            }

         }
   }
}


