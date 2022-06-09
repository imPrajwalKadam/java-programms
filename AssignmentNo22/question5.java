
/*
5. Accept character from user and display its ASCII value in decimal, 
octal and hexadecimal format. 
Input : A 
Output : Decimal 65
Octal 0101 
 Hexadecimal 0X41
*/
import java.util.*;

class question5
 {
   static void ChkAlpha(char ch) {
         System.out.println("Decimal : "+ (int)ch);
         System.out.printf("hexadecimal : %H",ch);
         
   }

   public static void main(String arg[]) {
      Scanner sobj = new Scanner(System.in);
      System.out.print("Enter : ");
      // char ch = sobj.next().charAt(0);
      char ch = sobj.next().charAt(0);

      ChkAlpha(ch);

   }
}