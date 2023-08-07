import java.util.Scanner;
public class revisedRockPaper {
    public static void main(String[] args){

        Scanner uI = new Scanner (System.in); 
      String name = ""; 
      int userChoice = 0;
      int rounds = 0; 
      int computerChoice = 0;
      int playerScore = 0;
      int compScore = 0;
      int difference = 0;
      String newgame = "";
      int x = 0;

        System.out.println("Welcome to the final battle, the Jabberwocky's Rock Paper Scissors Showdown!");
                    rounds = 0;
                    do { 
                            rounds++;//increments round number
                            System.out.printf("\nRound %d:\n", rounds);
                            
                            do { 
                              computerChoice = (int)(Math.random()*3+1);//generates random number for the computer's move
            
                              System.out.printf("Choose a move: \n1. Rock\n2. Paper\n3. Scissors\n");
                             
                              while (!uI.hasNextInt()) { //does not accept anything other than an integer
                                System.out.print("Invalid entry. Please enter a number: ");
                                uI.next(); //empties scanner before asking for input again
                              } 

                              userChoice = uI.nextInt(); 
                              
                              } while (userChoice < 1 || userChoice > 3); //prompts user to choose move that is a number from 1-3
              
                              if (userChoice == 1){ //test
                                  Rock();
                                      
                              } else if (userChoice == 2){//test
                                  Paper();
                                      
                              } else {//test
                                  Scissors();
                              }
              
                              System.out.println("\nNice move! Let's see what the Jabberwocky chose!");
                          
                              if (computerChoice == 1){//test
                                  Rock();
                                          
                              } else if (computerChoice == 2){//test
                                  Paper();
                                          
                              } else {//test
                                  Scissors();
                              }
                              
                              if (userChoice == computerChoice){//test for tie
                                  System.out.println("\nYou and the Jabberwocky both chose the same move! That's a tie!");
                              } else if (userChoice == 1 && computerChoice == 2){//test
                                  System.out.println("\nYou chose rock but the Jabberwocky chose paper. Try again!");
                                  compScore++;
                              } else if (userChoice == 1 && computerChoice == 3){//test
                                  System.out.println("\nYou chose rock and the Jabberwocky chose scissors. You scored a point!");
                                  playerScore++;
                              } else if (userChoice == 2 && computerChoice == 1){//test
                                  System.out.println("\nYou chose paper and the Jabberwocky chose rock. You scored a point!");
                                  playerScore++;
                              } else if (userChoice == 2 && computerChoice == 3){//test
                                  System.out.println("\nYou chose paper but the Jabberwocky chose scissors. Try again!");
                                  compScore++;
                              } else if (userChoice == 3 && computerChoice == 1){//test
                                  System.out.println("\nYou chose scissors but the Jabberwocky chose rock. Try again!");
                                  compScore++;
                              } else {//test
                                  System.out.println("\nYou chose scissors and the Jabberwocky chose paper. You scored a point!");
                                  playerScore++;
                              } 
                              System.out.printf("Your score is %d. The Jabberwocky's score is %d.\n\n", playerScore, compScore);

                              if (userChoice != computerChoice){
                                x++;
                              }
                            difference = Math.abs(playerScore-compScore); //calculates the absolute difference between the scores
                        
                        } while (difference != 2 && x<3); //the game must go on for at least 2 rounds 
                
                        if (playerScore > compScore) {//test for is the player is the winner
                          System.out.printf("Congratulations %s, you won the game and defeated the Jabberwocky! You won %d games to %d.\n", name, playerScore, compScore);
                          System.out.println("You can finally return home!");

                        } else {
                          System.out.printf("Sorry %s, you lost. The Jabberwocky won the game. You lost %d games to %d.\n", name, playerScore, compScore);
                        }
              
    }

    public static void Rock(){ //open Rock method for ASCII art
        System.out.println("     ______\n---'   ____)\n      (_____)\n      (_____)\n      (____)\n---.__(___)");
    }
    public static void Scissors(){//open Scissors method for ASCII art
        System.out.println("    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)");       
    }
    public static void Paper(){//open Paper method for ASCII art
        System.out.println("     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)");
    }

    
}
