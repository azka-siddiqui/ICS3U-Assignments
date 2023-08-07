/*@Author: Azka Siddiqui                        @Date: June 5, 2023
 *@File: CPTAzka
 *@Description: This is a Wonderland-themed text-based role playing game where the player will have 5 lives and has to
 * win four rooms to win the game and escape Wonderland. The player will receive an item for each room they win and 
 * the fourth room remains locked until the player has won all previous rooms. Each room will become progressively 
 * harder. In the fourth room the player will face off the Boss in a best of 3 match of Rock, Paper, Scissors. 
 * The result of this match will determine the users win or loss of the entire game. 
 */

import java.util.Scanner;//import scanner class
class CPTAzka {//open Main

    //variable declaration and initialization
    //instance variables accessible to all methods
    private static Scanner uI = new Scanner(System.in);
    private static String name = null; 
    private static Boolean hasCard, JackOfDiamonds = false, KingOfClubs = false, QueenOfHearts = false, AceOfSpades = false;
    private static int randnum, BossChoice, userChoice = 0, x = 0, bossScore = 0, playerScore = 0, userguess = 0, rounds = 0, lives = 5, difference = 0;
    public static void main (String [] args){//open main()

        //User input and program execution
        GameTitle();
        System.out.println("*whoosh*\nYou were just following that peculiar white rabbit but now you find yourself in a room with doors all around you and a table in the centre. \nTime and gravity seem to have stopped, so you decide to explore the shelves and objects on the walls of the tunnel.\n\nAt the end of the tunnel you find yourself in a long hall, surrounded by locked doors of all sizes. You find a key, which opens the smallest door of all.\n\nAfter peering through the door you find that you are too big to fit through and travel to the garden outside\nTo get outside to the garden you must collect drink the DRINK ME bottle but you discover that the table is much too high.\n\nYou also need to find the white rabbit, which is seeming more improbable as the seconds pass.\n\n");
        whiteRabbit();
        System.out.println("Then, you need to figure out the answer to the riddle that the Cheshire Cat will tell you but he has a bad habit of disappearing before you can guess the right answer!\n\nFinally, you must win a game of croquet against the Queen of Hearts, but it isn't the kind of croquet you are used to. Instead of mallets and balls, the Queen's version uses flamingoes and hedgehogs, who become unruly when you try to use them.\nOnly once you have completed these tasks will you be able to leave Wonderland, but to help you along the Cheshire Cat offers you a deal.\n\nIf you win the games he has set out for you, you can leave Wonderland.\n\nIf you win the first game, you will be given an Ace of Spades, and be able to escape the room with the many doors without drinking the suspicious-looking potion.\n\nIf you win the second game, you will get a Jack of Diamonds from the White Rabbit and he will help you escape Wonderland.\n\nIf you win the third game, you will be given the answer to the riddle that is one of your keys to leaving Wonderland and get a King of Clubs.\n\nOnly once you have gotten these three cards will you be able to progress to the final challenge.\n\nIf you win the final challenge the Queen will reward you with a Queen of Hearts card. With these four cards you can finally return home. Be wary of a deal with the Cheshire Cat, however, as there is always a catch. You only have three tries for each game. You will begin with 5 lives, so be careful and good luck!\n");
        Cheshire();

        System.out.print("Enter your name: ");
        name = uI.next();//username can be numbers, letters or a combination of both

        System.out.printf("\nWelcome to Wonderland %s.\n", name);

        do {
            if (lives==0){//game ends when the user has 0 lives left (breaks out of loop)
                System.out.println("\nOh no, you lost all your lives! Time to paint the red roses white, and most importantly, try not to go mad!");
                break;
            }
           userChoice = 0;//resets user choice of game option at the end of each game
           options();//displays game options

           userChoice = assureGuess(uI, userChoice);//assigns user input to userChoice variable and assures input with assureGuess method

            hasCard = false;//sets variable for the player having obtained the card for the selected round

            if ((userChoice==1 && AceOfSpades)||(userChoice==2 && JackOfDiamonds)||(userChoice == 3 && KingOfClubs)){//checks if player has already obtained the object from the selected room
                System.out.println("\nYou already have this card! Get the other cards so you can escape Wonderland.");
                hasCard = true;
            }

            switch (userChoice){//different outputs depending on what option the player chose
            case 1:
                if (!hasCard){
                    System.out.println("\nA card appears on the table, but it is still too high up. All of a sudden a caterpillar holding a cigar appears and when you look closely you notice that the caterpillar is holding a card. To get this card you must play a number-guessing game with him.");
                    numberGame(3, 0, 1);//method for guessing game of a number 1-3, if guess is correct displays endgame message and the prize is the Ace of Spades card
                }
                break;
            
            case 2:
            if (!hasCard){
                System.out.println("\nYou find yourself at a tea party, and see the Mad Hatter. You see the Mad Hatter examining the card he is holding while looking back and forth between you and the card. He tells you he will give you the card if you can get the right answer, but this time it's harder!");
                numberGame(4, 1, 2);//method for guessing game of a number 1-4, if guess is correct displays endgame message and the prize is the Jack of Diamonds card
            }
            break;

            case 3:
            if (!hasCard){
                System.out.println("\nYou find yourself in the thick of a forest, and see the Cheshire Cat. He flashes a mischevious grin at you and disappears, as if challenging your ability to win this game.");
                numberGame(5, 2, 3);//method for guessing game of a number 1-5, if guess is correct displays endgame message and the prize is King of Clubs card
            }
            break;

            case 4:
                if (!AceOfSpades || !KingOfClubs || !JackOfDiamonds) {//the player can only enter the final room once they have one the games in the other rooms and collected the respective items
                    System.out.println("\nYou have to get the other three cards first before you can enter this room!");
                } else {
                    System.out.println("\nWelcome to the final battle, the Jabberwocky's Rock Paper Scissors Showdown!\n");
                    rounds = 1; playerScore = 0; bossScore = 0; x = 0; difference = 0;//resets values for each game of RPS
                    do { 
                            System.out.printf("Round %d: \n", rounds++);//displays round number, player can win in as few as 2 rounds
                            
                            do { 
                              BossChoice = (int)(Math.random()*3+1);//generates random number for the computer's move
            
                              if (name.equals("cheat")){//cheatcode
                                System.out.printf("\nShh! I'll let you in on a secret, %s; the Jabberwocky chose move %d!", name, BossChoice);
                              }

                              System.out.printf("\n\nChoose a move: \n1. Rock\n2. Paper\n3. Scissors\n");
                             
                              userChoice = assureGuess(uI, userChoice);//assure user input for a number

                              if (userChoice < 1 || userChoice > 3){
                                System.out.println("\nInvalid entry. Please choose an option from 1-3.");
                               }

                              } while (userChoice < 1 || userChoice > 3); //repeats code in do...while loop prompting player for a valid move from 1-3

                              moves(userChoice);//displays ASCII art for player move
              
                              System.out.println("\nNice move! Let's see what the Jabberwocky chose!");
                          
                              moves(BossChoice);//displays ASCII art for boss move

                              if (userChoice == BossChoice) {//test for tie

                                    System.out.println("\nYou tied!"); 

                              } else if (userChoice == 1 && BossChoice == 3 || userChoice == 2 && BossChoice == 1 || userChoice == 3 && BossChoice == 2) { //test for player win
                                      System.out.println("\nCongratulations! You won the round and scored a point!"); 
                                      playerScore++; x++;//any match that does not result in a tie counts as a round
                          
                              } else {//test for boss win
                                    lives--;
                                    System.out.printf("\nYou lost, try again! You lost a life.");
                                    bossScore++; x++;////any match that does not result in a tie counts as a round
                              }
                              System.out.printf("Your score is %d. The Jabberwocky's score is %d.\nYou have %d lives left.\n\n", playerScore, bossScore, lives);//Displays score
                              difference = Math.abs(playerScore-bossScore);//calculates score difference
                        
                        } while (difference != 2 && x<3); //game ends when a player has 2 wins, exits loop if three or less rounds have been played and the score difference is two (the first player to two points wins)
                
                        if (playerScore > bossScore) {//test for if the player is the winner
                          QueenOfHearts = true;//collects final card
                          System.out.printf("Congratulations %s, you defeated the Jabberwocky and got the Queen of Hearts card! You won %d games to %d.\nYou acquired all the cards and can finally return home!", name, playerScore, bossScore);
                          goodBye();
                          break;//exits game

                        } else {//test for if the boss wins
                          System.out.printf("Sorry %s, you lost. The Jabberwocky won the game. You lost %d games to %d.\n", name, playerScore, bossScore);
                          System.out.printf("You have %d lives left.\n", lives);//displays life count, returns to options, player plays until they have lost all their lives
                        }
                }

                default://if userchoice does not meet the cases above, checks that user entered a valid option
                    while (userChoice < 1 || userChoice > 4){//option chosen must be between 1 and 4, loops until userChoice is a valid option
                        System.out.print("\nInvalid choice. Please enter a number between 1 and 4: ");
                        userChoice = assureGuess(uI, userChoice);//assures input to be a number
                    }
            }//close switch statement
        } while (!KingOfClubs||!AceOfSpades||!JackOfDiamonds||!QueenOfHearts);//game runs as until all cards have been collected
}//close main()

