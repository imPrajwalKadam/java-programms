/*
1. Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 4 iCol = 4 
Output :
 * # # # 
 * * # # 
 * * * # 
 * * * * 
 
*/
import java.util.*;
class question1
{
   static void helper(int iRow,int iCol)
   {
      for(int i = 1; i <= iRow; i++ )
      {
         for(int j = 0; j <= iCol ; j++)
         {
            if(i >= j )
            {
               System.out.print("*");
            }
            else{
               System.out.print("#");
            }
         }
         System.out.println();
      }
   }
   public static void main(String String[])
   {

      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter Rows : ");
      int iNo1 = sobj.nextInt();
      System.out.println("Enter Columns : ");
      int iNo2 = sobj.nextInt();
      helper(iNo1,iNo2);
   }
}