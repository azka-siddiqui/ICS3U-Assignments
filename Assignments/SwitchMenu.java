import java.util.Scanner;
class SwitchMenu {
    public static void main (String [] args){

        Scanner uI = new Scanner(System.in);
 
 
         //Variable declaration and initialization
         String userchoice = "";
         String filename = "";
 
 
         do {
             Menu();
             userchoice = uI.nextLine();

             switch (userchoice){
                case "Sort names alphabetically":
                    System.out.println("Sorting data...");
                    break;
                case "exit program":
                    System.out.println("Goodbye");
                    break;
             }

             while (!(userchoice.equalsIgnoreCase("Load/Open a file") || userchoice.equalsIgnoreCase("Save a file to disk") || userchoice.equalsIgnoreCase("Sort names alphabetically") || userchoice.equalsIgnoreCase("Exit program"))){
                System.out.println("Invalid selection. Try again.");
                Menu();
                userchoice = uI.nextLine();
            }
           
            while ((userchoice.equalsIgnoreCase("Load/Open a file"))){
                    System.out.print("Please enter a file name: ");
                    filename = uI.nextLine();
                    if (filename.length() > 10) {
                        System.out.println("File name exceeded the character count of 10 characters. Try again.");
                    }else{
                        System.out.printf("Opening file %s..\n", filename);
                            break;
                    }
            }

            while ((userchoice.equalsIgnoreCase("Save a file to disk"))){
                System.out.print("Please enter a file name: ");
                filename = uI.nextLine();
                if (filename.length() > 10) {
                    System.out.println("File name exceeded the character count of 10 characters. Try again.");
                }else{
                    System.out.printf("Saving file %s..\n", filename);
                        break;
                }
            }

        }while (userchoice.equalsIgnoreCase("Load/Open a file") || userchoice.equalsIgnoreCase("Save a file to disk") || userchoice.equalsIgnoreCase("Sort names alphabetically") || userchoice.equalsIgnoreCase("Exit program"));
    }

    public static void Menu(){ 
        System.out.println("------------- MENU: PLEASE SELECT ONE -----------------");
        System.out.println("Load/Open a file");
        System.out.println("Save a file to disk");
        System.out.println("Sort names alphabetically");
        System.out.println("Exit program");
    }
    
}
