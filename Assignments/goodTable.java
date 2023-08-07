import java.util.Scanner;

class goodTable {
  public static void main(String[] args) {
    //initialization and declaration of variables
    int row = 0;
    int col1 = 0;
    int col2 = 0;
    int num = 1;
    int userCol = 0;
    int userRow = 0;

    Scanner uI = new Scanner(System.in);

    System.out.print("How many rows would you like? ");
    userRow = uI.nextInt();

    System.out.print("How many columns would you like? ");
    userCol = uI.nextInt();
    userCol = userCol+1;
    
    System.out.println("  A B C");
    System.out.println("  =====");

 
    while (row <= userRow){
        System.out.printf("%d", num);
        num++;
        
        while (col1 < userCol){
        System.out.print("| ");
        col1++;
        }
        System.out.println("");
        System.out.print(" ");

        while (col2 < (userCol*2)){
        System.out.print("-");
        col2++;
        }
        System.out.println("");
        col1 = 0;
        col2 = 0;
        row++;
    }
    col1 = 0;
    col2 = 0;  
  }
}