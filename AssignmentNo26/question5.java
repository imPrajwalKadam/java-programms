/*
5. Write a program which 2 strings from user and concat second string 
after first string. (Implement strcat() function). 
Input : "Marvellous Infosystems" 
 "Logic Building" 
Output : "Marvellous Infosystems Logic Building"
*/
import java.util.*;

class question5
{
   public static void StrCpyX(String str1, String strInsrt)
   {
      char ch[] = str1.toCharArray();
      
      for(int  i= str1.length()-1; i>=0; i--)
      {
         strInsrt = ch[i] + strInsrt+" ";
      }
      System.out.println(strInsrt+"\t\tOutput" );
   }
   public static void main(String arg[])
   {
      
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter First String : ");
      String str  = sobj.nextLine()+" ";
      System.out.println("Enter Second String : ");
      String strInsert = sobj.nextLine();
      StrCpyX(str, strInsert);
   }
}