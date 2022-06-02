/*
3. Accept N numbers from user and accept one another number as NO , 
return index of last occurrence of that NO. 
Input : N : 6 
 NO: 66 
 Elements : 85 66 3 66 93 88 
Output : 3 
Input : N : 6 
 NO: 93 
 Elements : 85 66 3 66 93 88 
Output : 4 
Input : N : 6 
 NO: 12 
 Elements : 85 11 3 15 11 111 
Output : -1
*/   
import java.util.*;
class question3
{
   static void Calculate(int iValue, int Length,int arr[])
   {
      int i=0;
      for(i = Length-1 ; i >= 0 ; i--)
     {
         if(arr[i] == iValue )
         {
            break;
         }
     }
      System.out.println("Last Occerence is :"+i);
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