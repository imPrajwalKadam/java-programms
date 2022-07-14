/*
4.Write a recursive program which display below pattern. 
Output : A B C D E F
 */
import java.util.Scanner;

class display{
          static char ch = 'A';
           void Display()
          {
                    if(ch <= 'F')
                    {
                              System.out.print(ch+"\t");
                              ch++;
                              Display();
                      }
          }
}
public class question4 {
         
          public static void main (String arg[])
          {
                  Scanner sobj = new Scanner(System.in);
                  display dobj = new display();


                  dobj.Display();
          }
          
}
