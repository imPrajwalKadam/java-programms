/*
3.Write a program which accept string from user and toggle the case. 
Input :"Marvellous Multi OS" 
Output : mARVELLOUS mULTI os
*/
import java.util.*;

class question3 {
   static void strlwrx(String str) {
      char ch[] = str.toCharArray();
      for(int i = 0; i< str.length(); i++)
      {
         if((ch[i] >= 'A')&&(ch[i] <= 'Z'))
         {
            ch[i] = (char)((int)ch[i]+32);
         }
         else if((ch[i] >= 'a')&&(ch[i] <= 'z'))
         {
            ch[i] = (char)((int)ch[i]-32);
         }
         System.out.print(ch[i]);
      }
   }
   public static void main(String arg[]) {
      Scanner sobj = new Scanner(System.in);
      System.out.print("Enter String : ");
      String str = sobj.nextLine();

      
      strlwrx(str);
   }
}