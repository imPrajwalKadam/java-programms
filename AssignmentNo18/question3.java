/*
3. Accept N numbers from user check whether that numbers contains 11 in 
it or not. 
Input : N : 6 
 Elements : 85 66 11 80 93 88 
Output : 11 is present 
Input : N : 6 
 Elements : 85 66 3 80 93 88 
Output : 11 is absen
*/
import java.util.*;

class question3
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
      if(iCnt>0)
      {
         System.out.println("11 is present ");
      }else{
         System.out.println("1 11 is absent ");
      }
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