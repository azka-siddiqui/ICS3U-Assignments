/**
 * @Author: Azka Siddiqui       @Date: April 11, 2023
 * @class: rockpaper
 * @Description: This program is a rock paper scissors game and the game is best of seven rounds and the winner must win by 2.
 * The game will also display ASCII art to simulate the moves played
**/

import java.util.Scanner;
class rockpaper {
    public static void main(String[] args) {
        
      Scanner userInput = new Scanner (System.in); 
      String name = ""; 
      int userChoice = 0;
      int rounds = 0; 
      int computerChoice = 0;
      int playerScore = 0;
      int compScore = 0;
      int difference = 0;
      String newgame = "";
      int x = 0;
  
      System.out.print("Please enter your name: ");
      name = userInput.nextLine(); 
      
      System.out.printf("Let's play rock paper scissors %s! The game will be a best of 7 match up, and the winner must win by two.\n\n ", name);

      do {
        x = 0;//reset values for player to play game again
        playerScore = 0;//resets value for player to play game again
        compScore = 0;//reset values for player to play game again
        rounds = 0;//resets value for player to play game again

        do { 
              rounds++;//increments round number
              System.out.printf("Round %d:\n", rounds);
              
              do { 
                computerChoice = (int)(Math.random()*3+1);//generates random number for the computer's move

                if (userChoice < 0 || userChoice > 3){
                    System.out.println("Invalid input. Please try again.\n");
                }
                
                System.out.printf("Choose a move: \n1. Rock\n2. Paper\n3. Scissors\n");
               
                while (!userInput.hasNextInt()) { //does not accept anything other than an integer
                  System.out.println("This is an invalid statement, you must enter an integer.\n");
                  userInput.nextLine(); //empties scanner before asking for input again
                  System.out.printf("Choose a move: \n1. Rock\n2. Paper\n3. Scissors\n");
                } 

                userChoice = userInput.nextInt(); //assigns the number entered to the userChoice variable
                userInput.nextLine(); //empties scanner before asking for input again
                
                } while (userChoice < 1 || userChoice > 3); //prompts user to choose move that is a number from 1-3

                if (userChoice == 1){ //test
                    Rock();
                        
                } else if (userChoice == 2){//test
                    Paper();
                        
                } else {//test
                    Scissors();
                }

                System.out.println("\nNice move! Let's see what the computer chose!");
            
                if (computerChoice == 1){//test
                    Rock();
                            
                } else if (computerChoice == 2){//test
                    Paper();
                            
                } else {//test
                    Scissors();
                }
                
                if (computerChoice == playerScore){//test for tie
                    System.out.println("\nYou and the computer both chose the same move! That's a tie!");
                } else if (userChoice == 1 && computerChoice == 2){//test
                    System.out.println("\nYou chose rock but the computer chose paper. Try again!");
                    compScore++;
                } else if (userChoice == 1 && computerChoice == 3){//test
                    System.out.println("\nYou chose rock and the computer chose scissors. You scored a point!");
                    playerScore++;
                } else if (userChoice == 2 && computerChoice == 1){//test
                    System.out.println("\nYou chose paper and the computer chose rock. You scored a point!");
                    playerScore++;
                } else if (userChoice == 2 && computerChoice == 3){//test
                    System.out.println("\nYou chose paper but the computer chose scissors. Try again!");
                    compScore++;
                } else if (userChoice == 3 && computerChoice == 1){//test
                    System.out.println("\nYou chose scissors but the computer chose rock. Try again!");
                    compScore++;
                } else {//test
                    System.out.println("\nYou chose scissors and the computer chose paper. You scored a point!");
                    playerScore++;
                } 
                System.out.printf("Your score is %d. The computer's score is %d.\n\n", playerScore, compScore);
                x++;

              difference = Math.abs(playerScore-compScore); //calculates the absolute difference between the scores
          
          } while (difference < 2 || x < 4); //the winner must win by 2 and the game must go on for at least 4 rounds 
  
          if (playerScore > compScore) {//test for is the player is the winner
            System.out.printf("Congratulations %s, you won the game! You won %d games to %d.\n", name, playerScore, compScore);
            
          } else {
            System.out.printf("Sorry %s, you lost. The computer won the game. You lost %d games to %d.\n", name, playerScore, compScore);
          }

          System.out.println("Play again? \"Yes\" or \"No\""); //player can choose to play again
          newgame = userInput.next();
          System.out.println();

         if(newgame.equalsIgnoreCase("No")){
         System.out.println ("Thanks for playing!"); 

        }
     } while (newgame.equalsIgnoreCase("yes"));//repeats program if player chooses to play again

    } // close main method

        public static void Rock(){ //open Rock method for ASCII art
            System.out.println("     ______\n---'   ____)\n      (_____)\n      (_____)\n      (____)\n---.__(___)");
        }
        public static void Scissors(){//open Scissors method for ASCII art
            System.out.println("    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)");       
        }
        public static void Paper(){//open Paper method for ASCII art
            System.out.println("     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)");
        }
  
    }//close main class 