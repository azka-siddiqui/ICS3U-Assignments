import java.util.Scanner;
class methodReturn{
    public static void main (String [] args){

        Scanner uI = new Scanner (System.in);

        int num1;
        int num2;

        System.out.print("Enter number 1: ");
        num1 = uI.nextInt();

        System.out.print("Enter number 2: ");
        num2 = uI.nextInt();

        System.out.println(multiplyInts(num1, num2));
        multiplyInts2(num1, num2);

    }

    private static int multiplyInts(int x, int y){

        int total = x*y;
        return (total);

    }
    private static void multiplyInts2(int x, int y){
        int total = x*y;
        System.out.println(total);
    }

}