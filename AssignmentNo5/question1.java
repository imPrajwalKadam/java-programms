// 1.Write a program which accept number from user and display its multiplication of factors. 
// Input : 12 
// Output : 144 (1 * 2 * 3 * 4 * 6) 
// Input : 13 
// Output : 1 (1) 
// Input : 10 
// Output : 10 (1 * 2 * 5)
import java.util.*;

class question1
{
          static int MultFact(int iNo)
          {
                    int iMult = 1;
                    for(int i = 1; i != iNo; i++)
                    {
                              if(iNo%i == 0)
                              {
                              System.out.println(i);
                              iMult = iMult * i;
                              }
                    }
                    return iMult;
                  
          }
          public static void main(String arg[])
          {
                    int iRet = 0;
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter number to display its multiplication of factors");
                    int iValue = sobj.nextInt();
                    iRet = MultFact(iValue);
                    System.out.println(iRet);
          }
}