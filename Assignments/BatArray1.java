/* Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 
 */

public class BatArray1 {
    public static void main (String[]args){

        int [] originalArray = new int [2];
        boolean cat = true;

        for (int i = 0; i < originalArray.length; i++){
            originalArray[i] = (int)(Math.random()*10+1);
        }

        System.out.println("The array is: ");

        for (int value: originalArray){
            System.out.println(value);
        }

        for (int a = 0; a < originalArray.length; a++){
            if (originalArray[a]==2 || originalArray[a]==3){
                cat = false;
            }
        }

        System.out.println();
        System.out.println(cat);



    }
    
}
