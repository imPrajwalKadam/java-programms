/*
1. Accept number of rows and number of columns from user and display 
below pattern. 
Input : iRow = 4 iCol = 4 
Output : * # # # 
         * * # # 
         * * * # 
         * * * *
         
         Dry Run::

         j=1,2,3,4,5 !! j=1,2,3,4,5 !! j = 1,2,3,4,5 !! j=1,2,3,4,5 !!

         i=1,2,3,4,5 !!

          1* 2# 3# 4#   
          2* 2* 3# 4#
          3* 3* 3* 4#
          4* 4* 4* 4*

          * # # #   
          * * # #
          * * * #
          * * * *

*/
import java.util.Scanner;

 class Helper
{
   void pattern(int iRow,int iCol)
   {
      for(int i = 1; i<= iRow; i++)
      {
         for(int j = 1 ; j <= iCol ; j++)                 
         {
            if(i>=j)
            {
               System.out.print(i);
               // System.out.print("*\t");
            }else{
               System.out.print(j);
               // System.out.print("#\t");
            }
         }
         System.out.println();
      }

   }
} 
class question1
{
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      Helper hobj = new Helper();
      System.out.println("Enter Number of Rows");
      int iRows = sobj.nextInt();
      System.out.println("Enter Number of Columns");
      int iCol = sobj.nextInt();
      hobj.pattern(iRows,iCol);
   }
}