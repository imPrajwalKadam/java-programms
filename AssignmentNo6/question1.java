/*

Write a program which accept number from user using command line argument and display its digits in reverse order.
Input : 2395 
Output : 5 
         9 
         3 
         2 
*/
class question1
{
          static void DisplayDigit(int iNo)
          {
                    int iDigit = 0;
                    if(iNo < 0)
                    {
                              iNo = -iNo;
                    }
                    while(iNo != 0)
                    {
                              iDigit = iNo%10;
                              System.out.print(iDigit);
                              iNo = iNo/10;
                    }
          }
          public static void main(String aths[])
          {
                    int iValue = Integer.parseInt(aths[0]);
                    DisplayDigit(iValue);                    
          }
}