public class May17task2 {
    public static void main (String [] args){

        String object1 = "This is 27 characters long.";

        String subString = object1.substring(11, 21);

        String object2 = "Zara is a cat and a bat but not a fat cat";
        System.out.println(object2.indexOf("cat"));

        System.out.println("The length of the original string is: "+ object1.length());
        System.out.println("The starting index of the word \"characters\" is "+ object1.indexOf("character"));
        System.out.println(subString);

        System.out.println("My sister said that the dessert I made was \"delicious\" and that I should try it in another flavour.");

        System.out.print(object1.concat("Azka"));

        String name = "helen";

        String newname = name.replace("h", "b");

        System.out.println(newname);

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

    }
}
