/*
Write a program which accept accept range from user and display all numbers in 
between that range in reverse order. 
Input : 23 35 
Output : 35 34 33 32 31 30 29 28 27 26 25 24 23 
Input : 10 18 
Output : 18 17 16 15 14 13 12 11 10 
Input : 10 10 
Output : 10 
Input : -10 2 
Output : 2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10 
Input : 90 18 
Output : Invalid range
*/
import java.util.Scanner;

class question5{
          static void RangeDisplayEven(int iStart,int iEnd)
          {
                    if((iEnd <= iStart) || (iStart < 0 ) || (iEnd < 0 ))
                    {
                              System.out.print("Invalid range");
                              return;
                    }
                    for(int i = iEnd ; i >= iStart ; i--)
                    {
                        System.out.print("\t"+i);
                    }
          }
          public static void main(String arg[])
          {
                    Scanner sobj = new Scanner(System.in);
                    System.out.print("Enter Starting number : ");
                    int iStart = sobj.nextInt();
                    System.out.print("Enter Ending : ");
                    int iEnd = sobj.nextInt();

                    RangeDisplayEven(iStart,iEnd);
                    
                    
          }
}