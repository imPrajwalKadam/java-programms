
/*
3. Accept character from user. If it is capital then display all the 
characters from the input characters till Z. If input character is small 
then print all the characters in reverse order till a. In other cases 
return directly. 
Input : Q 
Output : Q R S T U V W X Y Z 
Input : m 
Output : m l k j i h g f e d c b a 
*/
import java.util.*;

class question3 {
   static void ChkAlpha(char ch) {
      for (int i = 1; i <= 32; i++) {
         if (('a' <= ch) && ('z' >= ch)) {
            System.out.println(ch);
            ch++;
         }
         else  if (('A' <= ch) && ('Z' >= ch)){
            System.out.println(ch);
            ch++;
         }
      }

   }

   public static void main(String arg[]) {
      Scanner sobj = new Scanner(System.in);
      System.out.print("Enter : ");
      // char ch = sobj.next().charAt(0);
      char ch = sobj.next().charAt(0);

      ChkAlpha(ch);

   }
}