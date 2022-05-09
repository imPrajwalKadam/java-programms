/*
. Accept number from user and display below pattern. 
Input : 5 
Output : 5 # 4 # 3 # 2 # 1 # 
*/

 class Helper
{
   void pattern(int iNo)
   {
      for(int iCnt = iNo; iCnt > 0; iCnt--)
      {
                    System.out.print(iCnt+"\t # \t");
      }
   }
} 
class question2
{
   public static void main(String arg[])
   {
      Helper hobj = new Helper();
      int iNo = Integer.parseInt(arg[0]);
      System.out.println(iNo);
      hobj.pattern(iNo);
   }
}