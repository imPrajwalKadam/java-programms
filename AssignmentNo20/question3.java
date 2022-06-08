/*
3. Accept Character from user and check whether it is digit or not 
(0-9). 
Input : 7 
Output : TRUE 
Input : d 
Output : FALSE 
*/
import java.util.*;
class question3
{
   static boolean ChkAlpha(char ch)
   {
      System.out.println(ch);
      if(Character.isDigit(ch)==true)//inbuilt method isLetter
      {
         return true;
      }
      else{
         return false;
      }
   }
   public static void main(String arg[])
   {
   boolean bRet;
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter : ");
   // char ch = sobj.next().charAt(0);
   char ch = sobj.next().charAt(0);
      
      

    bRet = ChkAlpha(ch);
    if(bRet == true)
    {
       System.out.print("it is Digit ");
    }
    else
    {
      System.out.print("it is not Digit ");
    }
   }
}