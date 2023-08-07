import java.util.Scanner;
class m1{
    public static void main (String [] args){

        Scanner uI = new Scanner (System.in);

        int arrayLength = 0;
        int largest = 0;
        int smallest = 0;
        int sum = 0;
        int avg = 0;

        System.out.print("Please enter the length of the array: ");

        while (!uI.hasNextInt()){
            System.out.print("Invalid input. Please enter a number: ");
            uI.next();
        }

        arrayLength = uI.nextInt();

        int newArray [] = new int [arrayLength];


        for (int i = 0; i< arrayLength; i++){
            newArray[i]=(int)(Math.random()*10+1);
            sum += newArray[i];
        }

        avg = (int)((sum/newArray.length)+0.5);

        smallest = newArray[0];
        largest = newArray[0];

        for (int i = 0; i< arrayLength; i++){

            if (newArray[i]<smallest){
                smallest = newArray[i];
            }
            if (newArray[i]>largest){
                largest = newArray[i];
            }
        }

        System.out.println("The array is: \n");
        for (int value: newArray){
            System.out.println(value);
        }

        System.out.printf("\nThe largest number in the array is %d, and the smallest number in the array is %d\n", largest, smallest);

        System.out.printf("The average is %d.", avg);

    }
}
