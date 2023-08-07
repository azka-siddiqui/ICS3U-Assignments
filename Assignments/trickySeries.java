/*
*Author: Azka Siddiqui
*Teacher: A. Carriero
*Description: this program prints out different groups of numbers that follow different numerical patterns.
*/
class Main {
    public static void main(String[] args) {
      // Program output
      System.out.println("Tricky Series");
      // Program Execution
      for (double row = 1; row < 6; row = row + 0.5){
        System.out.print(row+" ");
      }
      System.out.printf("\n ");
      for (int row = 1; row < 3000; row = row*2){
        System.out.print(row+" ");
      }
      System.out.printf("\n ");
      for (int row = 1; row < 60000; row = row*3){
        System.out.print(row+" ");
      }
      System.out.printf("\n ");
      for (double row = 1000; row > 0.001; row = row/10){
        System.out.print(row+" ");
      }
      System.out.printf("\n\n ");
      System.out.println("Bonuses");
      //declaring & initializing variables, 
      for (int row = 2, fact = 1; row < 10 && fact < 9; row = row+1, fact = fact+1){
        
        System.out.printf("%d/%d ", fact, row);
      }
      System.out.printf("\n ");
      for (int row = 1, fact = 1; row < 10; row++){
        fact = fact*row;
        System.out.print(fact+" ");
      }
      System.out.printf("\n ");
      
      for (int a = 1, b = 0, c = 0, row = 1; row < 12; row++){
         
        c=a+b;
        a=b;
        b=c;
        
        System.out.print(c+" ");
      }
      
    }//End main()
  }// Main