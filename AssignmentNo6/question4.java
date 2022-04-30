/*
Write a program which accept number from user and count frequency of 2 in it. 
Input : 2395 
Output : 1 
Input : 1018 
Output : 0 
Input : 9000 
Output : 0 
Input : 922432 
Output : 3
*/
class question4
{
          static int ChkZero(int iNo)         
          {
                    int iDigit = 0,iCnt = 0;
                   if(iNo < 0)
                   {
                             iNo = -iNo; 
                   }
                   while(iNo > 0)
                   {
                             iDigit = iNo %10;
                             if(iDigit  == 4)
                             {
                                       iCnt++;
                             }
                             iNo = iNo/10;
                   }
                   return iCnt;
          }
          public static void main(String aths[])
          {
                    int iRet;
                    int iValue = Integer.parseInt(aths[0]);
                    iRet = ChkZero(iValue);            
                    System.out.println("count of 4 is : " +iRet);  
               
          }
}