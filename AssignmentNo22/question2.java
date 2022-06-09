/*
2. Accept character from user. If character is small display its 
corresponding capital character, and if it small then display its 
corresponding capital. In other cases display as it is. 
Input : Q 
Output : q 
Input : m 
Output : M 
Input : 4 
Output : 4 
 
Input : % 
Output : %  
*/
import java.util.*;
class question2
{
   static void ChkAlpha(char ch)
   {
      if(('a' <= ch) && ('z' >= ch ))
      {
         ch = (char)((int)ch-32);
         System.out.println(ch);
      }
      else{
         System.out.println(ch);
      }
   }
   public static void main(String arg[])
   {
   boolean bRet;
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter character ");
   // char ch = sobj.next().charAt(0);
   char ch = sobj.next().charAt(0);
      
      

    ChkAlpha(ch);
   
   }
}