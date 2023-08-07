class forEachLoop {//open Main class
    public static void main (String [] args){//open main method

        //All for loops are counting loops, could use a while loop but it is extra lines of code
        //For each loops are newer than for loops, specifically meant to iterate through iterable
        //Anything that has a list is iterable, you can iterate through it
        
        int [] ArrayA = {55,22,99};

        System.out.println("Regular for loop:");

        //regular for loop
        for (int i = 0; i < ArrayA.length; i++){
            System.out.println(ArrayA[i]);
        }

        System.out.println("============================================================");

        //for each loop -> a for loop for each element

        System.out.println("For each loop:");

        for (int value: ArrayA){//value does not exist outside this loop, its scope is within this programming block
            System.out.println(value);
        }//goes through loop, starts at first element and ends at last, no need for an index value
        //at the beginning of the loop will assign whatever the next item in the array is to 'value'


    }
}