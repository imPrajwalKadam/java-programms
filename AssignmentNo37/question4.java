/*
4.Write a recursive program which display below pattern. 
Output : A B C D E F
*/
import java.util.Scanner;

class display{
          static char ch = 'A';
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
public class question4{
         
          public static void main (String arg[])
          {
                  Scanner sobj = new Scanner(System.in);
                  display dobj = new display();
                  System.out.println("Enter Number : ");
                  int iNum = sobj.nextInt();
                  dobj.Display(iNum);
          }
          
}
