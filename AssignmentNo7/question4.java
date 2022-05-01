/*
Write a program which accept number from user and return multiplication of all 
digits. 
Input : 2395 
Output : 270 
Input : 1018 
Output : 8 
Input : 9440 
Output : 144 
Input : 922432 
Output : 864 
*/
import java.io.*;
class question4
{
          static int CountRange(int iValue)
          {
                    int iDigit = 0,iMult = 1;
                    if(iValue < 0)
                    {
                              iValue = -iValue;
                    }
                    while(iValue != 0)
                    {
                              iDigit = iValue % 10;
                              iMult = iMult * iDigit;
                              iValue = iValue / 10;         
                    }
                    return iMult;
          }
          public static void main(String ard[])throws IOException
          {
                    int iret = 0;
                    InputStreamReader in = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(in);

                    System.out.println("Enter number : ");
                    int iNo = Integer.parseInt(br.readLine());
                    iret = CountRange(iNo);
                    System.out.println("Multiplication of all digits is  "+iret );
          }
}