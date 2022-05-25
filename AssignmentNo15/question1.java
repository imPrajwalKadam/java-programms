/*
Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 4 iCol = 4 
Output : 
 * 
 * * 
 * * * 
 * * * *
 
*/
import java.util.Scanner;
import java.util.regex.Pattern;


class question1
{

   static void pattern(int iRow, int iCol)
   {
      for(int i = 1; i<= iRow; i++)
      {
         for(int j = 1; j<= iCol ; j++)
         {
            if(i >= j  )
            {
               System.out.print(" * ");
            }else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter Number of Rows");
      int iNo1 = sobj.nextInt();

      System.out.println("Enter number of Columns");
      int iNo2 = sobj.nextInt();
      pattern(iNo1,iNo2);

   }
}