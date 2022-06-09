/*
. Write a program which displays ASCII table. Table contains symbol, 
Decimal, Hexadecimal and Octal representation of every member from 
0 to 255. 
*/
import java.util.*;

class question1
{
   public static void main(String arg[])
   {
      System.out.println("Decimal || character  || Hexadecimal ");
      for(int i = 1; i <= 127; i++)
      {
         System.out.println(i +" \t\t "+(char)i+"\t\t"+(String. format("%x", i)));
      }
   }
}