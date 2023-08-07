/*******************************************************************************************************
 * Description: This program will print a right-triangle star pattern in java using a nested while loop
 *////////////////////////////////////////////////////////////////////////////////////////////////////////

class starwhileloop {
    public static void main (String [] args){
        
        int col = 0;
        int row = 0;
          
        while (row < 4){
            row++;
            col = 0;
            while (col < row){
                System.out.print("*");
                col++;
            }
        System.out.println();
        }
              
    }
}
          