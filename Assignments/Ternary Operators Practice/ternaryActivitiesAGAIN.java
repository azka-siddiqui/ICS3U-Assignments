import java.util.Scanner;
public class ternaryActivitiesAGAIN {
    public static void main(String [] args){

        Scanner uI = new Scanner(System.in);

        /*
         * Teen Sum
         * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19
         * inclusive, are extra lucky. So if either value is a teen, just return 19.
         * teenSum(3, 4) → 7
         * teenSum(10, 13) → 19
         * teenSum(13, 2) → 19 
         */

         System.out.print("Please enter number one: ");
         int num1 = uI.nextInt();

         System.out.print("Please enter number two: ");
         int num2 = uI.nextInt();

        int sum = num1 + num2;

         sum = (num1 > 12 && num1 < 20 || num2 > 12 && num2 < 20) ? 19 : sum;

         System.out.println(sum);

         /*
          * Last Digit
            Given three ints, a b c, return true if two or more of them have the same rightmost
            digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
            lastDigit(23, 19, 13) → true
            lastDigit(23, 19, 12) → false
            lastDigit(23, 19, 3) → true
          */

          System.out.print("Please enter the first number: ");
          int num3 = uI.nextInt();

          System.out.print("Please enter the second number: ");
          int num4 = uI.nextInt();

          System.out.print("Please enter a third number: ");
          int num5 = uI.nextInt();

          Boolean lastDigit;

          lastDigit = (num3 % 10 == num4 % 10 || num3 % 10 == num5 % 10 || num4 % 10 == num5 % 10) ? true : false;

          System.out.println(lastDigit);

          /*
           * Answer Cell
            Your cell phone rings. Return true if you should answer it. Normally you answer,
            except in the morning you only answer if it is your mom calling. In all cases, if you
            are asleep, you do not answer.
           */

           Boolean isAsleep;
           Boolean isMorning;
           Boolean isMom;
           Boolean answerCell;

           System.out.print("Is it morning? ");
           isMorning = uI.nextBoolean();

           System.out.print("Are you asleep? ");
           isAsleep = uI.nextBoolean();

           System.out.print("Is it your mom? ");
           isMom = uI.nextBoolean();

           answerCell = ((isMorning && isMom && !isAsleep) || !isMorning && !isAsleep) ? true : false;

           System.out.println(answerCell);

           /*Red Ticket
            You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If
            they are all the value 2, the result is 10. Otherwise if they are all the same, the
            result is 5. Otherwise so long as both b and c are different from a, the result is 1. */

            int result;

            System.out.print("Please enter number 1: ");
            int num6 = uI.nextInt();

            System.out.print("Please enter number 2: ");
            int num7 = uI.nextInt();

            System.out.print("Please enter number 3: ");
            int num8 = uI.nextInt();

            result = (num6 == 2 && num7 == 2 && num8 == 2) ? 10 : (num6 == num7 && num7 == num8) ? 5 : (num7 != num6 && num8 != num6) ? 1 : 0;

            System.out.println(result);
    }
    
}
