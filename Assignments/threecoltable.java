/*******************************************************************************************************
 * Description: This program will print a table with 3 columns and any number of rows
 *////////////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.Scanner;
public class threecoltable {
    public static void main (String [] args){

        Scanner uI = new Scanner(System.in);

        //variable declaration and initialization
        int row = 0; 
        int col = 0;
        int userrows = 0;

        System.out.print("How many rows would you like?: ");
        userrows = uI.nextInt();

        System.out.println("| A | B | C | \n=============");

        while (row<userrows){ // test
            while (col<4){
                System.out.print("|   ");
                col++; //update
            }
            row++; //update
            System.out.print("\n-------------"); // divides each row
            System.out.println(); //new line for each row
            col = 0; // resets value so that pattern can restart
        }
    }
}