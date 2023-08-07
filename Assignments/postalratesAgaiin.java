import java.util.Scanner;
public class postalratesAgaiin {
    public static void main(String [] args){

        int letters = 0;
        int pricePerLetter = 0;

        Scanner uI = new Scanner(System.in);

        System.out.print("Welcome to Canada Post International Letters!\n**From anywhere... to anyone**\nHow many letters would you like? ");
        letters = uI.nextInt();

        if (letters > 0 && letters < 10){
            pricePerLetter = 5;
        } else if (letters > 9 && letters < 20){
            pricePerLetter = 3;
        }else if (letters > 19 && letters < 40){
            pricePerLetter = 2;
        }else{
            pricePerLetter = 1;
        }

        System.out.printf("The cost per letter is $%d\nThe total cost is $%d", pricePerLetter, pricePerLetter*letters);

    }
}
