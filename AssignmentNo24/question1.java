

// 1.Write a program which accept string from user and convert it into 
// lower case. 
// Input : "Marvellous Multi OS" 
// Output : marvellous multi os 

import java.util.*;

class question1 {
   static void strlwrx(String str) {
      System.out.println(str.toLowerCase());
      }
   

   public static void main(String arg[]) {
      Scanner sobj = new Scanner(System.in);
      System.out.print("Enter String : ");
      String str = sobj.nextLine();

      
      strlwrx(str);
   }
}