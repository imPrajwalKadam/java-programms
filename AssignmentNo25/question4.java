/*
4.Write a program which accept string from user and accept one 
character. Return index of last occurrence of that character. 
Input : "arvellous Multi OS" 
 M 
Output : 11 
Input : "Marvellous Multi OS" 
 W 
Output : -1
*/
import java.util.*;
class question4
{
   public static void main(String arg[])
   {
      int iret;
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter string : ");
      String str = sobj.nextLine();
      System.out.println("Enter character : ");
      char ch = sobj.next().charAt(0);
      helper hobj = new helper(ch,str);
      iret = hobj.Helper1();
      System.out.println("Last Occurrence is  : "+iret);
   }  
}
interface Demo
 {
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
   int Helper1()
   {
      int i = 0;
      char chr[] = this.str.toCharArray();
      for(i = this.str.length()-1; i >= 0 ;i--)
      {
         if(chr[i] == this.ch)
         {
            break;
         }
      } 
      return i;  
   }
}