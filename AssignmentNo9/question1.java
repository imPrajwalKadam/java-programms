/*
Write a program which accept range from user and display all even numbers in 
between that range. 
Input : 23 35 
nput : 23 35 
Output : 24 26 28 30 32 34 
Input : 10 18 
Output : 10 12 14 16 18 
Input : 10 10 
Output : 10 
Input : -10 2 
Output : -10 -8 -6 -4 -2 0 2 
Input : 90 18 
Output : Invalid range 
*/
import java.util.*;
class question1
{
          static void RangeDisplay(int iStart,int iEnd)
          {
                    if(iEnd <= iStart )
                    {
                              System.out.print("Invalid range");
                              return;
                    }
                 for(int i = iStart; i <= iEnd ; i++)
                 {
                           System.out.print("\t"+i);
                 }
          }
          public static void main(String arg[])
          {
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("enter Start");
                    int iStart = sobj.nextInt();
                    System.out.println("Enter End");
                    int iEnd = sobj.nextInt();
                    RangeDisplay(iStart,iEnd);
          }
}