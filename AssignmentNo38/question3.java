/*

 */
import java.util.Scanner;

class display{

          static int iCnt = 0;
           int strlen(String str)
          {
                // char[] ch = str.toCharArray();
                // for(int i = 1; i<=str.length();i++)
                // {
                //         System.out.println(i);
                // }
                if(str.length() > iCnt )
                {
                        iCnt++;
                        strlen(str);
                }
                return iCnt;
          }
}
public class question3 {
         
          public static void main (String arg[])
          {
                  Scanner sobj = new Scanner(System.in);
                  System.out.println("Enter String : ");
                  String iNo = sobj.nextLine();
                  display dobj = new display();


                  int ret = dobj.strlen(iNo);
                  System.out.print("Count of character is: "+ret);
                  System.gc();
          }
          
}
