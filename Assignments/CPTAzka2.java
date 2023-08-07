import java.util.Scanner;
class CPTAzka2 {

    private static Scanner uI = new Scanner(System.in);
    private static int userChoice = 0;
    public static void main (String [] args){

        String name = null;
        boolean JackOfDiamonds = false, KingOfClubs = false, QueenOfHearts = false, AceOfSpades = false;
        int randnum, BossChoice;
        int x = 0, bossScore = 0, playerScore = 0, userguess = 0, rounds = 0, lives = 5, difference = 0;

        GameTitle();

        System.out.println("*whoosh*\nYou were just following that peculiar white rabbit but now you find yourself in a room with doors all around you and a table in the centre. \nTime and gravity seem to have stopped, so you decide to explore the shelves and objects on the walls of the tunnel.\n\nAt the end of the tunnel you find yourself in a long hall, surrounded by locked doors of all sizes. You find a key, which opens the smallest door of all.\n\nAfter peering through the door you find that you are too big to fit through and travel to the garden outside.");
        System.out.println("\nTo get outside to the garden you must collect drink the DRINK ME bottle but you discover that the table is much too high.\n\nYou also need to find the white rabbit, which is seeming more improbable as the seconds pass.\n\n");
        Cheshire();
        System.out.println("Then, you need to figure out the answer to the riddle that the Cheshire Cat will tell you but he has a bad habit of disappearing before you can guess the right answer!\n\nFinally, you must win a game of croquet against the Queen of Hearts, but it isn't the kind of croquet you are used to. Instead of mallets and balls, the Queen's version uses flamingoes and hedgehogs, who become unruly when you try to use them.\n");
        System.out.println("Only once you have completed these tasks will you be able to leave Wonderland, but to help you along the Cheshire Cat offers you a deal.\n\nIf you win the games he has set out for you, you can leave Wonderland.\n\nIf you win the first game, you will be given an Ace of Spades, and be able to escape the room with the many doors without drinking the suspicious-looking potion.\n\nIf you win the second game, you will get a Jack of Diamonds from the White Rabbit and he will help you escape Wonderland.\n\nIf you win the third game, you will be given the answer to the riddle that is one of your keys to leaving Wonderland and get a King of Clubs.\n\nOnly once you have gotten these three cards will you be able to progress to the final challenge.\n\nIf you win the final challenge the Queen will reward you with a Queen of Hearts card. With these four cards you can finally return home. Be wary of a deal with the Cheshire Cat, however, as there is always a catch. You only have three tries for each game. You will begin with 5 lives, so be careful and good luck!");
    
        System.out.print("\nEnter your name: ");

        while (uI.hasNextInt()){
            System.out.print("Time is ticking! Please enter your name: ");
            uI.next();
        }
        name = uI.next();

        System.out.printf("\nWelcome to Wonderland %s.\n", name);

        do {
            if (lives==0){
                System.out.println("\nOh no, you lost all your lives! Time to paint the red roses white, and most importantly, try not to go mad!");
                break;
            }
           userChoice = 0;
           options();

           userChoice = assureGuess(uI, userChoice);

            while (userChoice < 1 || userChoice > 4){
             System.out.print("\nInvalid choice. Please enter a number between 1 and 4: ");
             userChoice = assureGuess(uI, userChoice);
            }

            switch (userChoice){

                case 1:

                if(AceOfSpades){
                    System.out.println("\nYou already have this card! Get the other cards so you can escape Wonderland.");
                    break;
                }

                System.out.println("\nA card appears on the table, but it is still too high up. All of a sudden a caterpillar holding a cigar appears and when you look closely you notice that the caterpillar is holding a card. To get this card you must play a number-guessing game with him.");
                
                randnum = (int)(Math.random()*3+1);
                cheatGuess(name, randnum);

                while (rounds <= 2 && lives > 0 && AceOfSpades == false){

                System.out.print("\nGuess a number between 1 and 3: ");

                userguess = assureGuess(uI, userguess);

                if (userguess != randnum) {
                
                    lives--;
                    rounds++;
                    System.out.printf("\nYou guessed incorrectly! You have %d more tries. Your life count is %d lives.\n\n", 3-rounds, lives);

                } else {
                System.out.println("\nYour guess is correct. Congratulations you got the Ace of Spades and entered into the garden!");
                AceOfSpades = true;
                }
                }
                break;

            
            case 2:

                if(JackOfDiamonds){
                    System.out.println("\nYou already have this card! Get the other cards so you can escape Wonderland.");
                    break;
                }

                System.out.println("\nYou find yourself at a tea party, and see the Mad Hatter. You see the Mad Hatter examining the card he is holding while looking back and forth between you and the card. He tells you he will give you the card if you can get the right answer, but this time it's harder!");
                randnum = (int)(Math.random()*4+1);

                cheatGuess(name, randnum);

                rounds = 0;
                
                while (rounds <= 2 && lives > 0 && JackOfDiamonds == false){

                System.out.print("\nGuess a number between 1 and 4: ");

                userguess = assureGuess(uI, userguess);

                if(userguess != randnum){

                    lives--;
                    rounds++;
                    System.out.printf("\nYou guessed incorrectly! You have %d more tries. Your life count is %d lives.\n", 3-rounds, lives);

                } else {
                System.out.println("\nYour guess is correct. Congratulations you got the Jack of Diamonds! The Mad Hatter also tells you where to find the white rabbit and that he must help you now that you have the Jack of Diamonds. You are almost out of Wonderland!");
                JackOfDiamonds = true;
                }

                }
                break;

            case 3:

                if(KingOfClubs){
                    System.out.println("\nYou already have this card! Get the other cards so you can escape Wonderland.");
                    break;
                }

                System.out.println("\nYou find yourself in the thick of a forest, and see the Cheshire Cat. You flashes a mischevious grin at you and disappears, as if challenging your ability to win this game.");
                randnum = (int)(Math.random()*5+1);

                cheatGuess(name, randnum);

                rounds = 0;
                
                while (rounds <= 2 && lives > 0 && !KingOfClubs){

                uI.nextLine();

                System.out.print("\nGuess a number between 1 and 5: ");

                userguess = assureGuess(uI, userguess);

                if (userguess != randnum) {
                    
                    lives--;
                    rounds++;
                    System.out.printf("\nYou guessed incorrectly! You have %d more tries. Your life count is %d lives.\n", 3-rounds, lives);

                } else {
                System.out.println("\nYour guess is correct. Congratulations you got the King of Clubs! The Mad Hatter also tells you where to find the white rabbit and that he must help you now that you have the Jack of Diamonds. You are almost out of Wonderland!");

                KingOfClubs = true;

                }
                }
                break;

                case 4:

                if (userChoice==4 && (!AceOfSpades || !KingOfClubs || !JackOfDiamonds)) {
                    System.out.println("\nYou have to get the other three cards first before you can enter this room!");
                }

                if (userChoice==4 && AceOfSpades && KingOfClubs && JackOfDiamonds){
                    System.out.println("\nWelcome to the final battle, the Jabberwocky's Rock Paper Scissors Showdown!\n");
                    rounds = 0;
                    playerScore = 0;
                    bossScore = 0;
                    x = 0;
                    difference = 0;
                    do { 
                            rounds++;
                            System.out.printf("Round %d: ", rounds);
                            
                            do { 
                              BossChoice = (int)(Math.random()*3+1);//generates random number for the computer's move
            
                              if (name.equals("cheat")){
                                System.out.printf("\n\nShh! I'll let you in on a secret; the Jabberwocky chose move %d!\n", BossChoice);
                              }

                              System.out.printf("Choose a move: \n1. Rock\n2. Paper\n3. Scissors\n");
                             
                              userChoice = assureGuess(uI, userChoice);

                              } while (userChoice < 1 || userChoice > 3); 

                              moves(userChoice);
              
                              System.out.println("\nNice move! Let's see what the Jabberwocky chose!");
                          
                              moves(BossChoice);

                              if (userChoice == BossChoice) {
                  
                                    System.out.println("You tied!"); 
                          
                                   } else if (userChoice == 1 && BossChoice == 3 || userChoice == 2 && BossChoice == 1 || userChoice == 3 && BossChoice == 2) { 
                                      System.out.println("\nCongratulations! You won and scored a point!"); 
                                      playerScore++;
                          
                                  }else{
                                    System.out.println("\nYou lost, try again!");
                                      bossScore++; 
                                  }
                              System.out.printf("Your score is %d. The Jabberwocky's score is %d.\n\n", playerScore, bossScore);
                              difference = Math.abs(playerScore-bossScore);

                              if (userChoice != BossChoice){
                                x++;//any match that does not result in a tie counts as a round
                              }
                        
                        } while (difference != 2 && x<3); //game ends when a player has 2 wins
                
                        if (playerScore > bossScore) {//test for if the player is the winner
                          QueenOfHearts=true;
                          System.out.printf("Congratulations %s, you defeated the Jabberwocky and got the Queen of Hearts card! You won %d games to %d.\nYou acquired all the cards and can finally return home!", name, playerScore, bossScore);
                          break;

                        } else {
                          System.out.printf("Sorry %s, you lost. The Jabberwocky won the game. You lost %d games to %d.\n", name, playerScore, bossScore);
                          lives--;
                          System.out.printf("You have %d lives left.\n", lives);
                        }
                }
            }
        } while (!KingOfClubs||!AceOfSpades||!JackOfDiamonds||!QueenOfHearts);
}

