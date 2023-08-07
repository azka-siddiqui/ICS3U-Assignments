/**
 * @Author: Azka Siddiqui       @Date: March 23, 2023
 * @class: march23
 * @Description: Using the .equals method to compare two strings
*/

import java.util.Scanner;
class march23{
    public static void main(String[]args){
        Scanner uI = new Scanner(System.in);

        //variable initialization and declaration

        String worda = "Bird";
        String wordc = "";

        System.out.print("Input ---->  ");//because the user inputted it it is completely different although it holds the same value
        wordc = uI.next();//"Bird";

        if (worda.equals(wordc)){// returns boolean true or false, case sensitive
            System.out.println("True");
            System.out.printf("%s is equal to %s", worda, wordc);
        } else{
            System.out.println("False");
            System.out.printf("%s is not equal to %s", worda, wordc);
        }

    }
}