    private static void GameTitle(){//ASCII art for game title

        System.out.println("""
            ##           /##                                       ##      ###                              
            /####         #/ ###                                   /####       ###    #                        
           /  ###        ##   ###  #                              /  ###        ##   ###                       
              /##        ##       ##                                 /##        ##    #                        
             /  ##       ##       ##                                /  ##       ##                             
             /  ##       ###### ######## /##  ###  /###             /  ##       ##  ###       /###      /##    
            /    ##      ##### ######## / ###  ###/ #### /         /    ##      ##   ###     / ###  /  / ###   
            /    ##      ##       ##   /   ###  ##   ###/          /    ##      ##    ##    /   ###/  /   ###  
           /      ##     ##       ##  ##    ### ##                /      ##     ##    ##   ##        ##    ### 
           /########     ##       ##  ########  ##                /########     ##    ##   ##        ########  
          /        ##    ##       ##  #######   ##               /        ##    ##    ##   ##        #######   
          #        ##    ##       ##  ##        ##               #        ##    ##    ##   ##        ##        
         /####      ##   ##       ##  ####    / ##              /####      ##   ##    ##   ###     / ####    / 
        /   ####    ## / ##       ##   ######/  ###            /   ####    ## / ### / ### / ######/   ######/  
       /     ##      #/   ##       ##   #####    ###          /     ##      #/   ##/   ##/   #####     #####   
       #                                                      #                                                
        ##                                                     ##                                                                                                                                                                                                                  
                """);
    }

