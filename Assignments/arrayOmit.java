class arrayOmit {

    public static void main (String [] args){

         // Create an array of integers
         int[] originalArray = {8, 29, 49, 2, 5};
        
         // Specify the value to be omitted
         int target = 8;
         
         // Copy the array while omitting the specified value
         int [] copiedArray = new int[originalArray.length - 1];
         int copyIndex = 0;
         
         for (int i = 0; i < originalArray.length; i++){//use original array as length condition
             if (originalArray[i] != target) {
                 copiedArray[copyIndex] = originalArray[i];//copy index is the index for the copied array
                 copyIndex++;
             }
         }
         
         //Print out the copied array
         System.out.println("The copied array is: ");
         for (int value: copiedArray){
            System.out.println(value);
         }
     }
 }
 
     