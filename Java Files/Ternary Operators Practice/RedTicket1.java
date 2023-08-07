/***
 * Date: March 30, 2023
 * Class: RedTicket
 * Description: You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If
 * they are all the value 2, the result is 10. Otherwise if they are all the same, the
 * result is 5. Otherwise so long as both b and c are different from a, the result is 1.
 * Otherwise the result is 0.
 */
 
 package ICS3U1.Assignments;
 
 class RedTicket1{
    public static void main (String[]args){

       // can change these int values to check for different scenarios 
       int a = 2;
       int b = 2;
       int c = 5;
       
        int result = a==2 && b==2 && c==2 ? 10 : a == b && b == c && a == c ? 5 : a != b && c != a ? 1 : 0;
        System.out.println(result);
    }
}