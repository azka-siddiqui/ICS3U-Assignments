class arrayomitprep {
    public static void main (String [] args){

        int [] originalArray = {12, 95, 48, 38, 18, 58};

        int [] copyArray = new int [originalArray.length-1];

        int target = 38;

        int copyIndex = 0;

        for (int i = 0; i <originalArray.length; i++){
            if (originalArray[i]!=target){
                copyArray[copyIndex] = originalArray[i];
                copyIndex++;
            }
        }

        System.out.println("The new array is: ");

        for (int value: copyArray){
            System.out.println(value);
        }

    }
    
}
