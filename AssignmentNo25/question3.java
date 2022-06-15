/*
3.Write a program which accept string from user and accept one 
character. Return index of first occurrence of that character. 
Input : "Marvellous Multi OS" 
 M 
Output : 0
input : "Marvellous Multi OS" 
 W 
Output : -1 
Input : "Marvellous Multi OS" 
 e 
Output : 4 
*/
import java.util.*;
class question3
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
      System.out.println("First Occurrence is  : "+iret);
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
 
   int Helper1()
   {
      int i = 0;
      char chr[] = this.str.toCharArray();
      for(i = 0; i < this.str.length() ;i++)
      {
         if(chr[i] == this.ch)
         {
            break;
         }
      } 
      return i;  
   }
}
