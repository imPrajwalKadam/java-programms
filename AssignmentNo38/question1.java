/*1. 
Write a recursive program which accept number from user and display below pattern. 
Input : 5 
Output : 5 * 4 * 3 * 2 * 1 *
*/

import java.util.*;

class Recursion{
  static int iCnt = 1;
  void Display(int iNum)
  {
    if(iNum >= iCnt )
    {
      System.out.print(iNum+"\t*\t");
      iNum--;
      Display(iNum);
    }
  }
}
class question1
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number : ");
    int iNum = sobj.nextInt();

    Recursion robj = new Recursion();
    robj.Display(iNum);

  }
}