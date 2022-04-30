// .Write a program which accept number from user and return summation of all its 
// non factors. 
// Input : 12 
// Output : 50 
// Input : 10 
// Output : 37
import java.util.*;

public class question4
{
          static int SumNonFact(int iNo) 
          { 
           // Logic
           if(iNo < 0)
           {
                     iNo = -iNo;
           }
           int iAdd = 0;
           for(int iCnt = 1;iCnt != iNo; iCnt++)
           {
                     if(iNo % iCnt != 0)
                     {

                     System.out.println(iCnt);
                     iAdd = iAdd + iCnt;
                     }
           } 
           return iAdd;
          }
          public static void main(String arg[])
          {
                    int iRet = 0;
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter number ");
                    int iValue = sobj.nextInt();
                    iRet = SumNonFact(iValue);
                    System.out.println("Summation of NonFactors is : "+iRet);
          }    
          
}
