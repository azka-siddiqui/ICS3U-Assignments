/* *************************************************
*@Author: Azka Siddiqui    Date: April 19, 2023
*@Instrutor: A. Carreiro
*@Description: This program will ask the user for the year and month and output how many days are in that month. 
*************************************************************/
import java.util.Scanner;//import scanner class

class DaysOfTheMonthAzka {//open Main class
    public static void main (String [] args){//open main method

        //Variable declaration and initialization
        Scanner uI = new Scanner(System.in);//instantiate scanner object
        int year = 0;
        String month = "";
        String month2 = "";
        int days = 0;

        //User input
        System.out.println("Please enter a year: ");

        while (!uI.hasNextInt()){//Assure input for year
            System.out.println("Invalid entry. Please enter a year.");
            uI.next();
        }

        year = uI.nextInt();

        uI.nextLine();//dumps scanner
        System.out.println("Please enter a month (eg. January): ");
        month = uI.next();

        //Check for invalid input for month
        while (!(month.equalsIgnoreCase("january")||month.equalsIgnoreCase("february")||month.equalsIgnoreCase("march")||month.equalsIgnoreCase("april")||month.equalsIgnoreCase("may")||month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")||month.equalsIgnoreCase("september")||month.equalsIgnoreCase("november")||month.equalsIgnoreCase("december"))){
            uI.nextLine();//dumps scanner
            System.out.print("Invalid month.\nPlease enter a month (eg. January):\n");
            month = uI.next();
        }

        month2 = month.toLowerCase();

        //Program execution
        switch (month2){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;
            case "february":
                if (((year%4==0) && (!(year%100==0))) || ((year%4==0) && (year%400==0))){//test for leap year
                    System.out.println("It's a Leap Year!");
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }

        //Program output
        System.out.printf("%s %d has %d days.", month, year, days);

    }  
}