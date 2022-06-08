/*
5. Accept division of student from user and depends on the division 
display exam timing. There are 4 divisions in school as A,B,C,D. Exam 
of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM. 
(Application should be case insensitive) 
Input : C 
Output : Your exam at 9.20 AM 
Input : d 
Output : Your exam at 10.30 AM 
*/
import java.util.*;
class question5
{
   static void ChkAlpha(char ch)
   {
      if(ch=='A')
      {
         System.out.println(" Your exam at 7 AM ");
      }
      if(ch=='B')
      {
         System.out.println(" Your exam at 8.30 AM ");
      }
      if(ch == 'C')
      {
         System.out.println(" Your exam at 9.20 AM ");
      }
      if(ch == 'D')
      {
         System.out.println(" Your exam at 10.30 AM ");
      }
   }
   public static void main(String arg[])
   {
   boolean bRet;
   Scanner sobj = new Scanner(System.in);
   System.out.println("Enter : ");
   // char ch = sobj.next().charAt(0);
   char ch = sobj.next().charAt(0);
      
      

   ChkAlpha(ch);
   
   }
}