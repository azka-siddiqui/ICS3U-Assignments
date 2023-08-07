/***********
 * @Author: A. Siddiqui      @Date: 3/21/2023
 * @Instructor: A. Carreiro
 * @Class: whiile test
 * @Description: This program will check if selection is the word bird
 */

import java.util.Scanner;

class whiiletest{
    public static void main (String[]args){
        //variable declaration and initialization
        Scanner uI = new Scanner(System.in);
        String word = "bird"; 
        String selection = "";

/**
 * String.equals(string to compare)
 * Let's say that we want to compare word with the string "bird"
 * We would then type word.equals("bird") <--- This will return true if the value of word is bird
 * 
 * We can also do this:
 * selection.equals(word) <--- Remember that word is a string and the equals method will compare the values and not the reference
 * */ 

        System.out.print("Please type in a word:  ");
        selection = uI.next();

        if (selection.equals(word)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}