import java.util.Scanner;
import java.util.Random;

class ping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        int lifeCount = 5;
        int itemsCollected = 0;
        boolean gameOver = false;

        int[] items = new int[3]; // Array to store collected items

        while (!gameOver) {
            System.out.println("\n==== Game Menu ====");
            System.out.println("Current Life Count: " + lifeCount);
            System.out.println("Choose a room to enter:");
            System.out.println("1. Room 1");
            System.out.println("2. Room 2");
            System.out.println("3. Room 3");
            System.out.println("4. Final Room");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (items[0] == 0) {
                        int randomNumber = random.nextInt(3) + 1;
                        int guessesLeft = 3;
                        boolean room1Win = false;

                        while (guessesLeft > 0) {
                            System.out.print("Guess a number between 1 and 3: ");
                            int guess = scanner.nextInt();

                            if (guess == randomNumber) {
                                System.out.println("Congratulations! You have won Room 1.");
                                room1Win = true;
                                items[0] = 1; // Mark Room 1 item as collected
                                break;
                            } else {
                                System.out.println("Incorrect guess. Try again.");
                                guessesLeft--;
                            }
                        }

                        if (!room1Win) {
                            System.out.println("You lost Room 1. One life has been deducted.");
                            lifeCount--;
                            if (lifeCount <= 0) {
                                System.out.println("You have run out of lives. Game over!");
                                gameOver = true;
                            }
                        } else {
                            itemsCollected++;
                        }
                    } else {
                        System.out.println("You have already completed Room 1.");
                    }
                    break;

                case 2:
                    if (items[1] == 0) {
                        int randomNumber = random.nextInt(4) + 1;
                        int guessesLeft = 3;
                        boolean room2Win = false;

                        while (guessesLeft > 0) {
                            System.out.print("Guess a number between 1 and 4: ");
                            int guess = scanner.nextInt();

                            if (guess == randomNumber) {
                                System.out.println("Congratulations! You have won Room 2.");
                                room2Win = true;
                                items[1] = 1; // Mark Room 2 item as collected
                                break;
                            } else {
                                System.out.println("Incorrect guess. Try again.");
                                guessesLeft--;
                            }
                        }

                        if (!room2Win) {
                            System.out.println("You lost Room 2. One life has been deducted.");
                            lifeCount--;
                            if (lifeCount <= 0) {
                                System.out.println("You have run out of lives. Game over!");
                                gameOver = true;
                            }
                        } else {
                            itemsCollected++;
                        }
                    } else {
                        System.out.println("You have already completed Room 2.");
                    }
                    break;

                case 3:
                    if (items[2] == 0) {
                        int randomNumber = random.nextInt(5) + 1;
                        int guessesLeft = 3;
                        boolean room3Win = false;

                        while (guessesLeft > 0) {
                            System.out.print("Guess a number between 1 and 5: ");
                            int guess = scanner.nextInt();

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
                        int computerChoice = random.nextInt(3) + 1;

                        System.out.println("Let's play Rock, Paper, Scissors!");
                      
                        System.out.println("Choose your move:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");

                        System.out.print("Enter your move: ");
                        int playerChoice = scanner.nextInt();

                        if (playerChoice >= 1 && playerChoice <= 3) {
                            System.out.println("Computer's move: " + computerChoice);

                            if (playerChoice == computerChoice) {
                                System.out.println("It's a tie!");
                            } else if ((playerChoice == 1 && computerChoice == 3)
                                    || (playerChoice == 2 && computerChoice == 1)
                                    || (playerChoice == 3 && computerChoice == 2)) {
                                System.out.println("Congratulations! You have won the Final Room.");
                                System.out.println("You have completed the game. Well done, " + username + "!");
                                gameOver = true;
                            } else {
                                System.out.println("You lost the Final Room. One life has been deducted.");
                                lifeCount--;
                                if (lifeCount <= 0) {
                                    System.out.println("You have run out of lives. Game over!");
                                    gameOver = true;
                                }
                            }
                        } else {
                            System.out.println("Invalid move. Please enter a number between 1 and 3.");
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
}