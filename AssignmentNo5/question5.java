// Write a program which accept number from user and return difference between 
// summation of all its factors and non factors.
// nput : 12 
// Output : -34 (16 - 50) 
// Input : 10 
// Output : -29 (8 - 37)

import java.util.*;

public class question5
{
          static int FactDiff(int iNo) 
          { 
           // Logic
           if(iNo < 0)
           {
                     iNo = -iNo;
           }
           int iAdd1= 0,iAdd2 = 0,ret = 0;
           for(int iCnt = 1;iCnt != iNo; iCnt++)
           {
                     if(iNo % iCnt != 0)
                     {

                     System.out.println(iCnt);
                     iAdd1 = iAdd1 + iCnt;
                     }
                     else{
                              iAdd2 = iAdd2 + iCnt;
                     }
           } 
           return iAdd1-iAdd2;
          }
          public static void main(String arg[])
          {
                    int iRet = 0;
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter number ");
                    int iValue = sobj.nextInt();
                    iRet = FactDiff(iValue);
                    System.out.println("difference of NonFactors is : "+iRet);
          }    
          
}

