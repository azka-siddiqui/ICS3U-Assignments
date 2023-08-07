class TrickyArray {
    public static void main (String [] args){

        int target = 13;
        int [] arrayA = {37,24,58,13,19,35};
    
        for (int i = 0; i < arrayA.length; i++){
          if(arrayA[i] == target){
            arrayA[i] = arrayA[i+1];
    
            for (int a = i; a <= arrayA.length || a >= arrayA.length ; a++){
             arrayA[i+1] = arrayA[a+2];
               if (a > arrayA.length){
                arrayA[a] = -1;
              }
            }
        
          }

          System.out.println(arrayA[i]);
          
        }
    }
    
}
