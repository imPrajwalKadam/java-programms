/*
 3.Write a recursive program which display below pattern. 
Output : 5 4 3 2 1
 */
import java.util.Scanner;

class display{

          static int iCnt = 5;
           void Display()
          {
                    if(iCnt >= 1)
                    {
                              System.out.print(iCnt+"\t");
                              iCnt--;
                              Display();
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


                  dobj.Display();



          }
          
}
