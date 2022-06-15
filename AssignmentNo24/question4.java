/*
4. Write a program which accept string from user and display only 
digits from that string.  
*/
//language : Javaimport java.util.*;
import java.util.*;
class question4 {
   static void strlwrx(String str) {
      char ch[] = str.toCharArray();
      for(int i = 0; i< str.length(); i++)
      {
         if((ch[i] >= '1') &&( ch[i] <= '9'))
         {
            System.out.print(ch[i]);
         }
      }
   }
   public static void main(String arg[]) {
      Scanner sobj = new Scanner(System.in);
      System.out.print("Enter String : ");
      String str = sobj.nextLine();

      
      strlwrx(str);
   }
}