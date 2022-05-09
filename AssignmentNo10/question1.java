import javax.sound.midi.SysexMessage;

/*
Accept number from user and display below pattern. 
Input : 5 
Output : A B C D E
*/

 class Helper
{
   void pattern(int iNo)
   {
      char ch = 'A';
      for(int i = 0; i < iNo; i++)
      {
         System.out.print("\t"+ch);
         ch++;
      }
   }
} 
class question1
{
   public static void main(String arg[])
   {
      Helper hobj = new Helper();
      int iNo = Integer.parseInt(arg[0]);
      System.out.println(iNo);
      hobj.pattern(iNo);
   }
}