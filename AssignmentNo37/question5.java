/*
5.Write a recursive program which display below pattern. 
Input : 6 
Output : a b c d e f 
*/
import java.util.Scanner;

class display{
          static char ch = 'a';
          static int iCnt=1;
           void Display(int iNo)
          {
                    if(iCnt <= iNo)
                    {
                              System.out.print(ch+"\t");
                              ch++;
                              iCnt++;
                              Display(iNo);
                      }
          }
}
public class question5{
         
          public static void main (String arg[])
          {
                  Scanner sobj = new Scanner(System.in);
                  display dobj = new display();
                  System.out.println("Enter Number : ");
                  int iNum = sobj.nextInt();
                  dobj.Display(iNum);
          }
          
}
