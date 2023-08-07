/* @Author: Azka Siddiqui               @Date: May 30, 2023
 * @Description: This program has an array of values and a specified target value. The program will remove all 
 * instances of the target value, and the remaining array values will move down the list to fill the empty spaces. 
 * The program will change all the target values to -1 and display them at the end of the array. 
 */

import java.util.Arrays;//import scanner class

class AzkaProblemSet212022 {//open Main class
    public static void main(String[] args) {//open main method

        //Variable Declaration and Initialization
        // Create an array of integers
        int[] originalArray = {1, 4, 55, 3, 4, 1, 7, 92393, 23993, 383, 3, 4, 5 , 1838};

        // Specify the value to be omitted
        int target = 4;

        //Program Output
        System.out.println("Original array: "+ Arrays.toString(originalArray));//Prints original array

        originalArray = omitTarget (originalArray, target);//assigns modified array to Original Array

        System.out.println("Array after removing target value: " + Arrays.toString(originalArray));//Prints modified array
    } //close main method

    //Program Execution
    public static int [] omitTarget(int[] array, int target) {//method returning array with target value ommitted
        
        int copyIndex = 0;//copy index is the index for the modified array

        for (int i = 0; i < array.length; i++) {//iterates through array
            if (array[i] != target) {//if statement checks if the element is not equal to the target value, in which case it assigns the element to the array
                array[copyIndex] = array[i];//array element equals original value, reassigns element
                copyIndex++;//increment copy index 
            }
        }

        while (copyIndex < array.length) {//while the copy index position is less than the length of the array it replaces that element with -1 (fills in empty elements at the end with -1)
            array[copyIndex] = -1;
            copyIndex++;//update
        }

        return array;//returns array
    }//close method
} //close Main class