    private static void GameTitle(){

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

    private static void Cheshire(){

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
⠀⠀⠙⠿⣿⣿⣿⣿⣧⠀⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠁⠀⢀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢻⣇⢙⣿⣿⣿⣿⣿⣿⡿⡛⣿⢫⣹⣿⣿⡇
⠀⠀⠀⠀⢸⣿⣿⣿⣿⣷⣤⡀⠀⠀⠉⠙⡛⠛⠛⠛⠛⠉⠉⠀⠀⠀⢀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢨⡛⠸⢿⠟⡛⢿⡅⠙⡕⢡⡇⠿⣹⣿⣿⠁
⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣶⣦⣄⣀⣡⣀⣀⣀⣀⣀⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⢰⣾⠘⣛⣸⡇⢸⣿⣿⡇⢾⢹⣿⠏⠀
⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠸⣯⣬⣿⣦⣓⣼⣇⣬⣿⣿⣿⣶⣿⠋⠀⠀
⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠁⠀⠀⠀
⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠿⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠙⠛⠿⠿⠿⠟⠋⠁⠈⠙⠛⠿⠿⠿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                """);
    }

    private static void options(){
        String [] options = {"\n------------- Choose a round -----------------", "1: Get the Ace of Spades card and enter the garden.", "2. Get the Jack of Diamonds card and find the mysterious rabbit.", "3. Get the King of Clubs card and get the answer to the riddle.", "4. Get the Queen of Hearts card and return home!"};
        for (int i = 0; i < options.length; i++){
            System.out.println(options[i]);
        }
    }
  
    private static void Rock(){ //open Rock method for ASCII art
        System.out.println("     ______\n---'   ____)\n      (_____)\n      (_____)\n      (____)\n---.__(___)");
    }
    
    private static void Scissors(){//open Scissors method for ASCII art
        System.out.println("    _______\n---'   ____)____\n          ______)\n       __________)\n      (____)\n---.__(___)");       
    }
    
    private static void Paper(){//open Paper method for ASCII art
        System.out.println("     _______\n---'    ____)____\n           ______)\n          _______)\n         _______)\n---.__________)");
    }

    private static void cheatGuess (String a, int b){
        if (a.equals("cheat")){
        System.out.printf("\nShh! I'll let you in on a secret; the number is %d!\n", b);
        }
    }

    private static void moves (int a){
        if (a == 1){ //
            Rock();
        } else if (a == 2){
            Paper();  
        } else {
            Scissors();
        }
    }

    private static int assureGuess (Scanner uI, int a){

        while(!uI.hasNextInt()){
            System.out.print("\nInvalid entry. Please enter a number: ");
            uI.next();
        }
        a = uI.nextInt();
        return a;
    }
}