import java.util.Scanner;

public class suprret {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = userInput.nextLine();

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
          border();  // Border method to print a border line
 
            System.out.print("Enter your choice: ");
            int choice = assureInput(userInput, 1, 5);

            switch (choice) { // Start a switch statement based on the user's choice
                case 1:
                    if (items[0] == 0) {  // Check if Room 1 item is already collected
                        int randomNumber = (int)(Math.random()*3 + 1);// Generate a random number between 1 and 3
                        int guessesLeft = 3;  // The user has 3 guesses to guess the random number. 
                        boolean room1Win = false; //The user has not won the room as the variable is false. 

                        while (guessesLeft > 0) { // User enters while loop until guessesLeft equals 0. 
                            System.out.print("Guess a number between 1 and 3: ");
                            int guess = assureInput(userInput, 1, 3); 

                            if (guess == randomNumber) { // If the guess is correct.
                                System.out.println("Congratulations! You have won Room 1.");
                                room1Win = true; //The user has won the room as variable room1Win is now true. 
                                items[0] = 1; // Mark Room 1 item as collected
                                break; // Exit the loop
                            } else { // If the guess is incorrect
                                System.out.println("Incorrect guess. Try again.");
                                guessesLeft--; // Decrement the guesses by 1
                            }
                        }

                        if (!room1Win) {  // If the user lost Room 1
                            System.out.println("You lost Room 1. One life has been deducted.");
                            lifeCount--; // Decrement the life count
                            if (lifeCount <= 0) { // If the user is out of lives
                                System.out.println("You have run out of lives. Game over!");
                                gameOver = true; // Set "gameOver" to true to end the game
                            }
                        } else {
                            itemsCollected++; // Increment the number of items collected
                        }
                    } else { // If Room 1 item is already collected
                        System.out.println("You have already completed Room 1.");
                    }
                    break;
                
                case 2:
                    if (items[1] == 0) { // Check if Room 2 item is already collected
                        int randomNumber = (int) (Math.random()*4 + 1); // Generate a random number between 1 and 4
                        int guessesLeft = 3; //user has three guesses to guess the number. 
                        boolean room2Win = false; //The user has not won the room as the variable is false.

                        while (guessesLeft > 0) {  // User enters while loop until guessesLeft equals 0. 
                            System.out.print("Guess a number between 1 and 4: ");
                            int guess = assureInput(userInput, 1, 4);

                            if (guess == randomNumber) { // If the guess is correct
                                System.out.println("Congratulations! You have won Room 2.");
                                room2Win = true; //The user has won the room as variable room2Win is now true.
                                items[1] = 1; // Mark Room 2 item as collected
                                break; // Exit the loop
                            } else {  // If the guess is incorrect
                                System.out.println("Incorrect guess. Try again.");
                                guessesLeft--; // Decrement the guesses by 1.
                            }
                        }

                        if (!room2Win) { // If the user lost Room 2
                            System.out.println("You lost Room 2. One life has been deducted.");
                            lifeCount--; // Decrement the life count
                            if (lifeCount <= 0) { // If the user is out of lives
                                System.out.println("You have run out of lives. Game over!");
                                gameOver = true; // Set "gameOver" to true to end the game.
                            }
                        } else { // If the player won Room 2
                            itemsCollected++; // Increment the number of items collected
                        }
                    } else { // If Room 2 item is already collected
                        System.out.println("You have already completed Room 2.");
                    }
                    break;

                case 3:
                    if (items[2] == 0) {
                        int randomNumber = (int) (Math.random()*5 + 1);
                        int guessesLeft = 3;
                        boolean room3Win = false;

                        while (guessesLeft > 0) {
                          System.out.printf("For testing purposes, the number is %d\n", randomNumber);
                            System.out.print("Guess a number between 1 and 5: ");
                            int guess = assureInput(userInput, 1, 5);

                            if (guess == randomNumber) {
                                System.out.println("Congratulations! You have won Room 3.");
                                room3Win = true;
                                items[2] = 1; // Mark Room 3 item as collected
                                break;
                              
                            } else {
                                System.out.println("Incorrect guess. Try again.");
                                guessesLeft--;
                            }
                        }

                        if (!room3Win) {
                            System.out.println("You lost Room 3. One life has been deducted.");
                            lifeCount--;
                            if (lifeCount <= 0) {
                                System.out.println("You have run out of lives. Game over!");
                                gameOver = true;
                            }
                        } else {
                            itemsCollected++;
                        }
                    } else {
                        System.out.println("You have already completed Room 3.");
                    }
                    break;

case 4:
    if (itemsCollected == 3) {
        int computerWins = 0;
        int playerWins = 0;

        System.out.println("Let's play Rock, Paper, Scissors!\n");

        while (computerWins < 2 && playerWins < 2) {
            int computerChoice = (int) (Math.random()*3 + 1);
          System.out.println("Current Life Count: " + lifeCount);
          System.out.printf("For testing purposes, the computer chose %d\n", computerChoice); 

            System.out.println("Choose your move:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            System.out.print("Enter your move: ");
            int playerChoice = assureInput(userInput, 1, 3);

            if (playerChoice >= 1 && playerChoice <= 3) {
                System.out.println("Computer's move: " + computerChoice);

                if (playerChoice == computerChoice) {
                    System.out.println("It's a tie!\n");
                } else if ((playerChoice == 1 && computerChoice == 3)
                        || (playerChoice == 2 && computerChoice == 1)
                        || (playerChoice == 3 && computerChoice == 2)) {
                    System.out.println("You win this round!\n");
                    playerWins++;
                } else {
                    System.out.println("Computer wins this round!\n");
                  
                    computerWins++;
                  lifeCount--; 
                }

                System.out.println("Player Wins: " + playerWins);
                System.out.println("Computer Wins: " + computerWins);

            } else {
                System.out.println("Invalid move. Please enter a number between 1 and 3.");
            }
          border(); 
        }

        if (playerWins == 2) {
            System.out.println("Congratulations! You have won the Final Room.");
            System.out.println("You have completed the game. Well done, " + username + "!");
            gameOver = true;
        } else if (computerWins == 2 || lifeCount == 0) {
            System.out.println("You lost the Final Room. You've lost the whole game!");
            gameOver=true; 

        }
    } else {
        System.out.println("You need to collect all items first.");
    }
    break;

                
                case 5:
                    System.out.println("Thank you for playing! Goodbye, " + username + "!");
                    gameOver = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }
    }

  private static void border() {
    System.out.println("*********************************");
    System.out.println("+++++++++++++++++++++++++++++++++\n");
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
}
  

}










/*

             __.-/|
             \`o_O'
              =( )=  +-----+
                U|   | BEN |
      /\  /\   / |   +-----+
     ) /^\) ^\/ _)\     |
     )   /^\/   _) \    |
     )   _ /  / _)  \___|_
 /\  )/\/ ||  | )_)\___,|))
<  >      |(,,) )__)    |
 ||      /    \)___)\
 | \____(      )___) )____
  \______(_______;;;)__;;;)  
  
  
     .-')          _
   (`_^ (    .----`/
    ` )  \_/`   __/     __,
      {   |`  __/      /_/
      {    \__/ '--.  //
       \_\  >__/    \((
      _/_/ /` _\_   |))
     /_/__(  /______/`
  
  
  
  

  
  
  */