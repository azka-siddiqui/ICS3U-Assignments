/*****
 * Create an array with 5 elements with random values. Print the array values out, one per line.
*/////

class arrayTask2 {
   public static void main (String [] args){

       int [] a = new int [5];//declaration and creation of array

       System.out.println("\nThe numbers are..");
       for (int i = 0; i < a.length; i++) {
       a[i] = (int)(Math.random()*100); // storing random integers in the array
       System.out.println(a[i]); // printing each array element
       }
   }
   
}
