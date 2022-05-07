/*
4. Write a program which accepts N from user and print all odd numbers up to N. 
Input : 18 
Output : 1 3 5 7 9 11 13
*/
import java.io.*;
import java.util.*;
class question5
{
          static void MultipleDisplay(int iNum)
          {
                    int iMult = 0;
                    for(int i = 1; i <= iNum; i++)
                    {
                                  if(i <= 5)
                                  {
                                        iMult = iNum * i;
                                        System.out.print("\t"+iMult);
                                  }
                    }
          }
          public static void main(String arg[])
          {
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter Number : ");
                    int iNo = sobj.nextInt();
                    MultipleDisplay(iNo);
          }
}         