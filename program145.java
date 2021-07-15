//armstrong number
//example:153


import java.util.*;
class Numbers
{
	public int Sum(int Arr[])
	{
	int iSum = 0;
	for(int i=0; i<Arr.length;i++)
	{
		iSum = iSum+Arr[i];
	}
	return iSum;
     }
}



class program145	
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 1;
		System.out.println("Enter number pf elements");
		iSize = sobj.nextInt();

		int arr[] = new int[iSize];
		System.out.println("Please enter the values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sobj.nextInt();
		}
		Numbers nobj = new Numbers();
		int iRet =nobj.Sum(arr);
		System.out.println("Addition of number is:"+iRet);
	}
}
