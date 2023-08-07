import java.util.Scanner;
class testmay20 {

        private static Scanner uI = new Scanner(System.in);
        private static int numGuess = 0;
        private static int randnum = 2;
        private static int lives = 5;
        private static int rounds = 0;
        private static Boolean AceOfSpades = false;
    public static void main (String [] args){

        for (int i = 0; i<5; i++){
        System.out.print("Guess a number between 1 and 3: ");

        numGuess = lolly(uI, numGuess);

        System.out.printf("Your guess is %d", numGuess);

        polly(numGuess, randnum, lives, rounds, "AceofSpades", AceOfSpades);
        System.out.println(AceOfSpades);
        }

        }


    public static int lolly (Scanner uI, int numGuess){

            while(!uI.hasNextInt()){
                System.out.print("\nInvalid entry. Please enter a number: ");
                uI.next();
            }
            
            numGuess = uI.nextInt();

            return numGuess;
    }

    public static void polly (int numGuess, int randnum, int lives, int rounds, String a, Boolean b){
        if (numGuess != randnum) {
            lives--;
            rounds++;
            System.out.printf("\nYou guessed incorrectly! You have %d more tries. Your life count is %d lives.\n", 3-rounds, lives);
        } else {
        System.out.printf("\nYour guess is correct. Congratulations you got the %s and entered into the garden!", a);
        b = true;
        }
        }

    }
    
