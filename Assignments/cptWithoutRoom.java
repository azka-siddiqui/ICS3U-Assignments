import java.util.Scanner;//import scanner class
 class cptWithoutRoom {//open Main
 
     //instance variables accessible to all methods
     private static Scanner uI = new Scanner(System.in);
     private static int items [] = new int[4];
     private static String name = null; 
     private static int itemsCollected, randnum,  userChoice = 0, userguess = 0, rounds = 0, lives = 5;
     public static void main (String [] args){//open main()
 
        //variable declaration and initialization
        Boolean exitGame = false;
        int itemsObtained = 0, BossChoice, bossScore = 0, playerScore = 0;

         //User input and program execution
        GameTitle();
        System.out.println("*whoosh*\nYou were just following that peculiar white rabbit but now you find yourself in a room with doors all around you and a table in the centre. \nTime and gravity seem to have stopped, so you decide to explore the shelves and objects on the walls of the tunnel.\n\nAt the end of the tunnel you find yourself in a long hall, surrounded by locked doors of all sizes. You find a key, which opens the smallest door of all.\n\nAfter peering through the door you find that you are too big to fit through and travel to the garden outside\nTo get outside to the garden you must collect drink the DRINK ME bottle but you discover that the table is much too high.\n\nYou also need to find the white rabbit, which is seeming more improbable as the seconds pass.\n\n");
        whiteRabbit();
        System.out.println("Then, you need to figure out the answer to the riddle that the Cheshire Cat will tell you but he has a bad habit of disappearing before you can guess the right answer!\n\nFinally, you must win a game of croquet against the Queen of Hearts, but it isn't the kind of croquet you are used to. Instead of mallets and balls, the Queen's version uses flamingoes and hedgehogs, who become unruly when you try to use them.\nOnly once you have completed these tasks will you be able to leave Wonderland, but to help you along the Cheshire Cat offers you a deal.\n\nIf you win the games he has set out for you, you can leave Wonderland.\n\nIf you win the first game, you will be given an Ace of Spades, and be able to escape the room with the many doors without drinking the suspicious-looking potion.\n\nIf you win the second game, you will get a Jack of Diamonds from the White Rabbit and he will help you escape Wonderland.\n\nIf you win the third game, you will be given the answer to the riddle that is one of your keys to leaving Wonderland and get a King of Clubs.\n\nOnly once you have gotten these three cards will you be able to progress to the final challenge.\n\nIf you win the final challenge the Queen will reward you with a Queen of Hearts card. With these four cards you can finally return home. Be wary of a deal with the Cheshire Cat, however, as there is always a catch. You only have three tries for each game. You will begin with 5 lives, so be careful and good luck!\n");
        Cheshire();

        System.out.print("\nEnter your name: ");
        name = uI.next();//name can be numbers, letters, or a combination of both
 
         System.out.printf("\nWelcome to Wonderland %s.\n", name);
 
         do {
             if (lives==0){//game ends when the user has 0 lives left (breaks out of loop)
                 System.out.println("\nOh no, you lost all your lives! Time to paint the white roses red, and most importantly, try not to go mad!");
                 exitGame = true;// set "exitGame" to true to end the game
                 break;
             }
            userChoice = 0;//resets user choice of game option at the end of each game
            options();//displays game options
 
            userChoice = assureGuess(uI, userChoice);//assigns user input to userChoice variable and assures input with assureGuess method

             if (items[userChoice-1]==1){//checks if player has already obtained the object from the selected room
                 System.out.println("\nYou already have this card! Get the other cards so you can escape Wonderland.");

             } else {
 
             switch (userChoice){//different outputs depending on what option the player chose
             case 1:
                System.out.println("\nA card appears on the table, but it is still too high up. All of a sudden a caterpillar holding a cigar appears and when you look closely you notice that the caterpillar is holding a card. To get this card you must play a number-guessing game with him.");
                numberGame(3, 0, 1);//method for guessing game of a number 1-3, if guess is correct displays endgame message and the prize is the Ace of Spades card
                break;
             
             case 2:
                 System.out.println("\nNow restored to your normal size, you continue down the path and come to a clearing in the woods, where a beautiful tea party has been set.  Crowded at one end of the large table are the March Hare, the Mad Hatter, and a Dormouse. You see the Mad Hatter examining the card he is holding while looking up and down between you and the card. You approach the tea party and ask for help locating the white rabbit and finding the rest of the cards.  The Mad Hatter tells you he will give you the card if you can get the right answer, but this time it's harder!");
                 numberGame(4, 1, 2);//method for guessing game of a number 1-4, if guess is correct displays endgame message and the prize is the Jack of Diamonds card
                 break;
 
             case 3:
                 System.out.println("\nYou find yourself in the thick of a forest, and see the Cheshire Cat. He flashes a mischevious grin at you and disappears, as if challenging your ability to win this game.");
                 numberGame(5, 2, 3);//method for guessing game of a number 1-5, if guess is correct displays endgame message and the prize is King of Clubs card
                 break;
 
             case 4:
                 if (itemsCollected != 3){//the player can only enter the final room once they have one the games in the other rooms and collected the respective items
                     System.out.println("\nThe room is locked! You have to get the other three cards first before you can enter this room!");
                 } else {
                     System.out.println("\nWelcome to the final battle, the Jabberwocky's Rock Paper Scissors Showdown!\n");
                     rounds = 1; playerScore = 0; bossScore = 0;//resets values for each game of RPS
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
 
                               } while (userChoice < 1 || userChoice > 3); //repeats code in loop prompting player for a valid move from 1-3
 
                               moves(userChoice);//displays ASCII art for player move
               
                               System.out.println("\nNice move! Let's see what the Jabberwocky chose!");
                           
                               moves(BossChoice);//displays ASCII art for boss move
 
                               if (userChoice == BossChoice) {//test for tie
 
                                     System.out.println("\nYou tied!"); 
 
                               } else if (userChoice == 1 && BossChoice == 3 || userChoice == 2 && BossChoice == 1 || userChoice == 3 && BossChoice == 2) { //test for player win
                                       System.out.println("\nCongratulations! You won the round and scored a point!"); 
                                       playerScore++;//increment player score
                           
                               } else {//test for boss win
                                     lives--;//decrement life count
                                     System.out.printf("\nYou lost, try again! ");
                                     bossScore++;//increment boss score 
                               }
                               System.out.printf("Your score is %d. The Jabberwocky's score is %d.\nYou have %d lives left.\n\n", playerScore, bossScore, lives);//Displays score
                         
                         } while (!(playerScore==2||bossScore==2)); //game ends when a player has 2 wins and three or less rounds have been played and the score difference is two (the first player to two points wins)
                 
                         if (playerScore > bossScore) {//test for if the player is the winner
                           items[userChoice-1] = 1; itemsCollected++;//collects final card
                           System.out.printf("Congratulations %s, you defeated the Jabberwocky and got the Queen of Hearts card! You won %d games to %d.\nYou acquired all the cards and can finally return home! You take the opportunity to run through the crowd that gathered during your game with the Jabberwocky and in your haste, you trip over a red paint bucket next to one of the rosebushes.  You are terrified to see soldiers approaching as you black out.  When you wake up, your heart is racing.  You quickly sit upright, ready to start running again.  But when you look around, all you see is your backyard.  It must have all been a strange, curious dream. You tell your cat Dinah all about it.", name, playerScore, bossScore);
                           exitGame = true;//exits game
 
                         } else {//test for if the boss wins
                           System.out.printf("Sorry %s, you lost. The Jabberwocky won the game. You lost %d games to %d.\n", name, playerScore, bossScore);
                           System.out.printf("You have %d lives left.\n", lives);//displays life count
                           break;
                         }
            }//close if statement

            default://if userchoice does not meet the cases above, checks if user entered a valid option
                while (userChoice < 1 || userChoice > 4){//option chosen must be between 1 and 4, loops until userChoice is a valid option
                System.out.print("\nInvalid choice. Please enter a number between 1 and 4: ");
                userChoice = assureGuess(uI, userChoice);//assures input to be a number
                }
            }//close switch
        }//close if statement
         } while (itemsObtained != 4 && !exitGame);//game runs as until all cards have been collected and the player has chosen not to exit
        
            System.out.printf("\nThanks for playing, %s!", name);
            goodBye();

 }//close main()
 
     private static void options(){//displays room options in a String array
         String [] options = {"\n------------- Choose a round -----------------", "1: Get the Ace of Spades card and enter the garden.", "2. Get the Jack of Diamonds card and find the mysterious rabbit.", "3. Get the King of Clubs card and the answer to the Cheshire Cat's riddle.", "4. Get the Queen of Hearts card and return home!"};
 
         for (String value: options){//for each loop prints out each room option
             System.out.println(value);
         }
     }

     private static void cheatGuess (String a, int b){//cheatcode for a String parameter, the player's name, and integer parameter, the random number
         if (a.equals("cheat")){
         System.out.printf("\nShh! I'll let you in on a secret, %s; the number is %d!\n", name, b);
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
 
     private static void moves (int a){//prints ASCII art for RPS moves depending on what option was chosen
         switch (a){
            case 1:
                Rock();
                break;
            case 2:
                Paper();
                break;
            case 3:
                Scissors();
                break;
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
 
     private static void numberGame (int range, int endMessageIndex, int card) { //method for number guessing game

        Boolean gameOver = false;
        String [] endGameMessage = {"\nYour guess is correct. Congratulations you got the Ace of Spades and entered into the garden! The little door swings open and you suddenly shrink to the size of a doll.  You walk through the doorway easily and are amazed at what you find on the other side.  You don't see the white rabbit, of course, but blades of grass and flower stalks and blooms tower above you. ", "\nYour guess is correct. Congratulations you got the Jack of Diamonds! The Mad Hatter also tells you where to find the white rabbit and that he must help you now that you have the Jack of Diamonds. You are almost out of Wonderland!", "\nYour guess is correct. Congratulations you got the King of Clubs! The Mad Hatter also tells you where to find the white rabbit and that he must help you now that you have the Jack of Diamonds. You are almost out of Wonderland!"};
        int rounds = 0;//resets for each game
        randnum = (int)(Math.random()*range+1);//generates a random number for a specified range defined in the parameters of the method
        cheatGuess(name, randnum);//cheatcode

        while (rounds <= 2 && lives > 0 && !gameOver){//Asks user for guess while the user has lives left, and the round number is 2 or less

        System.out.printf("\nGuess a number between 1 and %d: ", range);
        userguess = assureGuess(uI, userguess);//assures user input for number

        if (userguess != randnum) {//test for if player guessed incorrectly
            rounds++;//increments round
            System.out.printf("\nYou guessed incorrectly! You have %d more tries.\n", 3-rounds);//tries left is max rounds-current round which is 3-rounds
        
            if ((3-rounds)==0){
                lives--;
                System.out.printf("\nYou could not guess the number in three tries and lost a life. You have %d lives left.\n", lives);
                gameOver=true;
            }
        } else {
            System.out.println(endGameMessage[endMessageIndex]);//prints the corresponding message for the end of the game
            gameOver = true;
            items[userChoice-1]=1;
            itemsCollected++;
         }
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
    private static void whiteRabbit(){
        System.out.println("""
            ,;;;, 
            ,;;;;;;;, 
.;;;,            ,;;;;;;;;;;;, 
.;;%%;;;,        ,;;;;;;;;;;;;;, 
;;%%%%%;;;;,.    ;;;;;;;;;;;;;;; 
;;%%%%%%%%;;;;;, ;;;;;;;;;;;;;;; 
`;;%%%%%%%%%;;;;;,;;;;;;;;;;;;;' 
`;;%%%%%%%%%%;;;;,;;;;;;;;;;;' 
`;;;%%%%%%%%;;;;,;;;;;;;;;' 
`;;;%%%%%%;;;;.;;;.;;; 
 `;;;%%%;;;;;;.;;;,; .,;;' 
     `;;;;;;;;;;,;;;;;;'.,;;;, 
      ;;;;;;;;;;;;;;;;;;;;;,. 
.          ..,,;;;;;......;;;;;;;.... '; 
;;,..,;;;;;;;;;;;;..;;;;;;..;;;;.;;;;;. 
';;;;;;;;;;;;;;..;;;a@@@@a;;;;;;;a@@@@a, 
.,;;;;;;;;;;;;;;;.;;;a@@@@@@@@;;;;;,@@@@@@@a, 
.;;;,;;;;;;;;;;;;;;;;;@@@@@  @@;;;;;;,@  @@@@;, 
;' ,;;;,;;;;;;;;;;;;;;;@@@@@aa@@;;;;,;;;,@aa@@@@;;;,.,; 
;;;,;;;;;;;;;;;;;;;;;;@@@@@@@;;;,;a@@'      `;;;;;;;' 
' ;;;,;;;;;;;;;;;;;;;;;;;;;;;;,;a@@@       #  ;;,;;, 
.//////,,;,;;;;;;;;;;;;;;;,;;;;;;;;,;;a@@@a,        ,a;;;,;;, 
%,/////,;;;;;;;;;;;;;;;;;;;;,;,;,;;;;a@@@@@@aaaaaaa@@@;;;;;'; 
`%%%%,/,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;@@@@@@@@@@@;00@@;;;;;' 
%%%%%%,;;;;;;;;;;;;;;;;;;;;;;;;;;;a@@@@@@@@@@;00@@;;;;;' 
`%%%%%%%%%%,;;;;;;;;;;;;;;;;;;;;a@@@@@@@@@;00@@;;;;;' 
`%%%%%%%%%%%%%%%,::::;;;;;;;;a@@@@@@@;00@@@::;;;%%%%%, 
`%%%%%%%%%%%%%%%,::::;;;;;@@@@@@' 0@@@@::;;%%%%%%%%' 
Oo%%%%%%%%%%%%,::::;;a@@@@@'  ,@@@::;;%%%%%%%' 
`OOo%%%%%%%%%%,::::@@@@@'    @@;::;%%%%%%' 
`OOOo%%%%%%%%,:::@@@@,;;;,a@:;;%%%%%' 
`OOOOOo%%%%%,:::@@@aaaa@';;%%%%' 
`OOOO;@@@@@@@@aa@@@@@@@@@' 
  ;@@@@@@@@@@@@@@@@@@@' 
   @@@@@@@@'`@@@@@@@@' 
   `@@@@@'    @@@@@' 
    `@@'       @@'
                """);
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
 }//end class
     
 
 