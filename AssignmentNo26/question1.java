/*1.Write a program which accept string from user and copy the 
contents of that string into another string. (Implement strcpy() 
function) 
Input : Marvellous Multi OS
Output : "Marvellous Multi OS" in another string */
import java.util.*;

class question1
{

   public static void StrCpyX(String str1, String strInsrt)
   {
      char ch[] = str1.toCharArray();
      
      for(int  i= str1.length()-1; i>=0; i--)
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
      StrCpyX(str, strInsert);

   }
}