    private static void Cheshire(){//Cheshire cat ASCII art
        System.out.println("""
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣤⣶⣶⣶⣶⣶⣤⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⠟⡛⢿⣿⡿⢿⣿⣿⣿⣿⠟⡛⢿⣿⣿⠿⠿⢿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⡇⢀⣠⣿⣿⣿⣾⣅⡈⠛⠁⡞⠛⠀⣿⡇⠰⣷⣆⢻⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣷⠈⣿⣿⢡⣶⣌⢻⣿⡄⠸⣿⣶⣾⣿⣷⡀⠩⣥⠚⢿⣿⣿⣧⡀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⠟⠛⠻⣿⣿⣿⣿⡆⢹⣿⡀⠛⣩⠼⢿⣷⠀⠻⣿⣿⣿⣿⣿⣦⣌⣃⣼⣿⣿⣿⣷⡀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠇⣼⠟⠢⡈⢻⡿⠋⢵⠀⣿⣷⣄⠙⢓⣨⣿⣤⣶⣶⣿⣿⣏⠉⣽⣿⣿⠿⣿⣿⣿⣿⣧⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡜⢧⡼⢣⣿⣄⠙⣧⢈⠃⢸⣿⣿⣿⣿⣿⣿⠟⣉⡅⠈⣿⣿⠀⣿⣿⣿⡇⢰⣿⣿⣿⣿⡄⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣶⣶⣿⣿⣿⣷⡈⠈⣷⣠⣴⣿⣿⣿⣿⡏⠺⣿⣷⠀⣿⣿⠀⣿⣿⣿⣷⢸⣿⣿⣿⣿⡇⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣠⣾⣿⣿⣿⣿⣿⣿⣷⡖⣩⣤⠀⠿⣿⠇⠸⠿⢿⣿⠀⣿⣿⣿⣿⡇⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠿⣿⣿⠘⠿⢋⣤⣴⣿⣿⣿⣿⣾⣧⣤⣝⡛⣿⣿⡇⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠙⢷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣋⡁⢠⣉⠻⢋⣡⡄⠀⣙⣿⡇⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⡇⢸⣿⣡⣌⣿⡇⢠⣿⣿⡇⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⡇⢸⣿⣿⣿⣿⡇⢸⣿⣿⡇⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⡇⠘⢿⣿⣿⣿⠇⢸⣿⣿⡇⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⣦⣄⣀⣤⣤⣤⣤⣄⣀⠀⠀⠀⠀⠀⣠⣴⣶⣤⣄⡀⠀⠀⣀⣤⣶⣶⣶⣿⣿⣿⣥⣶⡟⠁⢻⣿⣶⣌⣻⣿⡇⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣄⡀⠀⢸⣿⣿⣿⣿⣿⣿⣿⡿⠶⠤⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⡷⠈⣛⢿⣿⣿⣿⣷⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣷⣼⣿⣿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠉⣨⣾⣇⢻⣿⣿⣿⣿⣿⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢑⣿⣿⣿⡌⣿⣿⣿⣿⣿⡆⠀⠀
⠀⠀⠀⠀⠀⠀⠘⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠿⢛⠛⠻⣿⣜⢩⡽⣿⣿⣇⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢿⠋⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣡⠀⢸⣿⣿⣦⠙⣷⣶⣿⣿⣿⠀⠀
⠀⠀⠀⠀⠀⠀⢀⣀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⣿⣿⣿⡇⠸⣿⣿⣿⣿⡆⠀
⠀⠀⣀⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⡇⢰⣿⣿⣿⣿⣇⠀
⢠⢾⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡈⠀⣿⣿⣿⠟⣠⣿⣿⣿⣿⣿⣿⡀
⠀⢺⣿⣿⣿⣿⣿⣿⡈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠈⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢿⡿⣿⣿⣦⣬⣭⣤⣾⣿⣿⣿⣿⣿⣿⣿⡇
⠀⠀⠙⠿⣿⣿⣿⣿⣧⠀⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉ ⠀⢀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢻⣇⢙⣿⣿⣿⣿⣿⣿⡿⡛⣿⢫⣹⣿⣿⡇
⠀⠀⠀⠀⢸⣿⣿⣿⣿⣷⣤⡀⠀⠀⠉⠙⠛⠛⠛⠛⠛⠉⠉⠀⠀⠀⢀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢨⡛⠸⢿⠟⡛⢿⡅⠙⡕⢡⡇⠿⣹⣿⣿⠁
⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣶⣦⣄⣀ ⣀⣀⣀⣀⣀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⢰⣾⠘⣛⣸⡇⢸⣿⣿⡇⢾⢹⣿⠏⠀
⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠸⣯⣬⣿⣦⣓⣼⣇⣬⣿⣿⣿⣶⣿⠋⠀⠀
⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠁⠀⠀⠀
⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠿⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠙⠛⠿⠿⠿⠟⠋⠁⠈⠙⠛⠿⠿⠿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """);
    }

