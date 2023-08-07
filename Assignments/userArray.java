/***************************************************************************************************************************
* @Author: Azka Siddiqui   @Date: April 28, 2023
* userArray.java
* Description: This program will create an array of the user's desired length and elements and will then display it.
*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;//import scanner class
class userArray {//open Main class
    public static void main (String [] args){//open main method

        //int array is the container

        Scanner uI = new Scanner(System.in);//initialize Scanner

        int arrayLength = 0;

        System.out.print("Please enter the length of the array: ");
        arrayLength = uI.nextInt();
 
        int [] a = new int [arrayLength];//declaration and creation of array
 
        for (int i = 0; i < arrayLength; i++) {
        uI.nextLine();
        System.out.printf("Please enter item %d: ", i+1);
        a[i] = uI.nextInt();
        }

        System.out.println("\nThe array is..");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(a[i]); // printing each array element
        }

        System.out.println("===============================================================================");

        int ArrayB [] = new int [a.length];

        for (int i=0; i<a.length;i++){
            ArrayB[i]=a[i];
        }

        for (int value: ArrayB){
            System.out.println(value);
        }
    }
 }
 