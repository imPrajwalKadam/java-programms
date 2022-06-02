/*
2. Accept N numbers from user and accept one another number as NO , 
return index of first occurrence of that NO. 
Input : N : 6 
 NO: 66 
 Elements : 85 66 3 66 93 88 
Output : 1

Input : N : 6 
 NO: 12 
 Elements : 85 11 3 15 11 111 
Output : -1 
*/
import java.util.*;

class question2
{
   static void Calculate(int iValue, int Length,int arr[])
   {
      int iCnt = -1;
      for(int i = 0 ; i < Length ; i++)
      {
         if(arr[i] == iValue )
         {
            iCnt++;
            break;
         }
      }
      System.out.println("First Occerence is :"+iCnt);
   }
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter number ");
      int iNo = sobj.nextInt();
      
      System.out.println("Enter Search Value ");
      int iValue = sobj.nextInt();
      int arr[] = new int[iNo];
      System.out.println("Enter numer of elements : ");
      for(int i  = 0; i<iNo; i++)
      {
         arr[i] = sobj.nextInt();
      }

       Calculate(iValue,iNo,arr);
      System.gc();
   }
}