 /*********************************************************
 * @Author: Azka Siddiqui       @Date: March 7, 2023
 * GuessingGame.java
 * This program will give the user a menu with both food options and the option to play a guessing game. 
 * If the user chooses to play the guessing game, they will have to guess a number from 1-10 
 * The user will be given hints until they guess the correct number, and will have unlimited tries
 * This is a more efficient version of code since it uses an array rather than multiple if statements
 */////////////////////////////////////////////////////////
 
import java.util.Scanner;
import java.lang.Math;

class guessGame2 {
   public static void main (String[] args){
   // var declaration and initialization
   int optionChosen = 0;
   int randomNum = 0;
   int userguess = 0; 

   Scanner userInput = new Scanner (System.in);
   // program
   System.out.print("Please choose a menu option: \n 1. Fries \n 2. Burger \n 3. Hotdog \n 4. Pizza \n 5. Number guessing game \n");
   optionChosen = userInput.nextInt();
   // if statements
       if (optionChosen == 1 || optionChosen == 2 || optionChosen == 3 || optionChosen == 4){
        String[] arrayName = {"Thank you for your order. Your fries are on the way.", "Thank you for your order. Your burger is on the way.", "Thank you for your order. Your hotdog is on the way.", "Thank you for your order. Your pizza is on the way."};
        System.out.printf("%s \n", (arrayName[optionChosen - 1]));
       } else if (optionChosen == 5){
        randomNum = (int)(Math.random()*10+1);
        while (userguess != randomNum) {
            
            System.out.print("Guess a number between 1 and 10: ");
            userguess = userInput.nextInt();

            if (userguess == randomNum){

            System.out.println("Your guess is correct. Congratulations!");

            } else if (userguess < randomNum){

            System.out.println("Your guess is smaller than the secret number.");
            
            } else {

            System.out.println("Your guess is greater than the secret number.");

            }

    }
    userInput.close();
}}}
