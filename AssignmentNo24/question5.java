
/*
5. Write a program which accept string from user and count number of 
white spaces 
Input : "MarvellouS" 
Output : 0 
Input : 'MarvellouS Infosystems'
Output : 1 
Input : 'MarvellouS Infosystems by Piyush Manohar Khairnnar' 
Output : 5 
*/
import java.util.*;

class question5
 {
   static int CountWhite(String str) {
      int iCnt = 0;
      char ch[] = str.toCharArray();
      for(int i = 0; i< str.length();i++)
      {
         if(ch[i] == ' ')
         {
            iCnt++;
         }
      } 
      return iCnt;
   }

   public static void main(String arg[]) {
      Scanner sobj = new Scanner(System.in);
      System.out.print("Enter String: ");
      String str=sobj.nextLine();
      int ret = CountWhite(str);
      System.out.println("Number of whight spaces is "+ret);

      System.gc();
   }
}