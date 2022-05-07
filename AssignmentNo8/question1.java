/*
1.Write a program which accept number from user and print that number of $ & * 
on screen. 
Input : 5 
Output : $ * $ * $ * $ * $ * 
Input : 3 
Output : $ * $ * $ * 
Input : -3 
Output : $ * $ * $ * 
*/
import java.io.*;
import java.util.Scanner;

class question1
{

          static void Pattern(int iNum)
          {
                    if(iNum < 0)
                    {
                              iNum = -iNum;
                    }
                    for(int i = 1; i <= iNum; i++)
                    {
                              System.out.print("\t$\t*");
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