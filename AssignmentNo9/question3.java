/*
Write a program which accept range from user and return addition of all numbers 
in between that range. (Range should contains positive numbers only) 
Input : 23 30 
Output : 212 
Input : 10 18 
Output : 126 
Input : -10 2 
Output : Invalid range 
Input : 90 18 
Output : Invalid range 
*/
import java.util.Scanner;

class question3{
          static void RangeDisplayEven(int iStart,int iEnd)
          {
                    if((iEnd <= iStart) || (iStart < 0 ) || (iEnd < 0 ))
                    {
                              System.out.print("Invalid range");
                              return;
                    }
                    int iAdd = 0;
                    for(int i = iStart ; i<=iEnd ; i++)
                    {
                             iAdd = iAdd + i; 
                    }
                    System.out.print("\t"+iAdd);

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