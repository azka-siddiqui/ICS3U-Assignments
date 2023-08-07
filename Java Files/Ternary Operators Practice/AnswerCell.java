/***
 * Date: March 30, 2023
 * Class: AnswerCell
 * Description: Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. 
 * In all cases, if you are asleep, you do not answer. 
 */

 package ICS3U1.Assignments;
 class AnswerCell{
     public static void main (String[]args){

         // can change these boolean values to simulate different scenarios 
         boolean isMorning = true;
         boolean isMom = false;
         boolean isAsleep = false;
         boolean bool;

         bool = (isMorning && !isAsleep && isMom || !isMorning && !isAsleep) ? true : false;
         System.out.println(bool);

     }
}

