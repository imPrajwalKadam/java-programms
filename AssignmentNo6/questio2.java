/*
Write a program which accept number from user and check whether it contains 0 in it or not. 

Input : 2395 
Output : There is no Zero 
Input : 1018 
Output : It Contains Zero 
Input : 9000 
Output : It Contains Zero
*/
class questio2
{
          static boolean ChkZero(int iNo)         
          {
                    int iDigit = 0,iFlag = 0;
                    if(iNo < 0)
                    {
                              iNo = -iNo;
                    }
                    while(iNo != 0)
                    {
                              iDigit = iNo%10;   
                              if(iDigit == 0)
                              {
                                        iFlag = 1;
                              }
                              System.out.print(iDigit);
                              iNo = iNo/10;
                    }
                    if(iFlag == 1)
                    {
                              return true;
                    }
                    else
                    {
                              return false;
                    }
          }
          public static void main(String aths[])
          {
                    boolean bret;
                    int iValue = Integer.parseInt(aths[0]);
                    bret = ChkZero(iValue);              
                    
                    if(bret == true)
                    {
                              System.out.println("Number contains 0 ");
                    }
                    else{

                              System.out.println("Number not contains 0 ");
                    }
          }
}