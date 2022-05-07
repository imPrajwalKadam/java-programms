/*
Write a program which accept range from user and display all even numbers in 
between that range.
Input : 8 
Output : 1 2 3 4 5 6 7 8
*/
import java.util.*;

class question2{
          static void RangeDisplayEven(int iStart,int iEnd)
          {
                    if(iEnd <= iStart )
                    {
                              System.out.print("Invalid range");
                              return;
                    }
                    for(int i = iStart ; i<=iEnd ; i++)
                    {
                              if((i%2 )==0 )
                              {
                                        System.out.print("\t"+i);
                              }
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