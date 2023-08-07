/*******************************************************************************************************
 * Description: This program will print a table with 4 columns and any number of rows
 *////////////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.util.Scanner; 
class 4coltable {
  public static void main(String[] args) {
    
    int userRows = 0;
    Scanner userInput = new Scanner (System.in); 


    System.out.print("How many rows do you want to print? "); 
    userRows = userInput.nextInt(); 
    

    System.out.println("    A | B | C | D |");
    System.out.println("   ================");

  
    for (int x = 1; x <= userRows; x++) { 
      System.out.println(x + " |   |   |   |   |");
      System.out.println("-------------------");
    }
    
    userInput.close();

  }
}