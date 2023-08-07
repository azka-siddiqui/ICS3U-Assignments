import java.util.Scanner;
 class Task2switch {
     public static void main (String [] args){

        Scanner uI = new Scanner(System.in);
        String userstring = "";

        System.out.print("Please enter a letter or number: ");
        userstring = uI.next();

        switch (userstring){
            case "A":
            case "B":
            case "C":
                System.out.println("ABC, 123");
            break;
            case "1":
            case "55":
            case "2":
            case "10":
                System.out.println("Numbers");
            break;
            default:
                System.out.println("You entered a different input.");
        }

     }
    }
 
         