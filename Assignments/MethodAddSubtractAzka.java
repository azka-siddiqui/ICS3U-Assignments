/*
 * This program will ask the user for two numbers and display the difference and sum of the two numbers.
 * This makes use of a method with a parameter of two integers.
 */


import java.util.Scanner;

    class MethodAddSubtractAzka {
    public static void main (String [] args){

        Scanner uI = new Scanner(System.in);

        int num1, num2;

        System.out.print("Please enter number 1: ");
        num1 = uI.nextInt();

        System.out.print("Please enter number 2: ");
        num2 = uI.nextInt();

        addSubtract(num1, num2);

    }

    private static void addSubtract (int x, int y){

        int difference = Math.abs(x - y);
        System.out.println("\nThe difference is: " + difference);

        int addition = x + y;
        System.out.println("The sum is: " + addition);

    }
    
}
