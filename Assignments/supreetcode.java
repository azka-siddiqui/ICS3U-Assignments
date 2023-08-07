import java.util.Scanner;
import java.util.Random;

class supreetcode {
  public static void main (String[] args) {
    
    //Variable Declaration and Initalization
    Scanner userInput = new Scanner (System.in);
    int userNum = 0;
    int menuNum = 0; 
    int lifeCount = 5;
    int choice = 0;
    boolean gameOver = false;
    
    System.out.print("Enter your username: ");
    String userName = userInput.nextLine();

    while (gameOver == false) {
      System.out.println("\n==== Game Menu ====");
      System.out.println("Current Life Count: " + lifeCount);
      System.out.println("Choose a room to enter:");
      System.out.println("1. Room 1");
      System.out.println("2. Room 2");
      System.out.println("3. Room 3");
      System.out.println("4. Final Room");
      System.out.println("5. Quit");

      do {
        System.out.println("Please enter your choice: ");
        while (!userInput.hasNextInt()) { //does not allow user to enter anything rather than integer.
          System.out.println("This is an invalid statement, you must enter an integer.");
          userInput.nextLine(); //Has a role of dumping scanner. Must dump before asking for input again
        }
        choice = userInput.nextInt(); //the variable is given the value of what user has entered
        userInput.nextLine(); //Has a role of dumping scanner. Must dump before asking for input again.
        
          
      } while (choice != 1 && choice !=2 && choice !=3 && choice != 4 && choice != 5);


      
      switch (choice) {
        case 1:
  
        case 2:

        case 3:

        case 4:
          
        case 5: 
          System.out.println("Quiting the game.....");
          gameOver = true; 
          break; 

        default:
          System.out.println("Invalid choice. Please try again!");
          break; 
          
      }
    }
  }
}






  public static boolean playNumberGuessingGame(int maxNumber, int lifeCount, int[] items, int itemIndex) {

    int randomNumber = random.nextInt(maxNumber) + 1;
    System.out.println("\n==== Number Guessing Game ====");
    System.out.println("Guess a number between 1 and " + maxNumber + ".");
    for (int attempt = 1; attempt <= 3; attempt++) {
        System.out.print("Attempt " + attempt + ": ");
        int guess = scanner.nextInt();

          if (guess == randomNumber) {
            return true;
          } else {
            System.out.println("Wrong guess! Try again.");
            lifeCount--;
          if (lifeCount <= 0) {
            return false;
          }
        }
      }
    }
      return false;
  }
}
    public static boolean playRockPaperScissors(int lifeCount, int[] items) {
      
      System.out.println("\n==== Final Room: Rock-Paper-Scissors ====");
        System.out.println("You are facing the boss in a best-of-three Rock-Paper-Scissors battle.");

        int playerWins = 0;
        int bossWins = 0;

        while (playerWins < 2 && bossWins < 2) {
            System.out.print("Enter your choice (1. Rock, 2. Paper, 3. Scissors): ");
            int playerChoice = scanner.nextInt();

            int bossChoice = new Random().nextInt(3) + 1;

            if (playerChoice == bossChoice) {
                System.out.println("It's a tie! Go again.");
            } else if ((playerChoice == 1 && bossChoice == 3) ||
                    (playerChoice == 2 && bossChoice == 1) ||
                    (playerChoice == 3 && bossChoice == 2)) {
                System.out.println("You win this round!");
                playerWins++;
            } else {
                System.out.println("Boss wins this round!");
                bossWins++;
            }
        }

        return playerWins > bossWins;
    }
}
