import java.util.Scanner;

class ModuloOperator {
    public static void main(String [] args) {

        Scanner uI = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = uI.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is an even number.");
        else
            System.out.println(num + " is an odd number.");
    }
}

  