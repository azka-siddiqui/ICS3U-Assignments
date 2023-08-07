/*****
 * Display the original order and then the reverse order.
*/////

class arrayTask5 {
    public static void main (String [] args){

        int [] a = new int [5];//declaration and creation of array
 
        System.out.println("\nThe original array is: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100); // storing random integers in the array
            System.out.println(a[i]); // printing each array element
        }

        System.out.println("\nThe reversed array is: ");

        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
    
 }