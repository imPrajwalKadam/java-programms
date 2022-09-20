/*
 4. Write a recursive program which accept number from user and return 
smallest digit 
Input : 87983 
Output : 3
 */
import java.util.*;

public class question4 {
          static int iDigit = 0;
          static int iMin=10;
          static int Min(int iNo)
          {
                    if(iNo < 0)
                    {iNo = -iNo;}

                    if(iNo > 0 )
                    {
                              iDigit  = iNo %10;
                              
                              if(iDigit < iMin)
                              {
                                        iMin = iDigit;
                              }
                              iNo = iNo/10;
                              Min(iNo);
                    }
                    return iMin;
          }
          public static void main(String arg[])
          {
                    Scanner sobj = new Scanner(System.in);
                    System.out.println("Enter Number : ");
                    int iNo = sobj.nextInt();

                    int ret = Min(iNo);
                    System.out.println("Minimum digit is : "+ret);
                    System.gc();
          }


          
}
