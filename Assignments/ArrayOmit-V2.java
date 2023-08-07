/* This program will create a copy of the original array and omit the target values, and all empty elements will be 
 * replaced with -1.
 */

class May30Array1D {
    public static void main (String [] args){
        
                 // Create an array of integers
                 int[] originalArray = {1, 4, 55, 3, 4, 1, 7};
                
                 // Specify the value to be omitted
                 int target = 4;
                 
                 // Copy the array while omitting the specified value
                 int [] copiedArray = new int[originalArray.length];
                 int copyIndex = 0;
                 
                 for (int i = 0; i < originalArray.length; i++){//use original array as length condition
                     if (originalArray[i] != target) {
                         copiedArray[copyIndex] = originalArray[i];//copy index is the index for the copied array
                         copyIndex++;//incrememet copy index
                    }
                 }

                 for (int a = 0; a < originalArray.length; a++){
                    if (copiedArray[a] == 0){//replaces all empty elements with -1
                        copiedArray[a] = -1;
                    }
                 }
                 
                 //Print out the copied array
                 System.out.println("The copied array is: ");
                 for (int value: copiedArray){
                    System.out.println(value);
                 }
         
    }
    
}
