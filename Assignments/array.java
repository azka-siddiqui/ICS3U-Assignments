import javax.print.attribute.SupportedValuesAttribute;

class array {
    public static void main (String [] args){

        String [] friends = {"Azka", "Elizabeth", "Mary", "Anne", "Tim", "John"};
        String [] numbers = {"6478238192", "4166738192", "4166734098", "4166783950", "4162338654", "6478193917"};

        for (int i = 0; i <6; i++){
            System.out.printf("\n%s's phone number is %s.", friends [i], numbers [i]);
        }

    }
    
}
