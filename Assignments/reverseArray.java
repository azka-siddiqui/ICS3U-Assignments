public class reverseArray {
    public static void main (String [] args){

        int [] original = {1,2,3,4,5};

        System.out.println("\nOriginal array:\n ");

        for (int value: original){
            System.out.println(value);
        }

        System.out.println("\nReverse array:\n ");

        for (int i = original.length-1; i >= 0; i--){
            System.out.println(original[i]);
        }

    }
    
}
