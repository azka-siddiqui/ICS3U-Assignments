import java.util.Scanner;
public class redLightGreenAGAIN {

    public static void main(String [] args){

        Scanner uI = new Scanner(System.in);

        Boolean advanceLight = false;
        Boolean greenLight = false;
        Boolean oncomingTraffic = false;
        Boolean Weekday = false;
        Boolean left = false;
        Boolean right = false;
        Boolean straight = false;
        Boolean stop = false;

        System.out.println("Is there an advance light? Enter yes or no.");
        if ((uI.next()).equalsIgnoreCase("yes")){
            advanceLight = true;
        }

        System.out.println("Is there a green light? Enter yes or no.");
        if ((uI.next()).equalsIgnoreCase("yes")){
            greenLight = true;
        }

        System.out.println("Is there oncoming traffic? Enter yes or no.");
        if ((uI.next()).equalsIgnoreCase("yes")){
            oncomingTraffic = true;
        }

        System.out.println("Is it a weekday? Enter yes or no.");
        if (uI.next().equalsIgnoreCase("yes")){
            Weekday = true;
        }

        System.out.printf("Advance Light = %s\nGreen light = %s\nOncoming Traffic = %s\nIt is a weekday = %s\n================================================", advanceLight, greenLight, oncomingTraffic, Weekday);

        if (greenLight = true){
            straight = true;
            stop = false;
        }

        System.out.println(greenLight);
        if (Weekday && !oncomingTraffic && greenLight){
            left = true;
            left = true;
            right = true;
        }

        System.out.println(greenLight);
        if (!Weekday && !oncomingTraffic && greenLight){
            left = false;
            right = true;
        }

        System.out.printf("\nYou can make a left = %s\n You can make a right = %s\n You can go straight = %s\n You must stop = %s", left, right, straight, stop);
    }
    
}
