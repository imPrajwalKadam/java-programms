/*
Write a program which accept number from user and return the count of digits in 
between 3 and 7. 
Input : 2395 
Output : 1 
Input : 1018 
Output : 0 
Input : 4521 
Output : 2 
Input : 9922 
Output : 0 
*/
import java.io.*;
class question3
{
          static int CountRange(int iValue)
          {
                    int iDigit = 0,iCnt = 0;
                    if(iValue < 0)
                    {
                              iValue = -iValue;
                    }
                    while(iValue != 0)
                    {
                              iDigit = iValue % 10;

                              if((iDigit > 3)&&(iDigit < 7 ))
                              {
                                        iCnt++;
                              }
                              iValue = iValue / 10;         
                    }
                    return iCnt;
          }
          public static void main(String ard[])throws IOException
          {
                    int iret = 0;
                    InputStreamReader in = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(in);

                    System.out.println("Enter number : ");
                    int iNo = Integer.parseInt(br.readLine());
                    iret = CountRange(iNo);
                    System.out.println("Range of 3 to 7 is "+iret );
          }
}