    private static void options(){//displays room options in a String array
        String [] options = {"\n------------- Choose a round -----------------", "1: Get the Ace of Spades card and enter the garden.", "2. Get the Jack of Diamonds card and find the mysterious rabbit.", "3. Get the King of Clubs card and get the answer to the riddle.", "4. Get the Queen of Hearts card and return home!"};

        for (String value: options){//for each loop prints out each menu option
            System.out.println(value);
        }
    }
  
    private static void Rock(){ //Rock method for ASCII art
        System.out.println("     ______\n---'   ____)\n      (_____)\n      (_____)\n      (____)\n---.__(___)");
    }
    
    private static void Scissors(){//Scissors method for ASCII art
        System.out.println("    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)");       
    }
    
    private static void Paper(){//Paper method for ASCII art
        System.out.println("     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)");
    }

    private static void cheatGuess (String a, int b){//cheatcode for a String parameter (name) and integer parameter (random number)
        if (a.equals("cheat")){
        System.out.printf("\nShh! I'll let you in on a secret, name; the number is %d!\n", name, b);
        }
    }

    private static void moves (int a){//prints ASCII art for RPS moves depending on what option was chosen
        if (a == 1){ //
            Rock();
        } else if (a == 2){
            Paper();  
        } else {
            Scissors();
        }
    }

    private static int assureGuess (Scanner uI, int a){//assures user input for a number in guessing game
        while(!uI.hasNextInt()){
            System.out.print("\nInvalid entry. Please enter a number: ");
            uI.next();
        }
        a = uI.nextInt();//update
        return a;//method returns valid guess
    }

    public static void numberGame (int range, int endMessageIndex, int card) { //method for number guessing game

        String [] endGameMessage = {"\nYour guess is correct. Congratulations you got the Ace of Spades and entered into the garden!", "\nYour guess is correct. Congratulations you got the Jack of Diamonds! The Mad Hatter also tells you where to find the white rabbit and that he must help you now that you have the Jack of Diamonds. You are almost out of Wonderland!", "\nYour guess is correct. Congratulations you got the King of Clubs! The Mad Hatter also tells you where to find the white rabbit and that he must help you now that you have the Jack of Diamonds. You are almost out of Wonderland!"};
        int x = 0; rounds = 0;//resets for each game
        randnum = (int)(Math.random()*range+1);//generates a random number for a specified range defined in the parameters of the method
        cheatGuess(name, randnum);//cheatcode

        while (rounds <= 2 && lives > 0 && x == 0){//Asks user for guess while the user has lives left, and the round number is 2 or less

        System.out.printf("\nGuess a number between 1 and %d: ", range);
        userguess = assureGuess(uI, userguess);//assures user input for number

        if (userguess != randnum) {//test for if player guessed incorrectly
            lives--;//life lost
            rounds++;//increments round
            System.out.printf("\nYou guessed incorrectly! You have %d more tries. Your life count is %d lives.\n", 3-rounds, lives);//tries left is max rounds-current round which is 3-rounds

        } else {
        System.out.println(endGameMessage[endMessageIndex]);//prints the corresponding message for the end of the game
        x++;//increments x, and breaks out of while loop to end number guessing game once number is guessed correctly
        switch (card){//item collected depending on the room
            case 1:
                AceOfSpades = true;
                break;
            case 2:
                JackOfDiamonds = true;
                break;
            case 3:
                KingOfClubs = true;
                break;
        }
        }
        }
    }

