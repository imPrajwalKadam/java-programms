/*
 3.Write a recursive program which display below pattern. 
Output : 5 4 3 2 1
 */
import java.util.Scanner;

class display{

          static int iCnt = 1;
           void Display(int iNo)
          {
                    if(iCnt <= iNo)
                    {
                              System.out.print(iNo+"\t");
                              // iCnt--;
                              iNo--;
                              Display(iNo);
                    }
          }
}
public class question3 {
         
          public static void main (String arg[])
          {
                  Scanner sobj = new Scanner(System.in);
                  System.out.println("Enter number : ");
                  int iNo = sobj.nextInt();
                  display dobj = new display();


                  dobj.Display(iNo);



          }
          
}
