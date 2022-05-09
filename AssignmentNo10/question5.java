/*
Accept number from user and display below pattern. 
Input : 8 
Output : 2 4 6 8 10 12 14 16 
*/

class Helper
{
   void pattern(int iNo)
   {

    int even = iNo * 2;
      for(int iCnt = 1; iCnt <= even; iCnt++)
      {
          if((iCnt % 2) ==0)
          {
                    System.out.println(iCnt);
          }
      }
   }
} 
class question5 
{
   public static void main(String arg[])
   {
      Helper hobj = new Helper();
      int iNo = Integer.parseInt(arg[0]);
      hobj.pattern(iNo);
   }
}