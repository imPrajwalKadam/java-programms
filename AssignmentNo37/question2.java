import java.util.Scanner;
public class question2 {
          static int iCnt = 1;
          static void Display(int iNo)
          {
                    if(iNo >= iCnt)
                    {
                              System.out.print(iCnt+"\t");
                              iCnt++;
                              Display(iNo);
                    }
                    

          }
          public static void main (String arg[])
          {
                    Scanner sobj = new Scanner(System.in);
                  System.out.println("Enter number : ");
                  int iNo = sobj.nextInt();

                  Display(iNo);



          }
          
}
