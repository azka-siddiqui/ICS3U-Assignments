class arrayTest {
    public static void main (String[]args){

        //use while loops for loops as part of array
        //review everything covered in class, assignments etc.

        //This is the declaration. It simply indicates that ArrayA can hold elements that are of integer type.
        int [] ArrayA;

        //this assigns an integer array to ArrayA of five elements.
        ArrayA = new int[5];

        //in one line and the double brackets can be on either side of the variable
        double ArrayB [] = new double[5];

        //You can create an array of any type, including a class
        String [] ArrayC = new String [3];

        //You can set an array with values in it already
        //This array is of the size five
        boolean [] ArrayD = {true, false, false, true, false};

        //To go through an array we always use a for loop
        for (int i = 0; i < ArrayA.length; i++){
            //without setting the array elements their default value will be assigned
            System.out.println(ArrayA[i]);

            //assign a value to our array
            ArrayA[i]=i;
        }

        /*The index for an array always starts at 0 and asking for an element that is out of range of those indexes will
        * result in an "out of bounds" exception
        *
        * Arrays are of one type and cannot have their length altered
        *
        * Copying: You cannot copy an array just by assigning it to another array of the same type. 
        * Doing so will only copy the reference. Any modification to the 'copy' will happen to the original. This is 
        * because there is only one copy of that array in the heap.
        * e.g. double copyArrayB [] = ArrayB;
        */

        // To copy an array you should loop through each element one at a time

        int [] copyArrayA = new int [ArrayA.length];

        for (int i = 0; i < copyArrayA.length; i++){
            copyArrayA[i]=ArrayA[i];
            System.out.println(copyArrayA[i]);
        }

        //Note that when you create an array of an object like a String, that element becomes that type. That
        //means that anything you can do with a string you can do with that element.

        ArrayC[0] = "BIRD";

        //the element is a string and therefore we can do anything a string can do
        ArrayC[0] = ArrayC[0].toLowerCase();

    }

}