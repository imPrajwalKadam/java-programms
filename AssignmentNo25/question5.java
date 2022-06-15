/*
5. Write a program which accept string from user reverse that string 
in place. 
Input : "abcd"
Output : "dcba" 
Input : "abba" 
Output : "abba" 
*/
import java.util.*;
class question5
{
   public static void main(String arg[])
   {
      int iret;
      char ch = 'a';
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter string : ");
      String str = sobj.nextLine();
      // System.out.println("Enter character : ");
      // char ch = sobj.next().charAt(0);

      helper hobj = new helper(ch,str);
       hobj.Helper1();
      // System.out.println("First Occurrence is  : "+iret);
   }
}
interface Demo{
   void addition();
 }
 class helper  
{
   private char ch;
   private String str;

   helper(char ch1,String str1)
   {
      this.ch = ch1;
      this.str = str1; 
      System.out.println("Inside Constructor!!!");
   }
 
   void Helper1()
   {
      int i = 0;
      String strrev = "";
      char chr[] = this.str.toCharArray();
      for(i = 0; i < this.str.length()  ;i++)
      {
         strrev = chr[i] + strrev;
      } 
      System.out.println(strrev);
   }
}
