
/***************************************************************************************************************************
* @Author: Azka Siddiqui   @Date: February 22, 2023
* printfname.java
* This program will print out a class attendance, and ask the user to input their first name, last name and student number, 
* which will then be included on the attendance sheet. 
*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class printfname {
    public static void main(String [] args){

        String fName0 = "";
        String lName0 = "";
        String stuNum0 = "";

        Scanner uI = new Scanner(System.in);

        System.out.print("Please enter you first name: ");
        fName0 = uI.next(); // this takes user input from the keyboard and assigns it to the variable
        System.out.print("Please enter you last name: ");
        lName0 = uI.next(); // this takes user input from the keyboard and assigns it to the variable
        System.out.print("Please enter a student no: ");
        stuNum0 = uI.next();

        System.out.printf("Hello %s %s, your student number is %s", fName0, lName0, stuNum0);

        String columnfirstName = "First Name";
        String columnlastName = "Last Name";
        String columnstudentNumber = "Student #";
        String firstName1 = "Andrew";
        String lastName1 = "Carreiro";
        String stuNum1 = "0123456789";
        String firstName2 = "Sebastian";
        String lastName2 = "Patrizio-Corbasson";
        String stuNum2 = "9876543210";

        System.out.printf("\n\n%110s", "Date: 11/19/2020");
        System.out.printf("\n%-110s", "Class Attendance");
        System.out.printf("\n%-110.110s", "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("\n%-25.25s %-26.26s %-25.25s %-6s %-6s %-6s %-6s %-6s", columnfirstName, columnlastName, columnstudentNumber, "Mon", "Tue", "Wed", "Thu", "Fri");
        System.out.printf("\n%-110.110s", "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("\n%-25.25s %-26.26s %-25.25s %-6s %-6s %-6s %-6s %-6s", firstName1, lastName1, stuNum1, "P", "P", "P", "A", "P");
        System.out.printf("\n%-25.25s %-26.26s %-25.25s %-6s %-6s %-6s %-6s %-6s", firstName2, lastName2, stuNum2, "A", "P", "L", "A", "A");
        System.out.printf("\n%-25.25s %-26.26s %-25.25s %-6s %-6s %-6s %-6s %-6s", fName0, lName0, stuNum0, "P", "P", "P", "P", "P");
        System.out.printf("\n%-110.110s", "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.printf("\n%-78s %-6d %-6d %-6.1f %-6d %-6d\n", "Total", 1, 0, 0.5, 2, 1);

    }
}