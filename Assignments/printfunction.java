class printfunction {
    public static void main(String [] args) {

        /*
         * printf accepts arguments inside the brackets and take symbols that are place holders 
         * for values after the literal that we want displayed. These symbols must match the values 
         * in type and in the order they are displayed.
         * 
         * %s -> string
         * %d -> integer
         * %f -> floating point or double
         * 
         * If we place a dot and a number between the % and the f we can limit the number of decimal places that will be displayed. 
         * So if we typed %.3f and the corresponding number is 3.14159, the display will be 3.142
         * 
         * If we used the dot and number on %s , we would limit the number of characters being displayed. 
         * So %.2s with a corresponding value og "Carreiro" would display Ca.
         * 
         * You can also place a number in front of the dot to indicate column spacing. 
         * If you typed out %3.2s and corresponding values is "Carreiro" you would display 
         * Ca with one space after the a because it would hold three character spaces. 
         * The automatic justification for the content is right. If you want left justification 
         * you would place a - in front of the column spacing (%-3.2s).
         */

        String name1 = "T-shirt";
        int qty1 = 5;
        double price1 = 19.99;
        String name2 = "Sweater";
        int qty2 = 2;
        double price2 = 34.98;
        String name3 = "Cardigan";
        int qty3 = 8;
        double price3 = 15.50;


        System.out.printf("My class code is %s, I want to get a grade of %d%s\n", "ICS 3U1", 100, "%");
        System.out.printf("The value of 3.14159 when displayed is %.3f\n", 3.14159);
        System.out.printf("The value of Carreiro when displayed is %.2s\n", "Carreiro");
        System.out.printf("%-3.2s", "Carreiro");
        System.out.printf("\n\n%-20.19s%-6s%-5s", "Type of clothing", "Qty", "Price");
        System.out.printf("\n%-31.31s", "--------------------------------------------------");
        System.out.printf("\n%-20.19s%-6d%-5.2f", name1, qty1, price1);
        System.out.printf("\n%-20.19s%-6d%-5.2f", name2, qty2, price2);
        System.out.printf("\n%-20.19s%-6d%-5.2f", name3, qty3, price3);

    }
}