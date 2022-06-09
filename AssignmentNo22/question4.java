
/*
4. Accept Character from user and check whether it is special symbol 
or not (!, @, #, $, %, ^, &, *). 
Input : % 
Output : TRUE 
Input : d 
Output : FALS
*/
import java.util.*;

class question4 {
   static void ChkAlpha(char ch) {
         if ((('a' <= ch) && ('z' >= ch) )|| (('A' <= ch) && ('Z' >= ch))) {
            System.out.println("FALSE");
         }else{
            System.out.println("TRUE");
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