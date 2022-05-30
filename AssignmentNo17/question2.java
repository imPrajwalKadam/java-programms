/*
2. Accept N numbers from user and display all such elements which are 
divisible by 5. 
Input : N : 6 
 Elements : 85 66 3 80 93 88 
 Output : 85 80 
*/
import java.util.*;
class question2
{
  static void Display(int arr[],int iSize)
  {
     for(int i = 0; i< iSize; i++)
     {
        if((arr[i] % 5) == 0)
        {
           System.out.print("\t"+arr[i]);
        }
     }
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
      Display(arr,iValue);
   }
}