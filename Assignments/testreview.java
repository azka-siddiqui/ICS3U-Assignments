public class testreview {

    public static void main (String [] args){

        int [] y = new int [9];
        y[0] = 7;
        y[1] = 3;
        y[2] = 4;

        System.out.println(y[0] + y[1] + " " + y[5]);

        //How many objects are present after the following code fragment has executed?

        double [] anne = new double [7];
        double [] bob;//only declaration, no array object created
        bob = anne;

        // after executing this code fragment, there will be one array object created (anne), and both anne and 
        //bob will refer to the same object.

        int [] arr = {22, 33, 78, 13};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]>0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
    
}
