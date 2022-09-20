/*
4. Write a recursive program which accept number from user and return its factorial. 
Input : 5 
Output : 120 
*/
import java.util.Scanner;

class display{
           static int iCnt=1;
           static int iFact = 1;

           int Factorial(int iNo)
          {
                if(iNo < 0)
                {
                        iNo = -iNo;

                }
                if(iNo >= iCnt)
                {
                        iFact = iFact * iCnt;
                        iCnt++;
                        Factorial(iNo);
                }

                return iFact;

          }
}
public class question4{
         
          public static void main (String arg[])
          {
                  Scanner sobj = new Scanner(System.in);
                  display dobj = new display();
                  System.out.println("Enter Number : ");
                  int iNum = sobj.nextInt();
                  int ret = dobj.Factorial(iNum);

                  System.out.println("Factorial of number is : "+ret);
                  System.gc();
          }
          
}
