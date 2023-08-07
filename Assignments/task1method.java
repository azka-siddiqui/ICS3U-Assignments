import java.util.Scanner;
public class task1method {
    public static void main (String [] args){

        Scanner uI = new Scanner (System.in);

        int numEqualSigns;
        int numAsterisks;

        System.out.print("How many equal signs? ");
        numEqualSigns = uI.nextInt();

        System.out.print("How many asterisks? ");
        numAsterisks = uI.nextInt();

        System.out.println("\nPart 1: ");
        lineBreak(numEqualSigns, numAsterisks);
        System.out.println("\nPart 2: ");
        lineBreak(numEqualSigns, numAsterisks);
        System.out.println("\nPart 3: ");
        lineBreak(numEqualSigns, numAsterisks);
        System.out.println("\nPart 4: ");
        lineBreak(numEqualSigns, numAsterisks);

    }

    private static void lineBreak(int x, int y){

        for (int i = 0; i < x; i++){
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < y; i++){
            System.out.print("*");
        }

    }
    
}
