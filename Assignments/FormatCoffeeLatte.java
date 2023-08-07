
class CoffeeLatte {
    public static void main (String [] args) {
        
    String itemName = "Latte";
    double itemCost = 5.98;
    double itemTax = 0.78;
    double cost = 6.76;

    System.out.printf("%s\t\t%s\n", "Item", " Cost");
    System.out.println("=====================");
    System.out.printf("%s\t\t%s%s\n", itemName, "$", itemCost);
    System.out.printf("%s\t\t%s%.2f\n", "HST", "$", itemTax);
    System.out.println("=====================");
    System.out.printf("%16s%s%.2f", "Total= ", "$", cost);
    System.out.println();


    }

}