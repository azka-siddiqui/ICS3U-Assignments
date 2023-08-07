import java.util.Scanner;

class eireneCPT {
    public static void main (String[] args) {
        System.out.println("What is your name?");
        userName = uI.nextLine();
        if (userName.equalsIgnoreCase("cheat")) { //cheat code
            System.out.println("You have entered the cheat code. Correct guesses will be displayed.");
        } else {
            System.out.printf("Welcome to the game, %s\n", userName);
        }
        do {
            for (int i = 0; i < 4; i++) { //prints array
                if ((completedOne == false || completedTwo == false || completedThree == false) && i == 3) { //displays room 4 as locked
                    System.out.println(roomDisplay[i] + " [locked]");
                    }
                else {
                System.out.println(roomDisplay[i]);
                }
            }
            // Assures user enters a valid input for room.
            roomChosen = assureInt(roomChosen, 4);
            while (roomChosen <= 0 || roomChosen > 4) {
                System.out.println("The number you entered is not a valid room, please enter a number 1-4.");
                roomChosen =uI.nextInt();
            }
            while ((roomChosen == 4) && (completedOne == false || completedTwo == false || completedThree == false)) {
                System.out.println("Room 4 is locked. Please complete the other rooms first.");
                roomChosen = uI.nextInt();
            }
            // Makes sure user won't play the same room twice.
            while ((roomChosen == 1 && completedOne == true) || (roomChosen == 2 && completedTwo == true) || (roomChosen == 3 && completedThree == true)) {
                System.out.println("You have already completed this room. Please choose another room.");
                roomChosen = uI.nextInt();
            }

            //execution for playing the room
            switch (roomChosen) {
                case 1:
                if (roomStatus(3, 1, "rock") == true && !(lobbyChoice.equalsIgnoreCase("No"))) {
                    completedOne = true;
                    roomDisplay[0] = roomDisplay[0] + " [completed]";
                }
                break;
                case 2:
                if (roomStatus(4, 2, "paper") == true && !(lobbyChoice.equalsIgnoreCase("No"))) {
                    completedTwo = true;
                    roomDisplay[1] = roomDisplay[1] + " [completed]";
                }
                break;
                case 3:
                if (roomStatus(5, 3, "scissors") == true && !(lobbyChoice.equalsIgnoreCase("No"))) {
                    completedThree = true;
                    roomDisplay[2] = roomDisplay[2] + " [completed]";
                }
                break;
                case 4:
                if (rpsGame() == true) {
                    completedFour = true;
                    System.out.println("Congratulations! You have won the game.");
                    resetGame();
                    if (playAgain.equalsIgnoreCase("No")) {
                        System.out.printf("Alright, %s. Farewell.\n", userName);
                        break;
                        }
                break;
                }
                break;
                
            }
            //outcomes if user wins/loses entire game
            if (numLives == 0 && (completedOne == false || completedTwo == false || completedThree == false)) {
                System.out.println("You have no more lives and have lost the number guessing games.");
            }
            if (completedOne == true && completedTwo == true && completedThree == true && numLives < 0) {
                System.out.println("You lost the boss fight. You lose the game. ");
            } 
            if (numLives == 0) {
            resetGame();
            if (playAgain.equalsIgnoreCase("No")) {
                System.out.printf("Alright, %s. Farewell.\n", userName);
                break;
            }
        }  
        } while (true);

        

    }
    //--Variables Accessible Across All Methods
    public static Scanner uI = new Scanner (System.in); 
    public static int numLives = 5;
    public static String userName = "";
    public static String roomDisplay[] = {"1. Room 1", "2. Room 2", "3. Room 3", "4. Room 4"};
    public static String lobbyChoice = "";
    public static String playAgain = "";
    public static boolean completedOne = false;
    public static boolean completedTwo = false;
    public static boolean completedThree = false;
    public static boolean completedFour = false;
    public static int roomChosen = 0;
    
    /*
     * Method Description: Assures user enters an integer where necessary.
     * Integers out of range are not assured as entering ints out of range within
     * room minigames results in a lost life. However, the print statement simply reminds
     * the user what range they should be guessing in. 
     */

    public static int assureInt (int assureVar, int assureRange){
        while(!uI.hasNextInt()){
        System.out.printf("Please enter a number, 1-%d\n", assureRange);
            uI.next();
        }
        assureVar = uI.nextInt();
        return assureVar;
    }

