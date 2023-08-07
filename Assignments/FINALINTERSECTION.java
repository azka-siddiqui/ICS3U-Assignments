/**
 * @Author: Azka Siddiqui       @Date: March 28, 2023
 * @class: intersection
 * @Description: This program will simulate being at a traffic intersection, with certain signs for weekdays and weekends
 * If it a weekday and a red light, you cannot turn right
 * If it is a weekend you cannot turn left
 * There may be a green light, red light, advance light, or oncoming traffic and the program will tell you what you can do in the scenario
*/
 import java.util.Scanner;
 class FINALINTERSECTION{ //open class
    public static void main(String[]args){//open main
      
      //Variable declaration and initialization

      Scanner uI = new Scanner(System.in);
      boolean advanceLight = false;
      boolean greenLight = false;
      boolean oncomingTraffic = false;
      boolean isWeekday = false;
      boolean left = false;
      boolean right = false;
      boolean straight = false;
      boolean stop = false;

    //Program Input: assigns user input to boolean variables
    System.out.println("Enter true or false for the following:");
    System.out.print("Advance Light = ");
    advanceLight = uI.nextBoolean(); 
    
    System.out.print("Green Light = ");
    greenLight = uI.nextBoolean();
    
    System.out.print("Oncoming Traffic = ");
    oncomingTraffic = uI.nextBoolean();
    
    System.out.print("Weekday = ");
    isWeekday = uI.nextBoolean();

    //Program Execution
    left = isWeekday && (advanceLight || (greenLight && !oncomingTraffic));
    right = (greenLight || !isWeekday);
    straight = (greenLight); 
    stop = (!left && !right && !straight); 

     // program output

     System.out.printf("%s\n", "============================");
     System.out.printf("You can make a left = %s\nYou can make a right = %s\nYou can go straight = %s\nYou must stop = %s\n", left, right, straight, stop);
        
   }// close main
}// close class
      
