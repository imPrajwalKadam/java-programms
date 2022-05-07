/*
Write a program which accept number from user and print numbers till that 
number. 
Input : 8 
Output : 1 2 3 4 5 6 7 8*/
import java.util.Scanner;

class question2
{

          static void Pattern(int iNum)
          {
                    for(int i = 1; i <= iNum; i++)
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