class classTable {
    public static void main(String [] args){
        
        // use rows and columns

        int row = 0; // how many while loops we have indicates how many rows we have
        int column = 0; // the value of the variable x indicates how many columns we have
        // the columns increment by one

        while (row < 4){
            row++;
            //nested while loop
            while (column < row){ //column is the sentinel variable
                System.out.println("*");
                column++;
            } 
        }
    }
}
