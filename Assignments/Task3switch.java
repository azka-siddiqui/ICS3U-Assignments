import java.util.Scanner;
 class Task3switch {
     public static void main (String [] args){

        Scanner uI = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        String userChoice = uI.next();
        int x = 0;
        System.out.println("10, 1, 5, 3");
        userChoice = uI.nextLine();

        switch (userChoice){
            case "10":
                x = x+10;
            case "1":
                x = x+1;
            case "5":
                x = x+5;
            case "3":
                x=x+3;
            System.out.printf("The answer is %d.", x);
        }

     }
    }