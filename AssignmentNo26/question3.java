/*
3. Write a program which accept string from user and copy capital 
characters of that string into another string. 
Input : "Marvellous Multi OS" 
Output : "MMOS"
*/
import java.util.*;

class question3
{
   public static void StrCpyX(String str1, String strInsrt)
   {
      char ch[] = str1.toCharArray();
      
      for(int  i= str1.length()-1; i>=0; i--)
      {
         if((ch[i] >= 'A') &&(ch[i] <= 'Z') )
         {
            strInsrt = ch[i] + strInsrt;
         }
      }
      System.out.println(strInsrt+"\t\tInside Another String" );
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