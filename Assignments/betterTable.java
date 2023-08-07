// this program uses the .repeat() method, so using a while loop is better for the time being

class betterTable {
    public static void main(String [] args){

        String asterisk = "*";

        int x = 4;
        int y = 1;


        while (y <= x){
            System.out.printf("%s \n", asterisk.repeat(y));
            y++;
        }
    }
    
}
