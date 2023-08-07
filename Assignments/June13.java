class June13 {

    public static void main (String [] args){

        int x = 5;
        int a = 2;
        int b = 0;

        System.out.println("This code is wack");
        a = 3;

        if (x==5){
            a+=2;
            b--;
        }

        do {

            while (a < 2){
                a--;
            }

            if (a==5){
                a = 6;
            }

        } while (a < 5);

        while (b < 8){

            a = b + x;
            b++;

            if (b==6){
                x++;
            }

        }

    }
    
}
