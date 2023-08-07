/*
 * The following program prompts the user to enter the names of 10 friends. 
 * The program then outputs the fourth and seventh name to the screen.
 */

import java.util.Scanner;
public class m3 {
    public static void main (String[]args){

        Scanner uI = new Scanner(System.in);

        String [] friends = new String [10];

        for (int i = 0; i < friends.length; i++){
            System.out.printf("Please enter the name of friend %d: ", i+1);
            friends[i] = uI.next();
        }

        System.out.println("The fourth name you entered is: "+ friends[3]);

        System.out.println("The seventh name you entered is: "+ friends[6]);
        
    }
    
}
