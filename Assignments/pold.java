/*******
 * THIS LOOKS GOOD!
 * 
 */

 import java.util.Scanner;
 class pold {
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
         do { 
             computerChoice = (int)(Math.random()*3+1);
               rounds++;
               System.out.printf("Round %d:\n", rounds);
               
               do { 
                 System.out.printf("Choose a move: \n1. Rock\n2. Paper\n3. Scissors\n");
                 
                 if (!userInput.hasNextInt() || userChoice <= 0 || userChoice >= 4) { //does not allow user to enter anything rather than integer
                   System.out.println("This is an invalid input, you must enter an integer between 1-3.");
                   userInput.nextLine(); //empties scanner before asking for input again
                 } 
         
                 userChoice = userInput.nextInt(); 
                 userInput.nextLine(); //empties scanner before asking for input again
                 
                 } while (userChoice < 1 || userChoice > 3); 
 
                 if (userChoice == 1){
                     Rock();
                         
                 } else if (userChoice == 2){
                     Paper();
                         
                 } else {
                     Scissors();
                 }
 
                 System.out.println("\nNice move! Let's see what the computer chose!");
             
                 if (computerChoice == 1){
                     Rock();
                             
                 } else if (computerChoice == 2){
                     Paper();
                             
                 } else {
                     Scissors();
                 }
                 
                 if (computerChoice == playerScore){
                     System.out.println("\nYou and the computer both chose the same move! That's a tie!");
                 } else if (userChoice == 1 && computerChoice == 2){
                     System.out.println("\nYou chose rock but the computer chose paper. Try again!");
                     compScore++;
                 } else if (userChoice == 1 && computerChoice == 3){
                     System.out.println("\nYou chose rock and the computer chose scissors. You scored a point!");
                     playerScore++;
                 } else if (userChoice == 2 && computerChoice == 1){
                     System.out.println("\nYou chose paper and the computer chose rock. You scored a point!");
                     playerScore++;
                 } else if (userChoice == 2 && computerChoice == 3){
                     System.out.println("\nYou chose paper but the computer chose scissors. Try again!");
                     compScore++;
                 } else if (userChoice == 3 && computerChoice == 1){
                     System.out.println("\nYou chose scissors but the computer chose rock. Try again!");
                     compScore++;
                 } else {
                     System.out.println("\nYou chose scissors and the computer chose paper. You scored a point!");
                     playerScore++;
                 } 
                 System.out.printf("Your score is %d. The computer's score is %d.\n\n", playerScore, compScore);
                 x++;
 
               difference = Math.abs(playerScore-compScore); 
           
           } while (difference != 2 || x <= 7);  
   
       
           if (playerScore > compScore) {
             System.out.println("Congratulations, you won the game!");
             
           } else {
             System.out.println("Sorry, you lost. The computer won the game");
           }
 
           System.out.println("Play again? \"Yes\" or \"No\"");
           newgame = userInput.next();
 
          if(newgame.equalsIgnoreCase("No")){
          System.out.println ("Goodbye!");
 
         }
      } while (newgame.equalsIgnoreCase("yes"));
     }
 
         public static void Rock(){
             System.out.println("     ______\n---'   ____)\n      (_____)\n      (_____)\n      (____)\n---.__(___)");
         }
         public static void Scissors(){
             System.out.println("    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)");       
         }
         public static void Paper(){
             System.out.println("     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)");
         
         }
   
     
     } 