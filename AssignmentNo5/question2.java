// // 2.Write a program which accept number from user and display its factors in  decreasing order. 
// Input : 12 
// Output : 6 4 3 2 1 
import java.util.*;
public class question2 
{
           static void MultFact(int iNo) 
          { 
           // Logic
           if(iNo < 0)
           {
                     iNo = -iNo;
           }
           for(int iCnt = iNo;iCnt>1; iCnt--)
           {
                     if(iNo % iCnt == 0)
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
                    MultFact(iValue);
          }    
}
