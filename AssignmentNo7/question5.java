/*
Write a program which accept number from user and return difference between 
summation of even digits and summation of odd digits. 
Input : 2395 
Output : -15 (2 - 17) 
Input : 1018 
Output : 6 (8 - 2) 
Input : 8440 
Output : 16 (16 - 0) 
Input : 5733 
Output : -18 (0 - 18)
*/
import java.io.*;
class question5
{
          static int CountRange(int iValue)
          {
                    int iDigit = 0,iAdd1 = 0, iAdd2 = 0, diff = 0;
                    if(iValue < 0)
                    {
                              iValue = -iValue;
                    }
                    while(iValue != 0)
                    {
                              iDigit = iValue % 10;
                              if((iDigit %2) != 0)
                              {
                                        iAdd1 = iAdd1 + iDigit;
                              }
                              else{
                                        iAdd2 = iAdd2 + iDigit;
                              }
                              diff = iAdd1 - iAdd2;

                              iValue = iValue / 10;         
                    }
                    return diff;
          }
          public static void main(String ard[])throws IOException
          {
                    int iret = 0;
                    InputStreamReader in = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(in);

                    System.out.println("Enter number : ");
                    int iNo = Integer.parseInt(br.readLine());
                    iret = CountRange(iNo);
                    System.out.println("difference between summation of even digits and summation of odd digits is  "+iret );
          }
}