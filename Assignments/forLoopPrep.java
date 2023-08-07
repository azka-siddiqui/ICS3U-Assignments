public class forLoopPrep {
    public static void main (String [] args){

        System.out.println("Group E Tricky Sequences: ");

        for (double i = 1.0; i <= 5.5; i+=0.5){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 2048; i =  i * 2){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 59049; i =  i * 3){
            System.out.print(i + " ");
        }

        System.out.println();

        for (double i = 1000.0; i >= 0.01; i =  i/10){
            System.out.print(i + " ");
        }


    }
    
}
