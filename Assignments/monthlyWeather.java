/***************************************************************************************************************************
* @Author: Azka Siddiqui   @Date: April 27, 2023
* monthlyWeather.java
* Description: This program will output the average rainfall, average snowfall, and highest and lowest average temperature for each month in Toronto, Ontario.
*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class monthlyWeather {//open Main class
    public static void main (String [] args){//open main method

        //variable declaration and initialization
        //arrays are declared, created and initialized
        String [] months = {"January", "February", "March", "April", "May", "June", "July","August", "September", "October", "November", "December"};
        int [] avgHigh = {-1, -1, 5, 12, 19, 24, 27, 26, 22, 15, 8, 2};//array containing elements for average highest temperature per month
        int [] avgLow = {-9, -9, -4, 2, 8, 14, 16, 16, 11, 5, 0, -5};//array containing elements for average lowest temperature per month
        double [] avgRain = {1.36, 1.38, 2.12, 3.69, 4.58, 4.80, 4.68, 4.52, 5.23, 4.91, 3.88, 2.35};//array containing elemetns for average rainfall per month
        int [] avgSnowDays = {8, 7, 6, 2, 0, 0, 0, 0, 0, 0, 3, 7};//array containing elements for average snow days per month
    
        //program execution and output
        //first row in chart containing titles of groups
        System.out.printf("%-15s%20s%20s%25s%25s\n\n", "Month", "Avg High", "Avg Low", "Avg Rain cm", "Avg Days of Snow");
        for (int i = 0; i < 12; i++) {//as i increments, the array goes through data for the specified month, followed by the next on a separate line
            System.out.printf("%-29s%-21d%-23d%-24.2f%-21d\n", months[i], avgHigh [i], avgLow [i], avgRain [i], avgSnowDays [i]); 
        }

    }//close main method
}//close Main class
