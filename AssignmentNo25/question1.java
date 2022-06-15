// 1.Write a program which accept string from user and accept one 
// character. Check whether that character is present in string or not. 
// Input :"Marvellous Multi OS" 
//  e 
// Output : TRUE 
// Input : "Marvellous Multi OS"
//  W 
// Output : FALSE
import java.util.*;
class question1
{
   public static void main(String arg[])
   {
      boolean bret;
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter string : ");
      String str = sobj.nextLine();
      System.out.println("Enter character : ");
      char ch = sobj.next().charAt(0);
      helper hobj = new helper(ch,str);
      bret = hobj.Helper1();
      if(bret == true)
      {
         System.out.println("TRUE");
      }else{
         System.out.println("FALSE");
      }
   }
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
   boolean Helper1()
   {
      int i = 0;
      int iFlag = 0;
      char chr[] = this.str.toCharArray();
      for(i = 0; i< this.str.length() ;i++)
      {
         if(chr[i] == this.ch)
         {
            iFlag = 1;
         }
       
      } 
      if(iFlag == 1)
      {
         return true;         
      }
      else{ 
         return false;
      }
     
   // System.out.println("Entered Character is : "+this.ch);
   // System.out.println("Entered String is : "+this.str);
   }
}