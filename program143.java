//027 ->18->9
//9975 ->30->3
//89457 ->33->6
//8  -> 8
//23 -> 5

import java.util.*;

class Digits
{
   int GenRoot(int iNo)
   {
	   int iSum=iNo;
	   while(iNo>10)
	   {
		   iNo = iSum;
		   iSum = 0;
		   while(iSum != 0)
		   {
		   iSum = iSum + (iNo%10);
		   iNo = iNo/10;
	        }
	    }
	   return iSum; 
   }	
}



class program143
{
	public static void main(String arg[])
	{
		int no,ret;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number:");
		no = sobj.nextInt();
		

		Digits dobj = new Digits();
		ret = dobj.GenRoot(no);
		System.out.println("Generic root is:"+ret);
	}
}
