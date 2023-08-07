public class May8 {
    public static void main (String[] args){

        int [] orgArray = {1, 2, 3, 4};

        int [] copyArray = new int [orgArray.length-1];

        int copyIndex = 0;

        int target = 3;

        for (int i = 0; i < orgArray.length; i++){
            if (orgArray[i]!=target){
                copyArray[copyIndex]=orgArray[i];
                copyIndex++;
            }
        }

        for (int value: copyArray){
            System.out.println(value);
        }
    }
    
}
