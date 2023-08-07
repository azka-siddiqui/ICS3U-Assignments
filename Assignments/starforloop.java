/*******************************************************************************************************
 * Description: This program will print a right-triangle star pattern in java using a for loop
 *////////////////////////////////////////////////////////////////////////////////////////////////////////

 class starforloop {
    public static void main (String [] args){

        for(int i = 0; i < 4; i++){//number of rows
            for (int j = 0; j <= i; j++){//columns
                System.out.print("*");
            }
            System.out.println();//used to move to the next row after all stars have been printed for the current row.
        }
    }
 }