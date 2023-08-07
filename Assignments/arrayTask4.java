/*****
 * Create an array with 5 elements with random values. Print the array values out, one per line. 
 * Compute the average of the array with 5 random values.
*/////

class arrayTask4 {
    public static void main (String [] args){

        int [] a = new int [5];//declaration and creation of array
 
        System.out.println("\nThe numbers are..");
        for (int i = 0; i < a.length; i++){
        a[i] = (int)(Math.random()*100); // storing random integers in the array
        System.out.println(a[i]); // printing each array element
        }

        int sum = 0;

        for (int i = 0; i<a.length; i++){
            sum = sum + a[i];
        }

        int roundedaverage = (int)(sum/a.length+0.5);

        System.out.printf("The rounded average of the numbers in the array is %d.", roundedaverage);
    }
    
 }