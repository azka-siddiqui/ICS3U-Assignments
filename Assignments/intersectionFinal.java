/**
 * @Author: Azka Siddiqui       @Date: March 28, 2023
 * @class: intersection
 * @Description: This program will simulate being at a traffic intersection, with certain signs for weekdays and weekends
 * If it a weekday and a red light, you cannot turn right
 * If it is a weekend you cannot turn left
 * There may be a green light, red light, advance light, or oncoming traffic and the program will tell you what you can do in the scenario
*/
 import java.util.Scanner;
 class intersection{ //open class
    public static void main(String[]args){//open main
      
      //Variable declaration and initialization

      Scanner uI = new Scanner(System.in);
      boolean advanceLight;
      boolean greenLight;
      boolean oncomingTraffic;
      boolean isWeekday;

      boolean left;
      boolean right;
      boolean straight;
      boolean stop;

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
      
      if (isWeekday){ //if it is a weekday and a red light, you cannot turn right
        if ((advanceLight && greenLight) || (!advanceLight && greenLight && !oncomingTraffic)){ //test
            left = true; 
            straight = true;
            right = true;
            stop = false;
            
        } else if (advanceLight && !greenLight){ //test
            left = true;
            straight = false;
            right = false;
            stop = false;

        } else if (!advanceLight && greenLight && oncomingTraffic){ //test
            left = false;
            straight = true;
            right = true;
            stop = false;

        } else { // test
            left = false;
            straight = false;
            right = false;
            stop = true;
        }
        
     } else { //if it is a weekend you cannot turn left

        if (greenLight){//test
            left = false;
            straight = true;
            right = true;
            stop = false;
             
        } else { //test
            left = false; 
            straight = false;
            right = true;
            stop = false; 
        } 

     }// end of if statement

     // program output

     System.out.printf("%s\n", "============================");
     System.out.printf("You can make a left = %s\nYou can make a right = %s\nYou can go straight = %s\nYou must stop = %s\n", left, right, straight, stop);
        
   }// close main
}// close class
      


      