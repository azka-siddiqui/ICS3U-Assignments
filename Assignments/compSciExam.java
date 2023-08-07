import java.util.Scanner;
class compSciExam{
    public static void main (String [] args){

        Scanner uI = new Scanner(System.in);

        /*How many objects are present after the following code is executed:
         * double [ann] = new double [7];
         * double [] bob;
         * bob = ann;
         *  
         * The first line declares and initializes a new array of type double with a length of 7. 
         * It creates an object in memory to store the array elements and assigns the reference to that object
         * to the variable ann. So, we now have an array object with 7 double values. 
         * 
         * The second line declares a new variable bob of type double[] without initializing it. 
         * At this point, the variable bob doesn't refer to any object.
         * 
         * The third line assigns the value of ann (which is a reference to the array object created in step 1) to 
         * the variable bob. Now, both ann and bob are referencing the same array object in memory; both variables now 
         * point to the same array object.
         * 
         * One object is present after the code is executed.
         */

        double num = 3.142536462547253623;

        System.out.printf("%10.2f\n", num);

        double num1 = 2.6;
        System.out.printf("%.2f", num1);

        System.out.println();

        String dog = "I am a fat dog";

        System.out.println(dog.substring(7, 10));

        System.out.println(dog.indexOf("fat"));

    
        System.out.printf("%10s%5d%5f", "Andy", 40, 5.9);
    }
}