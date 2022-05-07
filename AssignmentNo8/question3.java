/*
 Write a program which accept number from user and print its numbers line. 
Input : 4 
Output : -4 -3 -2 -1 0 1 2 3 4 */
import java.util.Scanner;

class question3
{

          static void Pattern(int iNum)
          {
                    for(int i = -iNum; i <= iNum; i++)
                    {
                              System.out.print("\t"+i);
                    }
          }
          public static void main(String arg[])
          {
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter Number : ");
                    int iNo = sobj.nextInt();
                    Pattern(iNo);
          }
}