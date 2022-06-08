/*
4. Accept Character from user and check whether it is small case or 
not (a-z). 
Input : g 
Output : TRUE 
Input : D 
Output : FALSE 
*/
import java.util.*;
class question4
{
   static boolean ChkAlpha(char ch)
   {
      System.out.println(ch);
      if(Character.isLowerCase(ch)==true)//inbuilt method isLetter
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
       System.out.print("it is LowerCase ");
    }
    else
    {
      System.out.print("it is not LowerCase ");
    }
   }
}