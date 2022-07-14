/*1. Write a recursive program which display below pattern. 
Output : * * * * * 
  */

import java.util.*;

class display
{
          static int iCnt = 1;

         static void Display(int iNo)
          {
                    if(iNo >= iCnt)
                    {
                              System.out.print("\t*");
                              iCnt++;
                              Display(iNo);
                    }

          }
}

class question1
{
          public static void main(String arrg[])
          {
                    Scanner sobj = new Scanner(System.in);

                    System.out.println("enter Number : ");
                    int iNo = sobj.nextInt();

                    display dobj = new display();
                    dobj.Display(iNo);


          }
}