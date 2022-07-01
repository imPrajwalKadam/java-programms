/*
 2. Write a program which accept string from user and copy the 
contents of that string into another string. (Implement strncpy() 
function) 
Input : "Marvellous Multi OS" 
 10 
Output : "Marvellous" 
Note : If third parameter is greater than the size of source string then 
copy whole string into destination.  
*/
import java.util.*;

class question2
{
   public static void StrCpyX(String str1, String strInsrt,int iCnt)
   {
      char ch[] = str1.toCharArray();
      
      for(int  i= iCnt; i>=0; i--)
      {
         strInsrt = ch[i] + strInsrt;
      }
      System.out.println(strInsrt+"\t\tIn Another String" );
   }
   public static void main(String arg[])
   {
      String strInsert = "";
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter String : ");
      String str = sobj.nextLine();

      System.out.println("enter length : ");
      int ino = sobj.nextInt();
      StrCpyX(str, strInsert, ino-1);
   }
}