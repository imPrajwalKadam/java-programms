/*
1. Accept number of rows and number of columns from user and display 
below pattern. 
Input : iRow = 6 iCol = 5
Output : 
         * * * * * 
         * @ @ @ * 
         * @ @ @ * 
         * @ @ @ * 
         * @ @ @ * 
         * * * * *
         

         1
         2 3
         3 4 5
         4 5 6 7
*/
  import java.util.Scanner;
  class Helper
 {
    void pattern(int iRow,int iCol)
    {
      int i, j, k;
       for(i = 1; i<= iRow; i++)
       {

          for( j = 1 ; j <iRow ; j++)
          {             
               System.out.print(" ");
          }
          for( k = 1 ; k < (i*2) ; k++)
          {             
               System.out.print(" "+k);
          }
          System.out.println();
       }
       for( i = iCol; i>= 1; i--)
       {

          for(j = iRow ; j > i ; j--)
          {             
               System.out.print(" ");
          }
          for( k = 1 ; k < (i*2) ; k++)
          {             
               System.out.print(" "+k);
          }
          System.out.println();
       }
    }
 } 
 class question4
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