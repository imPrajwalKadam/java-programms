/*
 5. Write a recursive program which accept number from user and return its 
reverse number. 
Input : 523 
Output : 325
*/

import java.util.*;
public class question5 {
          static int iRev = 0;
          static int iDigit = 0;


          static int Reverse(int ino)
          {
                    if(ino<0)
                    {
                              ino = -ino;
                    }
                    if(ino>0)
                    {
                              iDigit = ino%10;
                              iRev = ((iRev*10)+iDigit);
                              ino = ino/10;
                              Reverse(ino);
                    }
                    return iRev;
          }

          public static void main(String arg[])
          {
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter Number: ");
                    int ino = sobj.nextInt();
                    int ret = Reverse(ino);
                    System.out.println("Reverse number is : "+ret);
          }
}
