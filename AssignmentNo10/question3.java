/*
3. Accept number from user and display below pattern. 
Input : 5 
Output : 1 * 2 * 3 * 4 * 5 * 
*/

class Helper
{
   void pattern(int iNo)
   {
      for(int iCnt = 1; iCnt <= iNo; iCnt++)
      {
                    System.out.print(iCnt+"\t * \t");
      }
   }
} 
class question3
{
   public static void main(String arg[])
   {
      Helper hobj = new Helper();
      int iNo = Integer.parseInt(arg[0]);
      System.out.println(iNo);
      hobj.pattern(iNo);
   }
}