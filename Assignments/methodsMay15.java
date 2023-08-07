//yay methods

public class methodsMay15 {
    public static void main (String [] args){

        System.out.println("Part 1: ");
        lineBreak(5);
        System.out.println("Part 2: ");
        lineBreak(7);
        System.out.println("Part 3: ");
        lineBreak(10);
        System.out.println("Part 4: ");
        lineBreak(15);
        System.out.println("Part 5: ");
        lineBreak2(5,5);
        
        System.out.println(myMeth());

        System.out.println("The number 5 is even: " + isEven(5));

    }

    private static void lineBreak (int x){
        //x as a variable only belongs to the lineBreak method, it is not accessible to anything else

        for (int i = 0; i < x; i++){
            System.out.print("=");
        }
        System.out.println("");

        for (int i = 0; i < x; i++){
            System.out.print("*");
        }
        System.out.println("");

        //System.out.println("**********************************************************************");
        //System.out.println("======================================================================");

    }

    private static void lineBreak2 (int x, int y){

        for (int i = 0; i < x; i++){
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < y; i++){
            System.out.print("*");
        }

    } 
    //JVM looks for the main method every time program runs (i.e. public static void main..)
    //you never leave the main when running a method
    //this right now is void meaning that it does not return anything and does not accept parameters
    //void means no return, only runs what is in the method
    //a method can return a type: public static String... -> this method is not void and now returns a string

    private static String myMeth(){
        String word = "\nBird";
        return word;
    }

    //Method below returns true if a number is even

    private static boolean isEven (int x){

        System.out.println();
        if (x%2==0){
            return true;
        } else {
            return false;
        }

    }

    /*
     * Code a method that does addition and subtraction of two integers.
     * Ask the user for two numbers.
     * Write two methods, one for addition and one for subtraction, and display the results
     */


}
