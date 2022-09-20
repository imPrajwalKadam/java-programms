/*
 2. Write a recursive program which accept number from user and return 
largest digit 
Input : 87983 
Output : 9
 */

import java.util.*;

class question2
{
          static int iDigit = 0;
          static int iMax = 0;

          static int Max(int inum)
          {
                    if(inum>0)
                    {
                              iDigit = inum % 10;
                              if(iDigit > iMax)
                              {
                                        iMax = iDigit;
                              }
                              inum = inum / 10;
                              Max(inum);

                    }
                    return iMax;


          }
          public static void main(String arg[])
          {

                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter number");
                    int iNo = sobj.nextInt();

                    int ret = Max(iNo);
                    System.out.println(ret);
          }
}
