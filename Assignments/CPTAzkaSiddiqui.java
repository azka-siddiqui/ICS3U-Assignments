/*@Author: Azka Siddiqui             @Date: June 8, 2023
 *@File: CPTAzkaSiddiqui
 *@Description: This is a Wonderland-themed text-based role playing game called "After Alice". The player 
 * has landed into the curious world of riddles and nonsense and has to win four rooms to win the game and escape 
 * Wonderland, with a total of 5 lives. The player will receive an item for each room they win and 
 * the fourth room remains locked until the player has won all previous rooms. Each room will become progressively 
 * harder. In the fourth room the player will face off the Boss in a best of 3 match of Rock, Paper, Scissors. 
 * The result of this match will determine the players win or loss of the entire game and whether they can escape Wonderland! 
 */

 import java.util.Scanner;//import scanner class
 class CPTAzkaSiddiqui {//open Main
 
     //instance variables accessible to all methods
     private static Boolean exitGame = false;//variable that breaks out of game 
     private static String name = null, newgame = null;
     private static int itemsCollected, randnum, playerChoice = 0, playerguess = 0, rounds = 0, lives = 5;
     public static void main (String [] args){//open main()
 
        //variable declaration and initialization
        int items [] = new int[4];//array to store collected items
        String [] rooms = {"\n------------- Choose a round -----------------", "1. Get the Ace of Spades card and enter the garden.", "2. Get the Jack of Diamonds card and find the mysterious rabbit.", "3. Get the King of Clubs card and the answer to the Cheshire Cat's riddle.", "4. Get the Queen of Hearts card and return home!"};//room options
        Scanner uI = new Scanner(System.in);//instantiate scanner object
        int itemsObtained = 0;//Initialize the variable "itemsObtained" to 0, as the player has not collected any items yet.
        int BossChoice;//variable for the Boss Choice in the rock paper scissors game 
        int bossScore = 0;//Initialize boss score to 0 
        int playerScore = 0;//Initialize player score to 0

         //user input and program execution
        GameTitle();//print game title
        System.out.println("*whoosh*\nYou were just following that peculiar white rabbit but now you find yourself in a room with doors all around you and a table in the centre. \nTime and gravity seem to have stopped, so you decide to explore the shelves and objects on the walls of the tunnel.\n\nAt the end of the tunnel you find yourself in a long hall, surrounded by locked doors of all sizes. You find a key, which opens the smallest door of all.\n\nAfter peering through the door you find that you are too big to fit through and travel to the garden outside\nTo get outside to the garden you must collect drink the DRINK ME bottle but you discover that the table is much too high.\n\nYou also need to find the white rabbit, which is seeming more improbable as the seconds pass.\n\n");
        whiteRabbit();//print white rabbit
        System.out.println("\nThen, you need to figure out the answer to the riddle that the Cheshire Cat will tell you but he has a bad habit of disappearing before you can guess the right answer!\n");
        Cheshire();//print cheshire cat
        System.out.println("\nFinally, you must win a game of croquet against the Queen of Hearts, but it isn't the kind of croquet you are used to. Instead of mallets and balls, the Queen's version uses flamingoes and hedgehogs, who become unruly when you try to use them.\nOnly once you have completed these tasks will you be able to leave Wonderland, but to help you along the Cheshire Cat offers you a deal.\n\nIf you win the games he has set out for you, you can leave Wonderland.\n\nIf you win the first game, you will be given an Ace of Spades, and be able to escape the room with the many doors without drinking the suspicious-looking potion.\n\nIf you win the second game, you will get a Jack of Diamonds from the Mad Hatter and he will tell you where to find the white rabbit.\n\nIf you win the third game, you will be given the answer to the riddle that is one of your keys to leaving Wonderland and get a King of Clubs.\n\nOnly once you have gotten these three cards will you be able to progress to the final challenge.\n\nIf you win the final challenge the Queen will reward you with a Queen of Hearts card. With these four cards you can finally return home. Be wary of a deal with the Cheshire Cat, however, as there is always a catch. You only have three tries for each game. You will begin with 5 lives, so be careful and good luck!\n");

        System.out.print("\nEnter your name: ");
        name = uI.next();//player name can be numbers, letters, or a combination of both

        // Check if the playername is "cheat"
        if (name.equals("cheat")) { // Checking if the entered player name is "cheat".
        System.out.println("\nWelcome, cheater. The correct answers to the rooms will be displayed!");
        } else {
         System.out.printf("\nWelcome to Wonderland %s. Remember, the key to your escape lies within the wonders of Wonderland. Let the adventure begin!\n", name);
        }

         do {
            for (int i = 0; i < 5; i++) {//array to output game options
                if ((items[0] == 0 || items[1] == 0 || items[2] == 0) && i == 4) {//displays final room as locked if first 3 rooms are not completed
                    System.out.println(rooms[i] + " [locked]");//prints final room as locked
                } else {
                System.out.println(rooms[i]);//prints room option
                }
            }

             if (lives==0){//game ends when the player has 0 lives left (breaks out of loop)
                 System.out.println("\nOh no, you lost all your lives! Time to paint the white roses red, and most importantly, try not to go mad!");
                 break;
             }
            
            playerChoice = assureInput(uI, playerChoice, 4);//assure input for number

            while (playerChoice < 1 || playerChoice > 4){//assure input for number between 1-4
             System.out.print("\nInvalid choice. Please enter a number between 1 and 4: ");
             playerChoice = assureInput(uI, playerChoice, 4);//assure input for number
            }

             if (items[playerChoice-1]==1){//checks if player has already obtained the object from the selected room
                 System.out.println("\nYou already have this card! Get the other cards so you can escape Wonderland.");

             } else {
 
             switch (playerChoice){//different outputs depending on what option the player chose
             case 1:
                System.out.println("\nA card appears on the table, but it is still too high up. All of a sudden a caterpillar holding a cigar appears and when you look closely you notice that the caterpillar is holding a card. To get this card you must play a number-guessing game with him.");
                numberGame(3, 0, 1, rooms, uI, items);//method for guessing game of a number 1-3, if guess is correct displays endgame message and the prize is the Ace of Spades card
                break;
             
             case 2:
                 System.out.println("\nNow restored to your normal size, you continue down the path and come to a clearing in the woods, where a beautiful tea party has been set.");
                 System.out.println("     _o_    ;:;'\n ,-.'---`.__ ;\n((j`=====',-'\n `-\\     /\n    `-=-'");//print teacup
                 System.out.println("Crowded at one end of the large table are the March Hare, the Mad Hatter, and a Dormouse. You see the Mad Hatter examining the card he is holding while looking up and down between you and the card. You approach the tea party and ask for help locating the white rabbit and finding the rest of the cards. The Mad Hatter tells you he will give you the card if you can get the right answer, but this time it's harder!");
                 numberGame(4, 1, 2, rooms, uI, items);//method for guessing game of a number 1-4, if guess is correct displays endgame message and the prize is the Jack of Diamonds card
                 break;
 
             case 3:
                 System.out.println("\nYou find yourself in the thick of a forest, and on the way, you encounter a most mysterious cat. A grinning Cheshire cat, to be exact.  You tell the cat that you are searching for the cards you need, and ask him which way you should go.  He tells you that you could visit either the March Hare or the Queen of Hearts--it doesn't really matter which because both of them are mad.\n");
                 Cheshire();//print cheshire cat ASCII art
                 System.out.println("More confused than ever, you catch the glimmer of a card on a tree bench up high beside the Cheshire Cat. He flashes a mischevious grin at you and challenges you to a game, which if you win, you will get the card he has.");
                 numberGame(5, 2, 3, rooms, uI, items);//method for guessing game of a number 1-5, if guess is correct displays endgame message and the prize is King of Clubs card
                 break;
 
             case 4:
                 if (itemsCollected != 3){//the player can only enter the final room once they have one the games in the other rooms and collected the respective items
                     System.out.println("\nThe room is locked! You have to get the other three cards first before you can enter this room!");
                 } else {
                     System.out.println("\nWelcome to the final battle, the Jabberwocky's Rock Paper Scissors Showdown!\n");
                     rounds = 1; playerScore = 0; bossScore = 0;//resets values for each game of RPS
                     do { 
                             System.out.printf("Round %d: \n", rounds++);//displays round number, player can win in as few as 2 rounds
                            
                               BossChoice = (int)(Math.random()*3+1);//generates random number for the computer's move
             
                               if (name.equals("cheat")){//cheatcode
                                 System.out.printf("\nShh! I'll let you in on a secret, %s; the Jabberwocky chose move %d!", name, BossChoice);
                               }
 
                               System.out.printf("\n\nChoose a move: \n1. Rock\n2. Paper\n3. Scissors\n");
                              
                               playerChoice = assureInput(uI, playerChoice, 3);//assure user input for a number

                               while (playerChoice < 1 || playerChoice > 3){//checks if player entered an invalid move
                                System.out.print("\nInvalid entry. Please choose an option from 1-3: ");
                                playerChoice = assureInput(uI, playerChoice, 3);//assures input for number
                               }
 
                               moves(playerChoice);//displays ASCII art for player move
               
                               System.out.println("\nNice move! Let's see what the Jabberwocky chose!");
                           
                               moves(BossChoice);//displays ASCII art for boss move
 
                               if (playerChoice == BossChoice) {//test for tie
 
                                     tieMessage();
                                     System.out.println("\nYou tied!"); 
 
                               } else if (playerChoice == 1 && BossChoice == 3 || playerChoice == 2 && BossChoice == 1 || playerChoice == 3 && BossChoice == 2) { //test for player win
                                       winMessage();
                                       System.out.println("\nCongratulations! You won the round and scored a point!"); 
                                       playerScore++;//increment player score
                           
                               } else {//test for boss win
                                     loseMessage();
                                     lives--;//decrement life count
                                     System.out.printf("\nYou lost, try again! ");
                                     bossScore++;//increment boss score 
                               }
                               System.out.printf("Your score is %d. The Jabberwocky's score is %d.\n\n", playerScore, bossScore);//Displays score
                         
                         } while (!(playerScore==2||bossScore==2)); //game ends when a player has 2 wins and three or less rounds have been played and the score difference is two (the first player to two points wins)
                 
                         if (playerScore > bossScore) {//test for if the player is the winner
                           items[playerChoice-1] = 1; itemsCollected++;//collects final card
                           winMessage();//display win message
                           System.out.printf("Congratulations %s, you defeated the Jabberwocky and got the Queen of Hearts card! You won %d games to %d.\n\nYou acquired all the cards and can finally return home! You take the opportunity to run through the crowd that gathered during your game with the Jabberwocky and in your haste, you trip over a red paint bucket next to one of the rosebushes.  You are terrified to see soldiers approaching as you black out.  When you wake up, your heart is racing.  You quickly sit upright, ready to start running again.  But when you look around, all you see is your backyard.  It must have all been a strange, curious dream. You tell your cat Dinah all about it.", name, playerScore, bossScore);
                           exitGame = true;//exits game
 
                         } else {//test for if the boss wins
                           loseMessage();//display lose message
                           System.out.printf("Sorry %s, you lost. The Jabberwocky won the game. You lost %d games to %d.\n\nTime to paint the white roses red, and most importantly, try not to go mad!\n", name, playerScore, bossScore);
                           exitGame = true;//exits game
                         }
            }//close if statement

            }//close switch
        }//close if statement
         } while (itemsObtained != 4 && !exitGame);//game runs as until all cards have been collected and the player has chosen not to exit
        
            System.out.printf("\n\nThanks for playing, %s!", name);
            goodBye();//display goodbye ASCII art

 }//close main()

     private static void cheatGuess (String name, int randnum){//cheatcode for a String parameter, the player's name, and integer parameter, the random number
         if (name.equals("cheat")){
         System.out.printf("\nShh! I'll let you in on a secret, %s; the number is %d!\n", name, randnum);
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
 
     private static void moves (int a){//prints ASCII art for RPS moves depending on what option was chosen, represented by the parameter 'a'
         switch (a){//the move displayed depends on the parameter, which is either playerChoice or bossChoice
            case 1:
                Rock();//displays Rock
                break;
            case 2:
                Paper();//displays Paper
                break;
            case 3:
                Scissors();//displays Scissors
                break;
         }
     }
 
     private static int assureInput (Scanner uI, int a, int range){//assures user input for a number in guessing game
         while(!uI.hasNextInt()){//checks if the next token in the scanner's input is non-numerical
             System.out.printf("\nInvalid entry. Please enter a number between 1 and %d: ", range);
             uI.next();//moves pointer
         }
         a = uI.nextInt();//update
         return a;//method returns validated number
     }

     private static void completed(String[] rooms, int i){//takes parameters of the room option array and an integer
        rooms[i] = rooms[i] + " [completed]";//sets room display to completed
     }
 
     private static void numberGame (int range, int endMessageIndex, int roomnum, String [] rooms, Scanner uI, int items[]) { //method for number guessing game

        Boolean gameOver = false;
        String [] endGameMessage = {"\nYour guess is correct. Congratulations you got the Ace of Spades and entered into the garden! The little door swings open and you suddenly shrink to the size of a doll.  You walk through the doorway easily and are amazed at what you find on the other side.  You don't see the white rabbit, of course, but blades of grass and flower stalks and blooms tower above you. ", "\nYour guess is correct. Congratulations you got the Jack of Diamonds! The Mad Hatter also tells you where to find the white rabbit and that he must help you now that you have the Jack of Diamonds. You are almost out of Wonderland!", "\nYour guess is correct. Congratulations you got the King of Clubs! The Cheshire Cat flashes a grin at you and disappears. You feel a sense of relief and find that you are actually finding Wonderland a bit thrilling. Onwards!"};
        int triesLeft = 3;//resets values for each game
        randnum = (int)(Math.random()*range+1);//generates a random number for a specified range defined in the parameters of the method
        cheatGuess(name, randnum);//cheatcode

        while (lives > 0 && !gameOver){//Asks player for guess while the player has lives left and the game is not over (player has tries left)

        System.out.printf("\nGuess a number between 1 and %d: ", range);
        playerguess = assureInput(uI, playerguess, range);//assures user input for number

        if (playerguess != randnum) {//test for if player guessed incorrectly
            triesLeft--; //increments round, decrements tries left
            System.out.printf("\nYou guessed incorrectly! You have %d more tries.\n", triesLeft);
            if ((triesLeft)==0){//asks player if they want to return to lobby once they have no more lives left
                lives--;//decrement life count
                loseMessage();
                System.out.printf("\nYou could not guess the number in three tries and lost a life. You have %d lives left.\n", lives);
                gameOver=true;//exits number guessing game loop
                returnLobby(uI);//asks player if they want to return to lobby
            }
        } else {
            winMessage();//display winner message
            System.out.println(endGameMessage[endMessageIndex]);//prints the corresponding message for the end of the game
            gameOver = true;//exits number guessing game loop
            items[playerChoice-1]=1;//marks room as collected
            itemsCollected++;//increment items collected
            completed(rooms, roomnum);
            returnLobby(uI);//asks player if they want to return to lobby
         }
         }
     }

     private static void returnLobby(Scanner uI){
        System.out.println("\nWould you like to return to the lobby? \"Yes\" or \"No\""); //player can choose to play again
            newgame = uI.next();

            while (!(newgame.equalsIgnoreCase("yes")||newgame.equalsIgnoreCase("no"))){//assure input
                System.out.println("\nInvalid option. Please enter yes or no: ");
                newgame = uI.next();
                uI.nextLine();//dumps scanner
            }

            if(newgame.equalsIgnoreCase("no")){
                exitGame = true;// Set "exitGame" to true to end the game
            }
     }

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
⠀⢺⣿⣿⣿⣿⣿⣿⡈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋ ⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢿⡿⣿⣿⣦⣬⣭⣤⣾⣿⣿⣿⣿⣿⣿⣿⡇
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
    private static void winMessage(){
            System.out.println("""
                    
██╗░░░██╗░█████╗░██╗░░░██╗  ░██╗░░░░░░░██╗██╗███╗░░██╗██╗
╚██╗░██╔╝██╔══██╗██║░░░██║  ░██║░░██╗░░██║██║████╗░██║██║
░╚████╔╝░██║░░██║██║░░░██║  ░╚██╗████╗██╔╝██║██╔██╗██║██║
░░╚██╔╝░░██║░░██║██║░░░██║  ░░████╔═████║░██║██║╚████║╚═╝
░░░██║░░░╚█████╔╝╚██████╔╝  ░░╚██╔╝░╚██╔╝░██║██║░╚███║██╗
░░░╚═╝░░░░╚════╝░░╚═════╝░  ░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝
                    """);
    }

    private static void loseMessage(){
        System.out.println("""
                
██╗░░░██╗░█████╗░██╗░░░██╗  ██╗░░░░░░█████╗░░██████╗███████╗██╗
╚██╗░██╔╝██╔══██╗██║░░░██║  ██║░░░░░██╔══██╗██╔════╝██╔════╝██║
░╚████╔╝░██║░░██║██║░░░██║  ██║░░░░░██║░░██║╚█████╗░█████╗░░██║
░░╚██╔╝░░██║░░██║██║░░░██║  ██║░░░░░██║░░██║░╚═══██╗██╔══╝░░╚═╝
░░░██║░░░╚█████╔╝╚██████╔╝  ███████╗╚█████╔╝██████╔╝███████╗██╗
░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚══════╝░╚════╝░╚═════╝░╚══════╝╚═╝
                """);
    }
    private static void tieMessage(){
        System.out.println("""
                
██╗░░░██╗░█████╗░██╗░░░██╗  ████████╗██╗███████╗██████╗░
╚██╗░██╔╝██╔══██╗██║░░░██║  ╚══██╔══╝██║██╔════╝██╔══██╗
░╚████╔╝░██║░░██║██║░░░██║  ░░░██║░░░██║█████╗░░██║░░██║
░░╚██╔╝░░██║░░██║██║░░░██║  ░░░██║░░░██║██╔══╝░░██║░░██║
░░░██║░░░╚█████╔╝╚██████╔╝  ░░░██║░░░██║███████╗██████╔╝
░░░╚═╝░░░░╚════╝░░╚═════╝░  ░░░╚═╝░░░╚═╝╚══════╝╚═════╝░
                """);
    }
 }//end class
     