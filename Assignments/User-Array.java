import java.util.Scanner;
public class arraY6 {
    public static void main(String[] args) {
    
        Scanner userInput = new Scanner (System.in); 
        int user = 0;
    
        System.out.print("Please enter a length for the array: ");
         user = userInput.nextInt(); 
    
        int [] x = new int [user];
        
        for (int i = 0; i<x.length; i++){
          System.out.printf("Please enter %d array values separated by a space: ", user);
          x[i] = userInput.nextInt(); 
            
        }
    
        for (int i=0; i<x.length; i++){
          System.out.println(x[i]); 
        }
    
        System.out.println(""); 
        System.out.println("==========================================");
        for(int value:x){
          System.out.println(value); 
        }
      }
    }
