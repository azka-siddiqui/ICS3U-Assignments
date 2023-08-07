/*****
 * Create an array with 5 elements with random values. Print the array values out, one per line. 
 * Find the maximum value in an array of 5 integers and display it.
*/////

class arrayTask3 {
    public static void main (String [] args){

        int [] a = new int [5];//declaration and creation of array
 
        System.out.println("\nThe numbers are..");
        for (int i = 0; i < a.length; i++) {
        a[i] = (int)(Math.random()*100); // storing random integers in the array
        System.out.println(a[i]); // printing each array element
        }

        int largest = a[0];
        int smallest = a[0];

        for (int i = 1; i<a.length; i++){
            if (a[i] > largest){
                largest = a[i];
            } else if (a[i]<smallest){
                smallest = a[i];
            }
        }
        //int[]y -> not even declared
        //y = new int [5]; -> 5 is the number of elements in the array

        System.out.printf("The smallest number in the array is %d. The largest number in the array is %d.", smallest, largest);
    }
    
 }