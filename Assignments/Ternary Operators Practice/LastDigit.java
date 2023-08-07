/**
 * Date: March 30, 2023
 * Class: LastDigit
 * Description: Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
 */

 package ICS3U1.Assignments;
 import java.util.Scanner;
 class LastDigit{
     public static void main (String[]args){
 
         Scanner uI = new Scanner (System.in);
         int a = 0;
         int b = 0;
         int c = 0;
         boolean bool;
 
         System.out.print("Please enter a number: ");
         a = uI.nextInt();
 
         System.out.print("Please enter another number: ");
         b = uI.nextInt();
 
         System.out.print("Please enter a third number: ");
         c = uI.nextInt();

         bool = (a%10 == b%10 || a%10 == c%10 || b%10 == c%10) ? true : false;
         System.out.println(bool);
     }
}

