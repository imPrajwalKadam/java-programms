/*
4. Accept N numbers from user and accept Range, Display all elements from 
that range 
Input : N : 6 
 Start: 60 
 
 End : 90 
 
 Elements : 85 66 3 76 93 88 
 Output : 66 76 88
*/   
import java.util.*;
class question4
{
   static void Calculate(int start, int end, int Length,int arr[])
   {
      int i=0;
      for(i = 0 ; i < Length ; i++)
     {
        if((arr[i] >= start )&&(arr[i] <= end))
        {
        System.out.println("Values of range is : "+arr[i]);
        }
      }
   }
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter number of length ");
      int iNo = sobj.nextInt();
      
      System.out.println("Enter Starting Value: ");
      int iValue = sobj.nextInt();

      System.out.println("Enter Ending Value: ");
      int iValue1 = sobj.nextInt();

      int arr[] = new int[iNo];
      System.out.println("Enter numer of elements : ");
      for(int i  = 0; i<iNo; i++)
      {
         arr[i] = sobj.nextInt();
      }
       Calculate(iValue , iValue1 , iNo , arr);
       System.gc();
   }
}