import java.util.Scanner;
class April13 {
    public static void main (String [] args){

        Scanner uI = new Scanner(System.in);

        int x = 0;

        do {

        System.out.print("Please enter a number between 1 and 5: ");

        while (!uI.hasNextInt()){
            System.out.print("Invalid input. Please enter a number: ");
            uI.next();
        }

        x = uI. nextInt();

        } while (x<1 || x>5);

        System.out.printf("The number you entered is %d.", x);

    }
}