import java.util.Scanner; 

class mama2 {

  //this assures user input, program will not crash and user will simply be asked to try again
  private static int assureInput (Scanner uI){
    while (!uI.hasNextInt()){
      System.out.println("Invalid input, please try again");
      uI.next();
    }
    return uI.nextInt();
  }

  //design
  private static void lineBreak() { 
    System.out.println("--------------------------------------------------");
  }
  
  public static void main(String[] args) {
    //initialization and declaration of variables
    int roomChoice = 0; //room choice
    int lives = 5; //player lives
    int playerGuess = 0; //player input
    int tries = 0; //attempts
    String userName = ""; //player username
    Scanner uI = new Scanner (System.in); //user input

    //room availabilities
    Boolean roomAvailable1 = false;
    Boolean roomAvailable2 = false;
    Boolean roomAvailable3 = false;
    
    Boolean game = true;//a condition for the while loop which will help the game end 
    
    //array for items that need to be collected to enter the 4th room
    String [] items = new String [3]; 
    items [0] = "rock"; 
    items [1] = "paper";
    items [2] = "scissors"; 

    //initialization and declaration of variables for the 4th room
    int bossPoints = 0; //bosses points
    int playerPoints = 0; //player points
    int bossChoice = 0; //bosses choice in rock paper scissors

    System.out.print("Please enter your username: \n"); //asks for username
    userName = uI.nextLine(); //this variable is now the players username
    
    lineBreak();
    
    //Game introduction + Story line 
    System.out.println("""
░██╗░░░░░░░██╗░█████╗░██████╗░██████╗░██╗░█████╗░██████╗░
░██║░░██╗░░██║██╔══██╗██╔══██╗██╔══██╗██║██╔══██╗██╔══██╗
░╚██╗████╗██╔╝███████║██████╔╝██████╔╝██║██║░░██║██████╔╝
░░████╔═████║░██╔══██║██╔══██╗██╔══██╗██║██║░░██║██╔══██╗
░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║██║░░██║██║╚█████╔╝██║░░██║
░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░╚════╝░╚═╝░░╚═╝""");
    System.out.printf("Welcome %s\n", userName);
    System.out.println("You are the hero of a city called Elysia");
    System.out.println("A place of magic and happiness");
    System.out.println("But one day there was a sudden attack from the monsters of the forest! The first attack in 100 years!");
    System.out.println("The sudden attack caught you off guard, you were captured and thrown into a prison deep into the forest");
    System.out.println("You must go through the dungeon and escape!");

    //rules
    lineBreak();
    System.out.println("In each dungeon you will play a number guessing game, the difficulty increases (if you go in order).");
    System.out.println("After completing a room you will obtain an item, you must collect all 3 items because having these 3 items are necessary to fight the final battle against the boss");
    System.out.println("You have 5 lives, you must make it through the dungeons without losing all 5");
     System.out.println("The rock paper scissors game will have 3 rounds.");
    System.out.println("But remember, the boss shows no mercy, if you lose then you lose completely, if you tie then you must play until the boss or you wins. You must be winning by 2 to completely win!");
    lineBreak();
    System.out.println("Good luck hero!");

    //while loop makes sure game only runs until lives are 0, and player wins are 2 or until the game is false
    while (lives != 0 && game == true){
    
    //menu
    lineBreak();
    System.out.println("\nWelcome to the menu\n");
    System.out.printf("You have %d lives left\n", lives);
    System.out.println("Dungeons:\n");
    System.out.println("Dungeon 1");
    System.out.println("Dungeon 2");
    System.out.println("Dungeon 3");
    System.out.println("Dungeon 4");

    // random number for each room
    int randNum1 = (int) (Math.random() * 3 + 1);
    int randNum2 = (int) (Math.random() * 4 + 1);
    int randNum3 = (int) (Math.random() * 5 + 1);
      
    System.out.println("Please choose a dungeon:");//asks the user to choose a room
  
    while (true){//ensures the user input is within the range
      roomChoice = assureInput(uI);
      if (roomChoice >= 1 && roomChoice <= 4){
        break;
      }
      System.out.println("Out of range, please try again"); //if not in range
    }
    
    switch (roomChoice){

      case 1: 
        if (roomChoice == 1){//ensures this case only runs when the input is 1
        //if the room was already completed then they won't be able to enter it again
        if (roomAvailable1 == true){ //locks the room
          System.out.println("You have already completed this dungeon, please choose another dungeon.");
          break;
        }

        lineBreak();//design

        //dialogue

        // .equals a method that compares two strings that will show the number if the user inputs "cheat"
        if (userName.equals("cheat")) {
            System.out.println("You entered a cheat code at the beginning of the game");
            System.out.printf("[This dungeon's number is %d]\n\n", randNum1);
          } 

          tries = 3; //sets tries to 3

          do{
            System.out.println("Please guess a number from 1-3");//asks for user guess
            while (true){ //ensuring that the number inputed is in range
              playerGuess = assureInput(uI); //assures input
              if(playerGuess >=1 && playerGuess <= 3){//if in range then break
                break;
              }
              System.out.println("Out of range, please try again");//not in range
            } 
            if (playerGuess == randNum1){ //if the number is correct
              System.out.println("You guessed the correct number! You have completed this dungeon. Please choose another dungeon");
              System.out.printf("You have obtained: %s\n", items[0]); //obtained rock
              roomAvailable1 = true;//sets the room to true so user can't enter it again
              break;//ends this case and goes back to the menu
            }else{
              //if the number is not correct
              System.out.println("You did not guess the correct number!\n");//dialogue
              tries--; //subtracts tries
            }
            
          }while (tries > 0);

          //if player does not guess correctly, lives will be decreased
        if (playerGuess != randNum1){
          lives--;
          lineBreak();
          System.out.println("You ran out of tries and have been kicked out of the dungeon.");//dialogue
        }
        }//end of room choice 1
        
      case 2:
        if (roomChoice == 2){//ensures this case only runs when the input is 2
        //if the room was already completed then they won't be able to enter it again
        if (roomAvailable2 == true){ //locks the room
          System.out.println("You have already completed this dungeon, please choose another dungeon.");
          break;
        }

        lineBreak();//design

        //dialogue

        // .equals a method that compares two strings that will show the number if the user inputs "cheat"
        if (userName.equals("cheat")) {
            System.out.println("You entered a cheat code at the beginning of the game");
            System.out.printf("[This dungeon's number is %d]\n\n", randNum2);
          } 

          tries = 3; //sets tries to 3

          do{
            System.out.println("Please guess a number from 1-4");//asks for user guess
            while (true){ //ensuring that the number inputed is in range
              playerGuess = assureInput(uI); //assures input
              if(playerGuess >=1 && playerGuess <= 4){//if in range then break
                break;
              }
              System.out.println("Out of range, please try again");//not in range
            } 
            if (playerGuess == randNum2){ //if the number is correct
              System.out.println("You guessed the correct number! You have completed this dungeon. Please choose another dungeon");
              System.out.printf("You have obtained: %s\n", items[1]); //obtained paper
              roomAvailable2 = true;//sets the room to true so user can't enter it again
              break; //ends this case and goes back to the menu
            }else{
              //if the number is not correct
              System.out.println("You did not guess the correct number!\n");
              tries--;
            }
            
          }while (tries > 0);

          //if player does not guess correctly, lives will be decreased
        if (playerGuess != randNum2){
          lives--;
          lineBreak();
          System.out.println("You ran out of tries and have been kicked out of the dungeon."); //if user runs out of tries then this would run
        }
        }//end of room choice 2

      case 3: 
        if (roomChoice == 3){//ensures this case only runs when the input is 3
        //if the room was already completed then they won't be able to enter it again
        if (roomAvailable3 == true){ //locks the room
          System.out.println("You have already completed this dungeon, please choose another dungeon.");
          break;
        }

        lineBreak();//design

        //dialogue

        // .equals a method that compares two strings that will show the number if the user inputs "cheat"
        if (userName.equals("cheat")) {
            System.out.println("You entered a cheat code at the beginning of the game");
            System.out.printf("[This dungeon's number is %d]\n\n", randNum3);
          } 

          tries = 3; //sets tries to 3

          do{
            System.out.println("Please guess a number from 1-5");//asks for user guess
            while (true){ //ensuring that the number inputed is in range
              playerGuess = assureInput(uI); //assures input
              if(playerGuess >=1 && playerGuess <= 5){//if in range then break
                break;
              }
              System.out.println("Out of range, please try again");//not in range
            } 
            if (playerGuess == randNum3){ //if the number is correct
              System.out.println("You guessed the correct number! You have completed this dungeon. Please choose another dungeon");
              System.out.printf("You have obtained: %s\n", items[2]);//obtained scissors
              roomAvailable3 = true;//sets the room to true so user can't enter it again
              break;//ends this case and goes back to the menu
            }else{
              //if the number is not correct
              System.out.println("You did not guess the correct number!\n");
              tries--;
            }
            
          }while (tries > 0);

          //if player does not guess correctly, lives will be decreased
        if (playerGuess != randNum3){
          lives--;
          lineBreak();
          System.out.println("You ran out of tries and have been kicked out of the dungeon."); //if user runs out of tries then this would run
        }
        }//end of room choice 3

      case 4:
        //if user input is 4 then this case runs
        if (roomChoice == 4){
          //if user input is 4 but not all the rooms have been completed, then this runs
        if (roomChoice == 4 && roomAvailable1 != true || roomAvailable2 != true || roomAvailable3 != true){
          System.out.println("You have not completed all the dungeons and obtained all the items yet, please complete the other dungeons before entering this room.");
          break;
        }
          //dialogue
    System.out.println("\nYou have entered the final dungeon, prepare to fight the boss!");
    System.out.println("You will face the boss in a rock paper scissors game");
    System.out.println("If you tie you must keep playing until the boss or you wins, you must be winning by 2 to win the whole game");
    System.out.println("Are you ready?");
          
           for (int i = 3; i > 0; i--) {
              System.out.println(i);
            }
             System.out.println("""

███████╗██╗░██████╗░██╗░░██╗████████╗██╗
██╔════╝██║██╔════╝░██║░░██║╚══██╔══╝██║
█████╗░░██║██║░░██╗░███████║░░░██║░░░██║
██╔══╝░░██║██║░░╚██╗██╔══██║░░░██║░░░╚═╝
██║░░░░░██║╚██████╔╝██║░░██║░░░██║░░░██╗
╚═╝░░░░░╚═╝░╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░╚═╝""");//design
          
          for (int round = 1; round < 4; round++){
            if (lives == 0){ //if you run out of lives
          System.out.println("\nYou lost all of your lives!");
          System.out.println("You failed to get through all the dungeons!");
          System.out.println("The citizens of Elysia will now perish.");
          System.out.println("GAME OVER!");
          game = false;
          System.exit(0);
        } 
            bossChoice = (int) (Math.random() * 3) + 1;//bosses choice in the game
             System.out.println("\nRound " + round + ":");
            if (userName.equals("cheat")) { //this is so that if the username is a cheat code the answer is printed
            System.out.println("You entered a cheat code at the beginning of the game");
            System.out.printf("[The bosses choice is %d]\n\n", bossChoice);
          } 
            System.out.printf("If you lose a round you lose a life. You have %d lives left be careful!\n", lives);
     System.out.print("Choose your move (1 - Rock, 2 - Paper, 3 - Scissors):\n ");
            while (true){ //ensuring that the number inputed is in range
              playerGuess = assureInput(uI); //assures input
              if(playerGuess >=1 && playerGuess <= 3){//if in range then break
                break;
              }
              System.out.println("Out of range, please try again");//not in range
            }
             
            if (playerGuess >=1 || playerGuess <=3){ //if the player guess is in the range
              
    //switch that decides the winner of the round
    switch (playerGuess) { 
  case 1: // User chooses Rock
    if (bossChoice == 1) {
  System.out.println("It's a tie!");
  } else if (bossChoice == 2) {
    System.out.println("Boss wins!");
      lives--;
    bossPoints++; //adds to boss points
  } else {
   System.out.println("You win!");
  playerPoints++; //adds to player points
  }
break;

    case 2: // User chooses Paper
       if (bossChoice == 1) {
           System.out.println("You win!");
          playerPoints++; //adds to player points
         } else if (bossChoice == 2) {
          System.out.println("It's a tie!");
           } else {
             System.out.println("Boss wins!");
         lives--;//decrease lives if boss wins
            bossPoints++; //adds to boss points
            }
          break;

case 3: // User chooses Scissors
if (bossChoice == 1) {
      System.out.println("Boss wins!");
  lives--;
       bossPoints++; //adds to boss points
      } else if (bossChoice == 2) {
    System.out.println("You win!");
   playerPoints++; //adds to player points
     } else {
      System.out.println("It's a tie!");
     }
     

        break;

  default:
   System.out.println("Invalid move. Please try again."); //invalid move
   round--;
     break;
   }//end of switch
     }//end of if loop
       }//end of for loop
           if (playerPoints >= 2) { //if player gets to 2 wins first
      System.out.println("Congratulations! You defeated the boss and escaped!");
             System.out.println("After defeating the boss you proceed to save the citizens of Elysia and free them from the monsters!"); 
             System.out.println("The citizens praise you, and you will be remembered forever!");
             System.out.println("""
██╗░░░██╗██╗░█████╗░████████╗░█████╗░██████╗░██╗░░░██╗██╗
██║░░░██║██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗╚██╗░██╔╝██║
╚██╗░██╔╝██║██║░░╚═╝░░░██║░░░██║░░██║██████╔╝░╚████╔╝░██║
░╚████╔╝░██║██║░░██╗░░░██║░░░██║░░██║██╔══██╗░░╚██╔╝░░╚═╝
░░╚██╔╝░░██║╚█████╔╝░░░██║░░░╚█████╔╝██║░░██║░░░██║░░░██╗
░░░╚═╝░░░╚═╝░╚════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░╚═╝""");
             lineBreak();
             System.out.println("Thanks for playing!");
             lineBreak();
             game = false;
             break;
      }  if (bossPoints >= 2) { //if boss gets to 2 wins first
        System.out.println("\nYou lost to the boss! You did not win by 2!");
             System.out.println("You have been slain by the boss");
             System.out.println("Without a hero the citizens perish.");
             System.out.println("""
██████╗░███████╗███████╗███████╗░█████╗░████████╗██╗
██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██║
██║░░██║█████╗░░█████╗░░█████╗░░███████║░░░██║░░░██║
██║░░██║██╔══╝░░██╔══╝░░██╔══╝░░██╔══██║░░░██║░░░╚═╝
██████╔╝███████╗██║░░░░░███████╗██║░░██║░░░██║░░░██╗
╚═════╝░╚══════╝╚═╝░░░░░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝""");
             lineBreak();
             System.out.println("GAME OVER!");
             lineBreak();
             game = false;
             break;
         } else{
             System.out.println("You were not able to defeat the boss, and the boss was not able to defeat you. You are both at a stale mate, you leave the dungeon to come back and try again. Remember, you must try your best to win!");
             playerPoints = 0;//resets the variables for when the player retries the room
             bossPoints = 0;//resets the variables for when the player retries the room
         }
          
        }//end of room choice 4

      default:
        if (lives == 0){ //if you run out of lives
          System.out.println("\nYou lost all of your lives!");
          System.out.println("You failed to get through all the dungeons!");
          System.out.println("The citizens of Elysia will now perish.");
          System.out.println("""
██████╗░███████╗███████╗███████╗░█████╗░████████╗██╗
██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██║
██║░░██║█████╗░░█████╗░░█████╗░░███████║░░░██║░░░██║
██║░░██║██╔══╝░░██╔══╝░░██╔══╝░░██╔══██║░░░██║░░░╚═╝
██████╔╝███████╗██║░░░░░███████╗██║░░██║░░░██║░░░██╗
╚═════╝░╚══════╝╚═╝░░░░░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝""");
          lineBreak();
          System.out.println("GAME OVER!");
          lineBreak();
          game = false;
        } 
        
    }//end of switch
    }//end of game while loop
      
    
    
  }//end of main method
}//end of class main