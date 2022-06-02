/*
4. Accept N numbers from user and return frequency of 11 form it. 
Input : N : 6 
 Elements : 85 66 3 15 93 88 
Output : 0 
Input : N : 6 
 Elements : 85 11 3 15 11 111 
Output : 2
*/
import java.util.*;

class question4
{
   static void Calculate(int Length,int arr[])
   {
      int iCnt = 0;
      for(int i = 0 ; i < Length ; i++)
      {
         if(arr[i] == 11 )
         {
            iCnt++;
         }
      }
    System.out.print("Frequency of 11 is :"+iCnt);
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

       Calculate(iNo,arr);
      System.gc();
   }
}