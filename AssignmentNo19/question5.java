/*
5. Accept N numbers from user and return product of all odd elements. 
Input : N : 6 
 
 Elements : 15 66 3 70 10 88 
Output : 45 
Input : N : 6 
 
 Elements : 44 66 72 70 10 88 
Output : 0 

*/   
import java.util.*;
class question5
{
   static void Calculate( int Length,int arr[])
   {
      int i=0,iProd = 1;;
      for(i = 0 ; i < Length ; i++)
     {
        if((arr[i]%2) != 0 )
        {
           iProd =arr[i] * iProd ;
        }
     }
     System.out.println("\t"+iProd);

   }
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter number of length ");
      int iNo = sobj.nextInt();
      
      

      int arr[] = new int[iNo];
      System.out.println("Enter numer of elements : ");
      for(int i  = 0; i<iNo; i++)
      {
         arr[i] = sobj.nextInt();
      }
       Calculate( iNo , arr);
       System.gc();
   }
}