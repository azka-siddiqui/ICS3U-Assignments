/**
 * Create a text-based role playing game
 * Your game will be an escape style game and contain the following elements:
    A 5 point life system.
    Three challenges to complete that will award you one item per challenge.
    Each challenge become progressively harder.
    A final battle with the Boss to escape your captivity.
 * 
 * Every time you win a challenge you are awarded an item
 * The name is used throughout the game in output messages
 * Intial life count of 5 lives
 * 4 rooms user may choose from
 * Rooms 1-3 will challenge the user to a number-guessing game, in three tries, challenges get progressively harder
 * First room should have 1-3 guessing, if outside range lost point, all input must handle errors
 * Second room is numbers 1-4 guessing (or more)
 * Third room is number 1-10 guessing
 * When the player wins the room (guesses number within 3 tries),
 * If they get the first room they get rock, second is paper, third is scissors
 * When you have collected all three items, a fourth room appears and in this room you will have a best of three match
 * of rock paper scissors
 * You can select any room upon entering the game but you cannot select 4 unless you have all three items
 * Create a cheat code, for testing purposes, if i enter the username cheat lowercase, then any time i enter a room I know
 * the number, and when I enter the boss room I know what move the boss is going to play
 * 
 * A useful array
 * While loop and for loop, while loop is optional
 * Must use a switch
 * Explain everything block by block or line by line as comments
 * Create a storyline, don't just say "please enter enter a number"
 * Use ASCII art or other art
 * Zork - example text based adventure game
 * Copy and paste code into replit at the end
 * Think of aspects of the game that are repeated, and incorporate those as methods
 */

class cptNotes{
    public static void main (String [] args){

        System.out.println("Welcome to the fantastical land of Wonderland, where you'll embark on a whimsical adventure through Wonderland, solving puzzles and riddles to find your way back home.\n");
        
        System.out.println("*whoosh*\nYou were just following that peculiar white rabbit but now you find yourself in a room with doors all around you and a table in the centre. \nTime and gravity seem to have stopped, so you decide to explore the shelves and objects on the walls of the tunnel\n\nAt the end of the tunnel you find yourself in a long hall, surrounded by locked doors of all sizes. You find a key, which opens the tiniest door of all.\n\nAfter peering through the door you dishearteningly confirm that you are too big to fit through and travel to the garden outside.");
        System.out.println("\nTo get to outside to the garden you must collect drink the DRINK ME bottle but you discover that the table is much too high.\n\nYou also need to find the white rabbit, which is seeming more improbable as the seconds pass.\n\nThen, you need to make out the riddle that the Cheshire Cat will tell you and you will receive but you discover the Cheshire Cat has a bad habit of disappearing before you can guess the right answer!\n\nFinally, you must win a game of croquet against the Queen of Hearts, but it isn't the kind of croquet you are used to. Instead of mallets and balls, the Queen's version uses flamingoes and hedgehogs, who become unruly when you try to use them.\n\n");
        System.out.println("Only once you have completed these tasks will you be able to leave Wonderland, but to help you along the Cheshire Cat offers you a deal.\n\nIf you win the the games he has set out for you, you can leave Wonderland.\n\nIf you win the first game, you will be given an ace of clubs, and be able to escape the room with the many doors without drinking the suspicious-looking potion.\n\nIf you win the second game, you will find get a Jack of Hearts from the White Rabbit and he will help you escape Wonderland.\nIf you win the third game, you will be given the answer to the riddle that is one of your keys to leaving Wonderland and get a King of Clubs.\nOnly once you have gotten these three cards will you be able to progress to the final challenge.\n\nIf you win the final challenge you will win the game of crochet and the Queen will reward you with a Queen of Hearts.\n\nWith these four cards you can finally return home. Be wary of a deal with the Cheshire Cat, however, as there is always a catch——you only have three tries for each game. You will begin with 5 lives, so be careful and good luck!");

    }

    public static void GameTitle(){//open Paper method for ASCII art

        System.out.println("""
            _____                             __       __)                                 
            (, /  |   /) ,           ,        (, )  |  /          /)         /)          /) 
              /---|  //    _   _      __         | /| / _____   _(/  _  __  // _  __   _(/  
           ) /    |_(/__(_(___(/_  _(_/ (_       |/ |/ (_) / (_(_(__(/_/ (_(/_(_(_/ (_(_(_  
          (_/                                    /  |                                       
                                                                                       
                """);

    }
}