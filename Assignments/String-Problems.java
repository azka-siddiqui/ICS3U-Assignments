class problemset17 {
    public static void main (String [] args){

        String str = "Hello Azka";

        String s2 = " Secondary School";

        String Str2 = str.concat(s2); 

        System.out.println(Str2);


        String str3 = "Learning to code is fun!";
        System.out.print(str3.substring(12, 16));

        System.out.println();
        System.out.println(str3.indexOf("f"));

        /*
         * Using a for loop and the string methods provided. 
         * Print out every third letter in the following string to decipher the message.
         */

         String s4 = "moC{popidqnirnnoxgxh xiimqnrs xvJfeazhvqpauv mlcwuajonqb vbbrcecb mtfbuuzanpa,cx iabbguswt{e hasrzoqblzxvkyiyonmjgob {{tjfhkyeqa znlkborxgqqisjcjzasllyr lqpgruogzvfzuclpmejzsdq pvistsgs tmgiorgzedraittfxemerlh alfquutdnjt.";

         for (int i = 0; i < s4.length(); i++){
            if ((i+1)%3==0){
                System.out.print(s4.charAt(i));
        }
    }

        String firstName = "Azka";
		String lastName = " Siddiqui";
		String fullName = firstName.concat(lastName);

        System.out.println();
        System.out.println(fullName);


    }
}