    private static void whiteRabbit(){
        System.out.println("                                  ,;;;,\n                                ,;;;;;;;,\n             .;;;,            ,;;;;;;;;;;;,\n            .;;%%;;;,        ,;;;;;;;;;;;;;,\n            ;;%%%%%;;;;,.    ;;;;;;;;;;;;;;;\n            ;;%%%%%%%%;;;;;, ;;;;;;;;;;;;;;;\n            `;;%%%%%%%%%;;;;;,;;;;;;;;;;;;;'\n             `;;%%%%%%%%%%;;;;,;;;;;;;;;;;'\n               `;;;%%%%%%%%;;;;,;;;;;;;;;'\n                  `;;;%%%%%%;;;;.;;;.;;;\n                     `;;;%%%;;;;;;.;;;,; .,;;'\n                         `;;;;;;;;;;,;;;;;;'.,;;;,\n                          ;;;;;;;;;;;;;;;;;;;;;,.\n          .          ..,,;;;;;......;;;;;;;.... ';\n          ;;,..,;;;;;;;;;;;;..;;;;;;..;;;;.;;;;;.\n           ';;;;;;;;;;;;;;..;;;a@@@@a;;;;;;;a@@@@a,\n        .,;;;;;;;;;;;;;;;.;;;a@@@@@@@@;;;;;,@@@@@@@a,\n      .;;;,;;;;;;;;;;;;;;;;;@@@@@'  @@;;;;;;,@  `@@@@;,\n     ;' ,;;;,;;;;;;;;;;;;;;;@@@@@aa@@;;;;,;;;,@aa@@@@;;;,.,;\n       ;;;,;;;;;;;;;;;;;;;;;;@@@@@@@;;;,;a@@'      `;;;;;;;'\n       ' ;;;,;;;;;;;;;;;;;;;;;;;;;;;;,;a@@@       #  ;;,;;,\n.//////,,;,;;;;;;;;;;;;;;;,;;;;;;;;,;;a@@@a,        ,a;;;,;;,\n%,/////,;;;;;;;;;;;;;;;;;;;;,;,;,;;;;a@@@@@@aaaaaaa@@@;;;;;';\n`%%%%,/,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;@@@@@@@@@@@;00@@;;;;;'\n  %%%%%%,;;;;;;;;;;;;;;;;;;;;;;;;;;;a@@@@@@@@@@;00@@;;;;;'\n   `%%%%%%%%%%,;;;;;;;;;;;;;;;;;;;;a@@@@@@@@@;00@@;;;;;'\n     `%%%%%%%%%%%%%%%,::::;;;;;;;;a@@@@@@@;00@@@::;;;%%%%%,\n       `%%%%%%%%%%%%%%%,::::;;;;;@@@@@@' 0@@@@::;;%%%%%%%%'\n          Oo%%%%%%%%%%%%,::::;;a@@@@@'  ,@@@::;;%%%%%%%'\n           `OOo%%%%%%%%%%,::::@@@@@'    @@;::;%%%%%%'\n             `OOOo%%%%%%%%,:::@@@@,;;;,a@:;;%%%%%'\n               `OOOOOo%%%%%,:::@@@aaaa@';;%%%%'\n                  `OOOO;@@@@@@@@aa@@@@@@@@@'\n                      ;@@@@@@@@@@@@@@@@@@@'\n                       @@@@@@@@'`@@@@@@@@'\n                       `@@@@@'    @@@@@'\n                        `@@'       @@'");
    }

    private static void goodBye(){
        System.out.println("""
            \n\n    /_____)                          /  
            /                /) /)           /   
           /   ___   _______(/ (/_      _   /    
          /     / ) (_)(_)(_(_/_) (_/__(/_ o     
         (____ /                 .-/             
                                (_/                     
                """);
    }
}
    

