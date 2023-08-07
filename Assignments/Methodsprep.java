/*
 * Write and call three methods that do the following:
Return the square of a number
Average 3 numbers
Double the value of a number
 */

class Methodsprep {
    public static void main (String [] args){

        System.out.printf("The average is %d, the square is %d and double the value is %d.", average(95, 87, 100), squareNum(5), doubleVal(8));

    }

    public static int average (int a, int b, int c){

        int average = (a+b+c)/3;
        return average;

    }

    public static int squareNum (int a){

        int square = a*a;
        return square;
        
    }

    public static int doubleVal (int a){

        int doubleVal = a*2;
        return doubleVal;

    }
    
}
