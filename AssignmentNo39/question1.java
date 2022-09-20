   
/*1.
Write a recursive program which accept string from user and count white spaces. 
Input : HE llo WOr lD 
Output : 3 
*/
import java.util.*;

class Recursive {

   static int iCnt = 0;
   static int i = 0;
   static char ch[];

   static int CountSpaces(String str) {

      System.out.println(str);
      ch= str.toCharArray();
      char whtspc = ' ';
      // for(int i = 0;i<ch.length;i++)
      // {
      if (i < ch.length) {
         if (ch[i] == whtspc) {
            iCnt++;
         }
         i++;
         CountSpaces(str);
      }
      return iCnt;
      // }
   }

}

class question1 {
   public static void main(String arg[]) {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter String with sum spaces : ");
      String str = sobj.nextLine();
      Recursive robj = new Recursive();
      int ret = robj.CountSpaces(str);
      System.out.println(ret);
   }
}