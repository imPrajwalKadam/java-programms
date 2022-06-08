/*
1. Accept Character from user and check whether it is alphabet or not 
(A-Z a-z). 
Input : F 
Output : TRUE 
Input : & 
Output : FALSE
*/
import java.util.*;

class question1
{
   static boolean ChkAlpha(char ch)
   {
      System.out.println(ch);
      if(Character.isLetter(ch)==true)//inbuilt method isLetter
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
   System.out.println("Enter character ");
   // char ch = sobj.next().charAt(0);
   char ch = sobj.next().charAt(0);
      
      

    bRet = ChkAlpha(ch);
    if(bRet == true)
    {
       System.out.print("it is character ");
    }
    else
    {
      System.out.print("it is not character ");
    }
   }
}