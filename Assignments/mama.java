import java.util.Scanner;

 public class mama {
   public static void main(String[] args) {
     Scanner userInput = new Scanner(System.in);
 
     System.out.print("Enter your username: ");
     String username = userInput.nextLine();
     
     // Check if the username is "cheat"
     if (username.equals("cheat")) { // Checking if the entered username is "cheat".
       System.out.println("Welcome, cheater! The random numbers and the computer's choice for the final room will be displayed!!!");
    }

     int lifeCount = 5; // The user will have a lifecount of 5 lives.
     int itemsCollected = 0; //Initialize the variable "itemsCollected" to 0, as the user has not collected any items yet.
     boolean gameOver = false;
     int[] items = new int[3]; // Array to store collected items
     
     while (!gameOver) { // Start a while loop that continues until the game is over and gameOver equals true.
       System.out.println("\n==== Game Menu ====");
       System.out.println("Current Life Count: " + lifeCount);
       System.out.println("Choose a room to enter:");
       System.out.println("1. Room 1");
       System.out.println("2. Room 2");
       System.out.println("3. Room 3");
       System.out.println("4. Final Room");
       System.out.println("5. Quit");
       
       System.out.print("Enter your choice: ");
       int choice = assureInput(userInput, 1, 5); //Makes sure the number entered by the user is between 1 and 5. 
       
       switch (choice) { // Start a switch statement based on the user's choice
         case 1:
           if (items[0] == 0) { // Check if Room 1 item is already collected
             
             System.out.println("You enter Room 1 and find yourself face-to-face with a ferocious dragon!");
             
             System.out.println("Defeat the dragon to claim the first item: the Legendary Rock.");
             int randomNumber = (int)(Math.random() * 3 + 1); // Generate a random number between 1 and 3
             int guessesLeft = 3; // The user has 3 guesses to guess the random number.
             boolean room1Win = false; // The user has not won the room as the variable is false.
             
             for (int i = guessesLeft; i > 0; i--) { // Loop for the number of guesses
               if (username.equals("cheat")) { // Check if username is "cheat". If it is "cheat", print the random number.
                 System.out.println("For Room 1, the random number is: " + randomNumber);
               }
               System.out.print("Guess a number between 1 and 3: ");
               int guess = assureInput(userInput, 1, 3); // Makes sure the user enters a number between 1 and 3.
               
               if (guess == randomNumber) { // If the guess is correct
                 System.out.println("Congratulations! You have slain the dragon and obtained the first item: the Legendary Rock.");
                 
                 room1Win = true; // The user has won the room as variable room1Win is now true.
                 items[0] = 1; // Mark Room 1 item as collected
                 break; // Exit the loop
               } else { // If the guess is incorrect
                 System.out.println("Incorrect guess. Try again.");
               }
             }
             
             if (!room1Win) { // If the user lost Room 1
               lifeCount--; // Decrement the life count
               System.out.println("You've been injured, but you still have " + lifeCount + " lives remaining.");
               if (lifeCount <= 0) { // If the user is out of lives
                 System.out.println("Oh no! You have lost all your lives and have perished in battle.");
                
                 gameOver = true; // Set "gameOver" to true to end the game
               }
             } else { // If the player won Room 1
               itemsCollected++; // Increment the number of items collected
             }
           } else { // If Room 1 item is already collected
             System.out.println("You have already completed Room 1.");
           }
           break;
         
         case 2:
           if (items[1] == 0) {  // Check if Room 2 item is already collected
             System.out.println("You enter Room 2 and are confronted by a massive devil!");
             
             System.out.println("Defeat the devil to claim the second item: the Legendary Paper.");
             int randomNumber = (int) (Math.random() * 4 + 1); // Generate a random number between 1 and 4
             int guessesLeft = 3; // User has three guesses to guess the number.
             boolean room2Win = false; // The user has not won the room as the variable is false.
             
             for (int i = guessesLeft; i > 0; i--) { // Loop for the number of guesses
               if (username.equals("cheat")) { // Check if username is "cheat". If it is "cheat", print the random number.
                 System.out.println("For Room 2, the random number is: " + randomNumber);
             }
               
               System.out.print("Guess a number between 1 and 4: ");
               int guess = assureInput(userInput, 1, 4); // Makes sure the number entered by the user is between 1 and 4.
               
               if (guess == randomNumber) { // If the guess is correct
                 System.out.println("Congratulations! You have slain the devi and obtained the second item: the Legendary Paper.");
                 
                 room2Win = true; // The user has won the room as variable room2Win is now true.
                 items[1] = 1; // Mark Room 2 item as collected
                 break; // Exit the loop
               } else { // If the guess is incorrect
                 System.out.println("Incorrect guess. Try again.");
               }
             }
             
             if (!room2Win) { // If the user lost Room 2
               lifeCount--; // Decrement the life count
               System.out.println("You've been injured, but you still have " + lifeCount + " lives remaining.");
               if (lifeCount <= 0) { // If the user is out of lives
                 System.out.println("Oh no! You have lost all your lives and have perished in battle.");
                 gameOver = true; // Set "gameOver" to true to end the game
               }
             } else { // If the player won Room 2
               itemsCollected++; // Increment the number of items collected
             }
           } else { // If Room 2 item is already collected
             System.out.println("You have already completed Room 2.");
           }
           break;
           
       case 3:
           if (items[2] == 0) { // Check if Room 3 item is already collected
             System.out.println("You enter Room 3 and encounter a cunning grim reaper!");
               
             System.out.println("Defeat the grim reaper to claim the third item: the Legendary Scissors.");
             int randomNumber = (int)(Math.random() * 5 + 1); // Generate a random number between 1 and 5
             int guessesLeft = 3; // The user has 3 guesses to guess the random number.
             boolean room3Win = false; // The user has not won the room as the variable is false.
             
             for (int i = guessesLeft; i > 0; i--) { // Loop for the number of guesses
               if (username.equals("cheat")) { // Check if username is "cheat". If it is "cheat", print the random number.
                 System.out.println("For Room 3, the random number is: " + randomNumber);
               }
               
               System.out.print("Guess a number between 1 and 5: ");
               int guess = assureInput(userInput, 1, 5); // Makes sure the number entered by the user is between 1 and 5.
               
               if (guess == randomNumber) { // If the guess is correct
                 System.out.println("Congratulations! You have slain the grim reaper and obtained the third item: the Legendary Scissors.");
 
                 
                 room3Win = true; // The user has won the room as variable room3Win is now true.
                 items[2] = 1; // Mark Room 3 item as collected
                 break; // Exit the loop
               } else { // If the guess is incorrect
                 System.out.println("Incorrect guess. Try again.");
               }
             }
             
             if (!room3Win) { // If the user lost Room 3
               lifeCount--; // Decrement the life count
               System.out.println("You've been injured, but you still have " + lifeCount + " lives remaining.");
               if (lifeCount <= 0) { // If the user is out of lives
                 System.out.println("Oh no! You have lost all your lives and have perished in battle.");
                 gameOver = true; // Set "gameOver" to true to end the game
               }
             } else { // If the player won Room 3
               itemsCollected++; // Increment the number of items collected
             }
           } else { // If Room 3 item is already collected
             System.out.println("You have already completed Room 3.");
           }
           break;
         
         case 4:
           if (itemsCollected == 3) { // Check if all three items are collected.
             System.out.println("You approach the final door with the three legendary items in your possession.");
             System.out.println("With a deep breath, you step inside, ready to claim the rarest treasure in the world.");
             System.out.println("You face the mighty Gryphon in a three-round match of Rock-Paper-Scissors!");
             
             int computerWins = 0;
             int playerWins = 0;
             
             while (computerWins < 2 && playerWins < 2 && lifeCount >=1) { // The game will loop until computer or player has won by 2 points or until the player has 0 lives. 
               int computerChoice = (int) (Math.random()*3 + 1); //creates a random number from 1 to 3.
               System.out.println("Current Life Count: " + lifeCount); //Displays the life count.
               if (username.equals("cheat")) { //Checks to see if username is "cheat", and if it is, the print statement will be displayed.
                 System.out.println("For the Final Room, the Gryphon chose choice is: " + computerChoice);
               }
               
               System.out.println("Choose your move:");
               System.out.println("1. Rock");
               System.out.println("2. Paper");
               System.out.println("3. Scissors");
               
               System.out.print("Enter your move: ");
               int playerChoice = assureInput(userInput, 1, 3); //Makes sure the user enters a number between 1 and 3.
               
               if (playerChoice >= 1 && playerChoice <= 3) { //Displays the computers choice after user enters their number. 
                 System.out.println("The Gryphon's move: " + computerChoice);
                 
                 if (playerChoice == computerChoice) { // If the user and computer tie and have the same number. 
                   System.out.println("It's a tie! Play again!\n");
                 
                 } else if ((playerChoice == 1 && computerChoice == 3) || (playerChoice == 2 && computerChoice == 1) || (playerChoice == 3 && computerChoice == 2)) { //If the user wins the round.
                   System.out.println("You win this round!\n");
                   playerWins++; //Increment the player wins by 1.
                 
                 } else { //If the computer wins the round.
                   System.out.println("The Gryphon wins this round!\n");
                   computerWins++; //Increment the computer wins by 1.
                   lifeCount--; //Decrement the life count. 
                 }
                 
                 System.out.println("Player Wins: " + playerWins);
                 System.out.println("The Gryphon's Wins: " + computerWins);
               
               } else { //If the user enters a number that is not with 1 and 3.
                 System.out.println("Invalid move. Please enter a number between 1 and 3.");
               }
             }
             
             if (playerWins == 2) { //if the player wins the rock-paper-scissors match
               System.out.println("Congratulations, " + username + "! You have defeated the Gryphon and claimed the rarest treasure in the world!");
               System.out.println("You are a true legend among treasure hunters!");

               gameOver = true; //exits the loop, making the game end. 
             } else if (computerWins == 2 || lifeCount == 0) { //if the computer wins the rock-paper-scissors match
               System.out.println("Oh no! The Gryphon has beaten you. You leave the cave empty-handed.");
               gameOver=true; //exits the loop, making the game end. 
             }
           
           } else { //if the user tries to enter room 4 but has not collected all three items.
             System.out.println("You need to collect all three legendary items first.");
           }
           break;
         
         case 5:
           System.out.println("Thank you for playing, " + username + "!");
           System.out.println("You have decided to end your treasure hunting adventure.");
 
           gameOver = true; //exits the loop, making the game end. 
           break;
  
       }
     }
   }
   
   private static int assureInput(Scanner userInput, int lowerBound, int upperBound) {
     int entry = 0; // used to store user entry
     boolean validInput = false;
     
     do {
       while (!userInput.hasNextInt()) { // deals with input that is not an int
         System.out.println("Please enter an integer.");
         userInput.nextLine(); // discard invalid input
       }
       entry = userInput.nextInt(); // assign the integer to the variable
       
       if (entry < lowerBound || entry > upperBound) { // check if the entry is within the specified range
         System.out.println("Please enter an integer within the specified range.");
         
       } else {
         validInput = true; // set validInput to true if the input is valid
       }
       userInput.nextLine(); // discard the remaining characters
     } while (!validInput);
     return entry; // return the validated input
     
   } //end of main method
 } //end of class Main
 