/*
2. Accept N numbers from user and return difference between frequency of 
even number and odd numbers. 
Input : N : 7 
 Elements : 85 66 3 80 93 88 90 
Output : 1 (4 -3) 
*/
import java.util.*;

class question2
{
   static int Calculate(int Length,int arr[])
   {
      int iCnt = 0,iCnt1=0;
      for(int i = 0 ; i < Length ; i++)
      {
         if(arr[i]%2 == 0 )
         {
            iCnt++;
         }else{
            iCnt1++;
         }
      }
return iCnt-iCnt1;
   }
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter number ");
      int iNo = sobj.nextInt();
      int arr[] = new int[iNo];
      System.out.println("Enter numer of elements : ");
      for(int i  = 0; i<iNo; i++)
      {
         arr[i] = sobj.nextInt();
      }

      int ret = Calculate(iNo,arr);

      System.out.println("total frequency of even number is : "+ret);

      System.gc();
   }
}