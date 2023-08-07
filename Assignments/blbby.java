import java.util.Scanner;
public class blbby {
    public static void main (String [] args) {

        Scanner uI = new Scanner(System.in);

        String name = "";
        double length = 0;

       System.out.println("What is your name?");
       name = uI.next();

        System.out.printf("Hello %s, please enter the length: ", name);
        length = uI.nextDouble();

        double volume = length*length*length;

        System.out.printf("A cube with dimensions %.1f X %.1f X %.1f=%.1f cubic units", length, length, length, volume);
        
    }
    
}