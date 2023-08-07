import java.util.Scanner;
public class dowhileprep {

    public static void main(String [] args){
//prompt the person to enter an integer between 0 and 60
//keep asking until the number is between 1 and 60, inclusive

        Scanner uI = new Scanner (System.in);

        int number;

        do {
        System.out.println("Please enter a number between 0 and 60: ");

        while (!uI.hasNextInt()){
            uI.nextLine();
            System.out.println("Please enter a number between 0 and 60: ");
        }
        number = uI.nextInt();

        } while (number < 0 || number > 60);

        System.out.printf("The number you entered is %d.", number);

    }
    
}
