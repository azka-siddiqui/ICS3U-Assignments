/**
 * @Date: March 30, 2023
 * @Class: TeenSum
 * @Instructor: A. Carreiro
 * @Description: Given 2 ints, a and b, this program will their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky
 * If either value is a teen, the program will return 19
 */

 import java.util.Scanner;
 class TeenSum{
     public static void main (String[]args){
 
        //Variable declaration and initialization
         Scanner uI = new Scanner (System.in);
         int a = 0;
         int b = 0;
         int sum;
 
        //Program Input
         System.out.print("Please enter the first age: ");
         a = uI.nextInt();
 
         System.out.print("Please enter another age: ");
         b = uI.nextInt();

         //Program Execution
 
         sum = a >= 13 && a <= 19 || b >= 13 && b <= 19 ? 19: a+b; //ternary operator used to see if user entered an teen age or other age.  

        //Program Output 
        System.out.printf("teenSum (%d,%d) --> %d", a,b,sum); //outputs the sum of the two ages to the user. 
     }
 }