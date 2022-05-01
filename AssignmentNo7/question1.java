/*
1.Write a program which accept number from user and return the count of even digits. 
Input : 2395 
Output : 1 
Input : 1018 
Output : 2 
Input : -1018 
Output : 2 
Input : 8462 
Output : 4 
*/
import java.io.*;


class question1
{
          static int CountEven(int iValue)
          {

                    int iDigit = 0, iCnt = 0;

                    if(iValue < 0)
                    {
                              iValue = -iValue;
                    }
                    while(iValue != 0)
                    {
                              iDigit = iValue % 10;
                              if((iDigit %2) == 0)
                              {
                                        iCnt++;
                              }
                              iValue = iValue / 10;
                    }
                    return iCnt;
          }
          public static void main(String aths[])throws IOException
          {
                    int iret = 0;
                    InputStreamReader in = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(in);

                    System.out.println("Enter Number : ");
                    int iNo = Integer.parseInt(br.readLine());
                    iret = CountEven(iNo);
                    System.out.println(iret);      
          }
}