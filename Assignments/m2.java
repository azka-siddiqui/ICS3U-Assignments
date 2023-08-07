/*
 * The following program prompts the user to enter 10 values. 
 * The program stores the values in an array, then adds all of the values up and outputs the total
 */

import java.util.Scanner;

public class m2 {
    public static void main (String [] args){

        Scanner uI = new Scanner (System.in);

        int arrLength = 0;

        int sum = 0;

        int avg = 0;

        System.out.print("How long would you like the array to be? ");

        while (!uI.hasNextInt()){
            System.out.print("Invalid input. Please enter a number: ");
            uI.next();
        }

        arrLength = uI.nextInt();

        int [] newArray = new int [arrLength];

        for (int i = 0; i<arrLength; i++){
            System.out.printf("Please enter value %d of the array: ", i+1);
            
            while (!uI.hasNextInt()){
                System.out.println("Invalid input. Please enter a number.");
                uI.next();
            }

            newArray[i]=uI.nextInt();

            sum += newArray[i];

        }

        System.out.println("Sum = " +sum);

        avg = (int)((sum/arrLength)+0.5);

        System.out.println("The array is: \n");

        for (int value: newArray){
            System.out.println(value);
        }

        System.out.printf("\nThe average of the values is %d.", avg);

    }
    
}
