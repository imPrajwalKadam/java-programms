/*
1. Accept N numbers from user and return difference between summation 
of even elements and summation of odd elements. 
Input : N : 6 
 Elements : 85 66 3 80 93 88 
Output : 53 (234 - 181) 
*/
import java.util.*;

class question1
{
   static int Difference(int arr[], int length)
   {
      int iAdd1 = 0,iAdd2 = 0;
      for(int i = 0 ;i < length; i++)
      {
         if(arr[i]%2 == 0)
         {
            iAdd1 = iAdd1 + arr[i];
         }
         else{
            iAdd2 = iAdd2 + arr[i];
         }
      }

      return iAdd1 - iAdd2;
   }
   public static void main(String arg[])throws Exception
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("enter size :");
      int iValue = sobj.nextInt();
      int arr[] = new int[iValue];
      System.out.println("Enter Elements : ");
      for(int i = 0 ; i < iValue ;i++)
      {
         arr[i] = sobj.nextInt();
      }
      int iRet = Difference(arr,iValue);
      System.out.println("Output is : "+iRet);
   }
}