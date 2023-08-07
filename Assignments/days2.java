/* *************************************************
*@Author: Azka Siddiqui    Date: April 19, 2023
*@Instructor: A. Carreiro
*@Class: DaysOfTheMonthAzka2.java
*@Description: This program will ask the user for the year and month and output how many days are in that month. 
*************************************************************/

import java.util.Scanner;//import scanner class

class days2 {//open Main class
    public static void main (String [] args){//open main method

        //Variable declaration and initialization
        Scanner uI = new Scanner(System.in);//instantiate scanner object
        int year = 0;
        String month = "";
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
        while (!(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")||month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")||month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")||month.equalsIgnoreCase("September")||month.equalsIgnoreCase("November")||month.equalsIgnoreCase("December"))){
            uI.nextLine();//dumps scanner
            System.out.print("Invalid month.\nPlease enter a month (eg. January):\n");
            month = uI.next();
        }

        month = month.substring(0, 1).toUpperCase() + month.substring(1);//capitalizes first letter of month

        //Program execution
        switch (month){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                days = 31;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                days = 30;
                break;
            case "February":
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

    } //close main method
}//close Main class

