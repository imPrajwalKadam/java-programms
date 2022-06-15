/*
2.Write a program which accept string from user and convert it into 
upper case. 
Input : "Marvellous Multi OS" 
Output : MARVELLOUS MULTI OS 
*/
import java.util.*;

class question2 {
   static void strlwrx(String str) {
      System.out.println(str.toUpperCase());
      }
   public static void main(String arg[]) {
      Scanner sobj = new Scanner(System.in);
      System.out.print("Enter String : ");
      String str = sobj.nextLine();

      
      strlwrx(str);
   }
}