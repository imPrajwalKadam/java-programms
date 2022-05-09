/*
4. Accept number from user and display below pattern. 
Input : 4 
Output : # 1 * # 2 * # 3 * # 4 *
*/

class Helper
{
   void pattern(int iNo)
   {
      for(int iCnt = 1; iCnt <= iNo; iCnt++)
      {
                    System.out.print("\t#\t"+iCnt+"\t*\t");
      }
   }
} 
class question4
{
   public static void main(String arg[])
   {
      Helper hobj = new Helper();
      int iNo = Integer.parseInt(arg[0]);
      System.out.println(iNo);
      hobj.pattern(iNo);
   }
}