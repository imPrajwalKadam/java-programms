/*
4. Accept N numbers from user and display all such elements which are 
divisible by 3 and 5. 
Input : N : 6 
 Elements : 85 66 3 15 93 88
*/
import java.util.*;

class question4
{
   static void Display(int arr[], int length)
   {
      int i;
      for( i = 0; i<length ; i++)
      {
         if((arr[i]%3 == 0)&&(arr[i]%5 == 0))
         {
            System.out.println( arr[i]);
         }
      }

   }
   public static void main(String srg[])
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter size : ");
      int iNo = sobj.nextInt();
      int arr[]=new int[iNo];

      System.out.println("Enter number of elements : ");
      for(int i = 0 ; i<iNo; i++)
      {
         arr[i] = sobj.nextInt();
      }

      Display(arr,iNo);
      
   }
}