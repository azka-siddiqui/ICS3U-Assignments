/*******
 * Description: Assure input
 * First the scanner does .nextInt() is it checks if the scanner is empty
 * Then it checks if everything up to the next space or entern key is an integer value
 * NextLine goes to /n or the end of the scanner, whichever comes first
 */

import java.util.Scanner;

class rangeAssure {
    public static void main (String [] args){

        Scanner uI = new Scanner(System.in);
        int x = 0;
        System.out.print("Please enter an integer between 5 and 10: ");// the scanner is empty so it will wait for input

        while (!uI.hasNextInt()){
            System.out.println("Invalid input. Please try again.");
            uI.next();
            System.out.print("Please enter an integer between 5 and 10: ");
        }
    
        x = uI.nextInt();

        while (x<5 || x>10){
            uI.nextLine();//dumps scanner
            System.out.print("Please enter an integer between 5 and 10: ");
            x = uI.nextInt();
        }

        System.out.printf("The number you entered is %d.", x);

    }
}//close main class 