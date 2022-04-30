// .Write a program which accept number from user and display all its non factors. 
// Input : 12 
// Output : 5 7 8 9 10 11 
// Input : 13 
// Output : 2 3 4 5 6 7 8 9 10 11 12

import java.util.*;

public class question3
{
          static void NonFact(int iNo) 
          { 
           // Logic
           if(iNo < 0)
           {
                     iNo = -iNo;
           }
           for(int iCnt = 1;iCnt != iNo; iCnt++)
           {
                     if(iNo % iCnt != 0)
                     {
                     System.out.println(iCnt);
                     }
           } 
          }
          public static void main(String arg[])
          {
                    int iRet = 0;
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter number ");
                    int iValue = sobj.nextInt();
                    NonFact(iValue);
          }    
          
}
