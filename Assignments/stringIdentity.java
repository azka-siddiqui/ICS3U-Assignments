class May17 {
    public static void main (String [] args){

        String n1 = "Andy";
        String n2 = "Andy";
        String n3 = new String("Andy");

        System.out.println("n1 == n2: " + (n1==n2));
        System.out.println("System.identityHashCode(n1): " + System.identityHashCode(n1));
        System.out.println("System.identityHashCode(n2): " + System.identityHashCode(n2));
        System.out.println("n1 == n3: " + (n1==n3));
        System.out.println("System.identityHashCode(n3): " + System.identityHashCode(n3));
        System.out.println("n1.equals(n3): "+n1.equals(n3));

        //String concatenation:

        String s1 = "Azka";
        String s2 = "Siddiqui";

        String s1Ands2 = s1+s2;
        System.out.println(s1Ands2);

        //or you could do: 

        s1 += "Siddiqui";
        System.out.println(s1);

        //or you could do

        String s3 = "Azka";
        String s1Ands2Again;
        s1Ands2Again = s3.concat(s2);
        System.out.println(s1Ands2Again);
    }
    
}