    public static void resetGame() {
        System.out.printf("Would you like to play again, %s?\n", userName);
        playAgain = uI.nextLine();
        while (!(playAgain.equalsIgnoreCase("Yes")) && !(playAgain.equalsIgnoreCase("No"))) {
            System.out.println("Please enter Yes/no");
            playAgain = uI.nextLine();
            }
            if (playAgain.equalsIgnoreCase("Yes")) {
            System.out.printf("Good luck, %s! All counters will be reset.\n", userName);
            completedOne = false; completedTwo = false; completedThree = false;
            numLives = 5;
            roomChosen = 0;
            roomDisplay[0] = "1. Room 1";
            roomDisplay[1] = "2. Room 2";
            roomDisplay[2] = "3. Room 3";
            roomDisplay[3] = "4. Room 4";
            }
    }
    /*
     * Method Description: Number guessing game that takes parameters for a range to guess within.
     * Accepting parameters allows for this method to be used across the first three rooms.
     */
    public static boolean numberGame (int range) { 
        int userGuess = 0;
        int tries = range;
        int randomNum = (int)((Math.random() * range) + 1);
        System.out.println("This is a number guessing game.");
        System.out.printf("Please guess a number 1-%d. You have %d tries to guess correctly.\n", range, range);
        if (userName.equalsIgnoreCase("cheat")) {
            System.out.println("The correct guess is: " + randomNum);
        } 
          do {
            userGuess = assureInt(userGuess, range);
            tries--;
            if (!(userGuess > range || userGuess <= 0) && !(userGuess == randomNum) && tries > 0) {
            System.out.printf("Incorrect guess! Please try again. You have %d tries remaining.\n", tries);
            } 
            if ((userGuess > range || userGuess <= 0) && tries > 0) {
                System.out.printf("That guess was out of range. You have %d tries remaining.\n", tries);
                System.out.printf("Please enter a number from 1-%d\n", range); //reminds user of range
            }
          } while (!(userGuess == randomNum) && numLives > 0 && tries > 0);
        if (userGuess == randomNum) {
            System.out.println("Congratulations! you have guessed correctly.");
            lobby();
            return true;
        } else {
            numLives--;
            System.out.println("You've used all your tries, better luck next time.");
            if (numLives > 0) {
                System.out.printf("You have %d lives remaining and can play this room again.\n", numLives);
            }
            return false;
        }
    }
    /* 
     * Method Description: Rock, paper, scissors game used for boss fight.
     */
    public static boolean rpsGame() {
        int userChoice = 0;
        int userPts = 0;
        int compPts = 0;
        int randChoice = 0;
        int timesPlayed = 0;

        System.out.printf("Welcome. This is a rock, paper, scissors game. Using the items you've acquired, you'll be playing the boss to a best of three.");
        do {
        System.out.printf("\nChoose your move, enter a number 1-3:\n1. Rock\n2. Paper\n3. Scissors\n");
        randChoice = (int)((Math.random() * 3) + 1);
        if (userName.equalsIgnoreCase("cheat")) {
            System.out.println("The boss has chosen option #" + randChoice);
  
          } 
        userChoice = assureInt(userChoice, 3);
        System.out.println("Interesting choice!");
        switch (userChoice) {
            case 1: rock();
            break;
            case 2: paper();
            break;
            case 3: scissors(); 
            break;
            default: 
            System.out.println("The integer you entered was not in range. You lost a life.");        
        }
        System.out.println("Lets see what the boss chooses!");
        switch (randChoice) {
            case 1: rock();
            break;
            case 2: paper();
            break;
            case 3: scissors(); 
            break;
        }
        if (randChoice == userChoice) {
            System.out.println("It's a tie! Play again.");
        }
        if ( (userChoice == 1 && randChoice == 2) || (userChoice == 2 && randChoice == 3) || (userChoice == 3 && randChoice == 1)) {
            System.out.println("Boss wins this round. Better luck next time!");
            compPts++;
            timesPlayed++;
            lostLife();
        }
        if ( (randChoice == 1 && userChoice == 2) || (randChoice == 2 && userChoice == 3) || (randChoice == 3 && userChoice == 1)) {
            System.out.println("You won, excellent choice!");
            userPts++;
            timesPlayed++;
        }
        if (userChoice < 0 || userChoice > 3) {
            System.out.println("You entered an invalid input. Boss wins, better luck next time!");
            compPts++;
            timesPlayed++;
            lostLife();
        }
        } while (timesPlayed < 3 && numLives > 0);  
        if (userPts > compPts) {
            return true;
        } else {
            System.out.println("You lost the boss fight.");
            if (numLives > 0) {
                System.out.printf("You may attempt the boss fight again, you have %d lives remaining.", numLives);
            }
            return false;
        }
    }
    public static void lobby () {
        System.out.println("Would you like to return to the lobby? Answering 'No' will exit the game.");
        lobbyChoice = uI.nextLine();
        while (!(lobbyChoice.equalsIgnoreCase("Yes")) && !(lobbyChoice.equalsIgnoreCase("No"))) {
            System.out.println("Please enter Yes/no");
            lobbyChoice = uI.nextLine();
        }
        if (lobbyChoice.equalsIgnoreCase("No")) {
            System.out.println("Farewell and good luck on your future adventures!");
        } 
    }

    public static void lostLife() {
        numLives--;
        System.out.printf("You've lost a life. You have %d lives left.\n", numLives);
    }
    public static boolean roomStatus(int guessRange, int roomNumber, String item) {
        if ((numberGame(guessRange) == true)) {
            System.out.printf("Congratulations! You have won room %d. You have acquired %s.\n", roomNumber, item);
            return true;
        } 
        else {
            return false; 
        }
    }
    // methods for ascii art
    public static void scissors() {
        System.out.print("\n    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)\n");
    }
    public static void rock() {
        System.out.print("\n    _______        \n---'   ____)\n      (_____)\n      (_____)\n      (____)\n---.__(___)\n");
    }
    public static void paper() {
        System.out.print("\n    _______\n---'   ____)____\n          ______)\n          _______)\n         _______)\n---.__________)\n");
    }    
}