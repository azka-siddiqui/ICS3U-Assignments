/***************************************************
 * 
 * @Author: Azka Siddiqui    Date: March 29, 2023
 * @Teacher: A. Carreiro
 * @Description: This program simulates being at a traffic intersection. The program will determine where the user may go based on the boolean val's they enter. 
 *
**************************************************/
import java.util.Scanner; 
class trafficLight {
  public static void main(String[] args) {

    //Variable Declaration and Intialization 
    Scanner userInput = new Scanner (System.in); 
    boolean advanceLight; 
    boolean greenLight;
    boolean oncomingTraffic;
    boolean weekday;

    boolean leftTurn; 
    boolean rightTurn;
    boolean straight;
    boolean stop;

    //Program Input 
    System.out.print("Set Advance Light = ");
    advanceLight = userInput.nextBoolean(); //assigns user input to variable
    
    System.out.print("Set Green Light = ");
    greenLight = userInput.nextBoolean();
    
    System.out.print("Set oncomingTraffic = ");
    oncomingTraffic = userInput.nextBoolean();
    
    System.out.print("Set weekday = ");
    weekday = userInput.nextBoolean(); 

    //Program Execution 
    leftTurn = (weekday && (advanceLight || (greenLight && !oncomingTraffic)));
    rightTurn = (greenLight || !weekday);
    straight = (greenLight); 
    stop = (!leftTurn && !rightTurn && !straight); 

    //Program Output
    //Program outputs the options the user has for movement. 
System.out.println("====================================");
    System.out.printf("You can make a left = %s\n", leftTurn);
    System.out.printf("You can make a right = %s\n", rightTurn);
    System.out.printf("You can go straight = %s\n", straight);
    System.out.printf("You must stop = %s", stop); 
    
  }//end of main method
}//end of class Main
