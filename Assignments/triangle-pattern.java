// this program will print a triangle-pattern of asterisks

class trianglePattern {
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
