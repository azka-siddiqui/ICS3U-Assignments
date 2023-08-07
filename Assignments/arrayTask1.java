/*****
 * Create an array with 5 elements with random values
*/////

class arrayTask1 {
    public static void main (String [] args){
 
        int [] a = new int [5];//declaration and creation of array
 
        for (int i = 0; i < a.length; i++) {
        a[i] = (int)(Math.random()*100); // storing random integers in the array
        }
    }
    
 }
 