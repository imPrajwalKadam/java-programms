/*
5. Accept N numbers from user and display all such elements which are 
multiples of 11. 
Input : N : 6 
 Elements : 85 66 3 55 93 88 
Output : 66 55 88 
 
   */
  import java.util.*;

class question5
{
   static void Display(int arr[], int length)
   {
      int i;
      for( i = 0; i<length ; i++)
      {
         if(arr[i]%11 == 0)
         {
            System.out.print( "\t"+arr[i]);
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